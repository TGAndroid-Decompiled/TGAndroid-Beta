package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getCustomEmojiDocuments;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.SelectAnimatedEmojiDialog;
public class AnimatedEmojiDrawable extends Drawable {
    private static boolean LOG_MEMORY_LEAK = false;
    public static int attachedCount;
    public static ArrayList<AnimatedEmojiDrawable> attachedDrawable;
    private static HashMap<Long, Integer> dominantColors;
    private static HashMap<Integer, EmojiDocumentFetcher> fetchers;
    private static SparseArray<LongSparseArray<AnimatedEmojiDrawable>> globalEmojiCache;
    private static boolean liteModeKeyboard;
    private static boolean liteModeReactions;
    private String absolutePath;
    private boolean attached;
    private int cacheType;
    private ColorFilter colorFilterToSet;
    private int currentAccount;
    private TLRPC$Document document;
    private long documentId;
    private ArrayList<AnimatedEmojiSpan.InvalidateHolder> holders;
    private ImageReceiver imageReceiver;
    private boolean imageReceiverEmojiThumb;
    public int sizedp;
    private ArrayList<View> views;
    private float alpha = 1.0f;
    private Boolean canOverrideColorCached = null;
    private Boolean isDefaultStatusEmojiCached = null;

    public interface ReceivedDocument {
        void run(TLRPC$Document tLRPC$Document);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public static AnimatedEmojiDrawable make(int i, int i2, long j) {
        return make(i, i2, j, null);
    }

    public static AnimatedEmojiDrawable make(int i, int i2, long j, String str) {
        if (globalEmojiCache == null) {
            globalEmojiCache = new SparseArray<>();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray<AnimatedEmojiDrawable> longSparseArray = globalEmojiCache.get(hash);
        if (longSparseArray == null) {
            SparseArray<LongSparseArray<AnimatedEmojiDrawable>> sparseArray = globalEmojiCache;
            LongSparseArray<AnimatedEmojiDrawable> longSparseArray2 = new LongSparseArray<>();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(j);
        if (animatedEmojiDrawable == null) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, j, str);
            longSparseArray.put(j, animatedEmojiDrawable2);
            return animatedEmojiDrawable2;
        }
        return animatedEmojiDrawable;
    }

    public static AnimatedEmojiDrawable make(int i, int i2, TLRPC$Document tLRPC$Document) {
        if (globalEmojiCache == null) {
            globalEmojiCache = new SparseArray<>();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray<AnimatedEmojiDrawable> longSparseArray = globalEmojiCache.get(hash);
        if (longSparseArray == null) {
            SparseArray<LongSparseArray<AnimatedEmojiDrawable>> sparseArray = globalEmojiCache;
            LongSparseArray<AnimatedEmojiDrawable> longSparseArray2 = new LongSparseArray<>();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = longSparseArray.get(tLRPC$Document.id);
        if (animatedEmojiDrawable == null) {
            long j = tLRPC$Document.id;
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, tLRPC$Document);
            longSparseArray.put(j, animatedEmojiDrawable2);
            return animatedEmojiDrawable2;
        }
        return animatedEmojiDrawable;
    }

    public static int getCacheTypeForEnterView() {
        return SharedConfig.getDevicePerformanceClass() == 0 ? 0 : 2;
    }

    public void setTime(long j) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            if (this.cacheType == 8) {
                j = 0;
            }
            imageReceiver.setCurrentTime(j);
        }
    }

    public void update(long j) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            if (this.cacheType == 8) {
                j = 0;
            }
            if (imageReceiver.getLottieAnimation() != null) {
                this.imageReceiver.getLottieAnimation().updateCurrentFrame(j, true);
            }
            if (this.imageReceiver.getAnimation() != null) {
                this.imageReceiver.getAnimation().updateCurrentFrame(j, true);
            }
        }
    }

    public static EmojiDocumentFetcher getDocumentFetcher(int i) {
        if (fetchers == null) {
            fetchers = new HashMap<>();
        }
        EmojiDocumentFetcher emojiDocumentFetcher = fetchers.get(Integer.valueOf(i));
        if (emojiDocumentFetcher == null) {
            HashMap<Integer, EmojiDocumentFetcher> hashMap = fetchers;
            Integer valueOf = Integer.valueOf(i);
            EmojiDocumentFetcher emojiDocumentFetcher2 = new EmojiDocumentFetcher(i);
            hashMap.put(valueOf, emojiDocumentFetcher2);
            return emojiDocumentFetcher2;
        }
        return emojiDocumentFetcher;
    }

    public static class EmojiDocumentFetcher {
        private final int currentAccount;
        private HashMap<Long, TLRPC$Document> emojiDocumentsCache;
        private Runnable fetchRunnable;
        private HashMap<Long, ArrayList<ReceivedDocument>> loadingDocuments;
        private HashSet<Long> toFetchDocuments;
        private Runnable uiDbCallback;

        public EmojiDocumentFetcher(int i) {
            this.currentAccount = i;
        }

        public void setUiDbCallback(Runnable runnable) {
            this.uiDbCallback = runnable;
        }

        public void fetchDocument(long j, ReceivedDocument receivedDocument) {
            TLRPC$Document tLRPC$Document;
            if (j == 0) {
                return;
            }
            synchronized (this) {
                HashMap<Long, TLRPC$Document> hashMap = this.emojiDocumentsCache;
                if (hashMap != null && (tLRPC$Document = hashMap.get(Long.valueOf(j))) != null) {
                    if (receivedDocument != null) {
                        receivedDocument.run(tLRPC$Document);
                    }
                } else if (checkThread()) {
                    if (this.loadingDocuments == null) {
                        this.loadingDocuments = new HashMap<>();
                    }
                    ArrayList<ReceivedDocument> arrayList = this.loadingDocuments.get(Long.valueOf(j));
                    if (arrayList != null) {
                        arrayList.add(receivedDocument);
                        return;
                    }
                    ArrayList<ReceivedDocument> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(receivedDocument);
                    this.loadingDocuments.put(Long.valueOf(j), arrayList2);
                    if (this.toFetchDocuments == null) {
                        this.toFetchDocuments = new HashSet<>();
                    }
                    this.toFetchDocuments.add(Long.valueOf(j));
                    if (this.fetchRunnable != null) {
                        return;
                    }
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$fetchDocument$0();
                        }
                    };
                    this.fetchRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable);
                }
            }
        }

        public void lambda$fetchDocument$0() {
            ArrayList<Long> arrayList = new ArrayList<>(this.toFetchDocuments);
            this.toFetchDocuments.clear();
            loadFromDatabase(arrayList, this.uiDbCallback == null);
            this.fetchRunnable = null;
        }

        private boolean checkThread() {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
                    return false;
                }
                return false;
            }
            return true;
        }

        private void loadFromDatabase(final ArrayList<Long> arrayList, boolean z) {
            if (z) {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromDatabase$1(arrayList);
                    }
                });
            } else {
                lambda$loadFromDatabase$1(arrayList);
            }
        }

        public void lambda$loadFromDatabase$1(ArrayList<Long> arrayList) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (database == null) {
                return;
            }
            try {
                SQLiteCursor queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data FROM animated_emoji WHERE document_id IN (%s)", TextUtils.join(",", arrayList)), new Object[0]);
                ArrayList<Object> arrayList2 = new ArrayList<>();
                HashSet<Long> hashSet = new HashSet<>(arrayList);
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    try {
                        TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.id != 0) {
                            arrayList2.add(TLdeserialize);
                            hashSet.remove(Long.valueOf(TLdeserialize.id));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
                processDatabaseResult(arrayList2, hashSet);
                queryFinalized.dispose();
                Runnable runnable = this.uiDbCallback;
                if (runnable != null) {
                    runnable.run();
                    this.uiDbCallback = null;
                }
            } catch (SQLiteException e2) {
                messagesStorage.checkSQLException(e2);
            }
        }

        public void lambda$processDatabaseResult$2(ArrayList<Object> arrayList, HashSet<Long> hashSet) {
            processDocuments(arrayList);
            if (hashSet.isEmpty()) {
                return;
            }
            loadFromServer(new ArrayList<>(hashSet));
        }

        private void processDatabaseResult(final ArrayList<Object> arrayList, final HashSet<Long> hashSet) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                lambda$processDatabaseResult$2(arrayList, hashSet);
            } else {
                NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$processDatabaseResult$3(arrayList, hashSet);
                    }
                });
            }
        }

        public void lambda$processDatabaseResult$3(final ArrayList arrayList, final HashSet hashSet) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$processDatabaseResult$2(arrayList, hashSet);
                }
            });
        }

        private void loadFromServer(final ArrayList<Long> arrayList) {
            TLRPC$TL_messages_getCustomEmojiDocuments tLRPC$TL_messages_getCustomEmojiDocuments = new TLRPC$TL_messages_getCustomEmojiDocuments();
            tLRPC$TL_messages_getCustomEmojiDocuments.document_id = arrayList;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getCustomEmojiDocuments, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromServer$6(arrayList, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$loadFromServer$5(final ArrayList arrayList, final TLObject tLObject) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromServer$4(arrayList, tLObject);
                }
            });
        }

        public void lambda$loadFromServer$6(final ArrayList arrayList, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromServer$5(arrayList, tLObject);
                }
            });
        }

        public void lambda$loadFromServer$4(ArrayList arrayList, TLObject tLObject) {
            HashSet hashSet = new HashSet(arrayList);
            if (tLObject instanceof TLRPC$Vector) {
                ArrayList<Object> arrayList2 = ((TLRPC$Vector) tLObject).objects;
                putToStorage(arrayList2);
                processDocuments(arrayList2);
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) instanceof TLRPC$Document) {
                        hashSet.remove(Long.valueOf(((TLRPC$Document) arrayList2.get(i)).id));
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                loadFromServer(new ArrayList<>(hashSet));
            }
        }

        private void putToStorage(final ArrayList<Object> arrayList) {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$putToStorage$7(arrayList);
                }
            });
        }

        public void lambda$putToStorage$7(java.util.ArrayList r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedEmojiDrawable.EmojiDocumentFetcher.lambda$putToStorage$7(java.util.ArrayList):void");
        }

        public void processDocuments(ArrayList<?> arrayList) {
            ArrayList<ReceivedDocument> remove;
            if (checkThread()) {
                AnimatedEmojiDrawable.updateLiteModeValues();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) instanceof TLRPC$Document) {
                        TLRPC$Document tLRPC$Document = (TLRPC$Document) arrayList.get(i);
                        putDocument(tLRPC$Document);
                        HashMap<Long, ArrayList<ReceivedDocument>> hashMap = this.loadingDocuments;
                        if (hashMap != null && (remove = hashMap.remove(Long.valueOf(tLRPC$Document.id))) != null) {
                            for (int i2 = 0; i2 < remove.size(); i2++) {
                                ReceivedDocument receivedDocument = remove.get(i2);
                                if (receivedDocument != null) {
                                    receivedDocument.run(tLRPC$Document);
                                }
                            }
                            remove.clear();
                        }
                    }
                }
            }
        }

        public void putDocument(TLRPC$Document tLRPC$Document) {
            if (tLRPC$Document == null) {
                return;
            }
            synchronized (this) {
                if (this.emojiDocumentsCache == null) {
                    this.emojiDocumentsCache = new HashMap<>();
                }
                this.emojiDocumentsCache.put(Long.valueOf(tLRPC$Document.id), tLRPC$Document);
            }
        }

        public TLRPC$InputStickerSet findStickerSet(long j) {
            synchronized (this) {
                HashMap<Long, TLRPC$Document> hashMap = this.emojiDocumentsCache;
                if (hashMap == null) {
                    return null;
                }
                TLRPC$Document tLRPC$Document = hashMap.get(Long.valueOf(j));
                if (tLRPC$Document == null) {
                    return null;
                }
                return MessageObject.getInputStickerSet(tLRPC$Document);
            }
        }
    }

    public static TLRPC$Document findDocument(int i, long j) {
        EmojiDocumentFetcher documentFetcher = getDocumentFetcher(i);
        if (documentFetcher == null || documentFetcher.emojiDocumentsCache == null) {
            return null;
        }
        return (TLRPC$Document) documentFetcher.emojiDocumentsCache.get(Long.valueOf(j));
    }

    public AnimatedEmojiDrawable(int i, int i2, long j) {
        this.currentAccount = i2;
        this.cacheType = i;
        updateSize();
        this.documentId = j;
        getDocumentFetcher(i2).fetchDocument(j, new ReceivedDocument() {
            @Override
            public final void run(TLRPC$Document tLRPC$Document) {
                AnimatedEmojiDrawable.this.lambda$new$0(tLRPC$Document);
            }
        });
    }

    public void lambda$new$0(TLRPC$Document tLRPC$Document) {
        this.document = tLRPC$Document;
        initDocument(false);
    }

    public AnimatedEmojiDrawable(int i, int i2, long j, String str) {
        this.currentAccount = i2;
        this.cacheType = i;
        updateSize();
        this.documentId = j;
        this.absolutePath = str;
        getDocumentFetcher(i2).fetchDocument(j, new ReceivedDocument() {
            @Override
            public final void run(TLRPC$Document tLRPC$Document) {
                AnimatedEmojiDrawable.this.lambda$new$1(tLRPC$Document);
            }
        });
    }

    public void lambda$new$1(TLRPC$Document tLRPC$Document) {
        this.document = tLRPC$Document;
        initDocument(false);
    }

    public AnimatedEmojiDrawable(int i, int i2, TLRPC$Document tLRPC$Document) {
        this.cacheType = i;
        this.currentAccount = i2;
        this.document = tLRPC$Document;
        updateSize();
        updateLiteModeValues();
        initDocument(false);
    }

    public void setupEmojiThumb(String str) {
        int i = this.cacheType;
        if ((i == 20 || i == 21) && !TextUtils.isEmpty(str) && this.imageReceiver == null) {
            createImageReceiver();
            this.imageReceiverEmojiThumb = true;
            this.imageReceiver.setImageBitmap(Emoji.getEmojiDrawable(str));
            this.imageReceiver.setCrossfadeWithOldImage(true);
        }
    }

    private void updateSize() {
        int i = this.cacheType;
        if (i == 0) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaint.ascent()) + Math.abs(Theme.chat_msgTextPaint.descent())) * 1.15f) / AndroidUtilities.density);
        } else if (i == 1 || i == 4 || i == 19 || i == 20 || i == 21) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[2].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[2].descent())) * 1.15f) / AndroidUtilities.density);
        } else if (i == 8) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[0].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[0].descent())) * 1.15f) / AndroidUtilities.density);
        } else if (i == 14 || i == 15 || i == 17) {
            this.sizedp = 100;
        } else {
            this.sizedp = 34;
        }
    }

    public long getDocumentId() {
        TLRPC$Document tLRPC$Document = this.document;
        return tLRPC$Document != null ? tLRPC$Document.id : this.documentId;
    }

    public static void updateLiteModeValues() {
        liteModeKeyboard = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        liteModeReactions = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    }

    public TLRPC$Document getDocument() {
        return this.document;
    }

    private void createImageReceiver() {
        if (this.imageReceiver == null) {
            ImageReceiver imageReceiver = new ImageReceiver() {
                @Override
                public void invalidate() {
                    AnimatedEmojiDrawable.this.invalidate();
                    super.invalidate();
                }

                @Override
                public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                    AnimatedEmojiDrawable.this.invalidate();
                    return super.setImageBitmapByKey(drawable, str, i, z, i2);
                }
            };
            this.imageReceiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (this.cacheType == 12) {
                this.imageReceiver.ignoreNotifications = true;
            }
        }
    }

    private void initDocument(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedEmojiDrawable.initDocument(boolean):void");
    }

    public void updateAutoRepeat(ImageReceiver imageReceiver) {
        int i = this.cacheType;
        if (i == 7 || i == 9 || i == 10) {
            imageReceiver.setAutoRepeatCount(2);
        } else if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5) {
            imageReceiver.setAutoRepeatCount(1);
        } else if (i == 17) {
            imageReceiver.setAutoRepeatCount(0);
        }
    }

    void invalidate() {
        if (this.views != null) {
            for (int i = 0; i < this.views.size(); i++) {
                View view = this.views.get(i);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.holders != null) {
            for (int i2 = 0; i2 < this.holders.size(); i2++) {
                AnimatedEmojiSpan.InvalidateHolder invalidateHolder = this.holders.get(i2);
                if (invalidateHolder != null) {
                    invalidateHolder.invalidate();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimatedEmojiDrawable{");
        TLRPC$Document tLRPC$Document = this.document;
        sb.append(tLRPC$Document == null ? "null" : MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document, null));
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void draw(Canvas canvas) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        imageReceiver.setImageCoords(getBounds());
        this.imageReceiver.setAlpha(this.alpha);
        this.imageReceiver.draw(canvas);
    }

    public void draw(Canvas canvas, android.graphics.Rect rect, float f) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        imageReceiver.setImageCoords(rect);
        this.imageReceiver.setAlpha(f);
        this.imageReceiver.draw(canvas);
    }

    public void draw(Canvas canvas, ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder, boolean z) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        imageReceiver.setAlpha(this.alpha);
        this.imageReceiver.draw(canvas, backgroundThreadDrawHolder);
    }

    public void addView(View view) {
        if (view instanceof SelectAnimatedEmojiDialog.EmojiListView) {
            throw new RuntimeException();
        }
        if (this.views == null) {
            this.views = new ArrayList<>(10);
        }
        if (!this.views.contains(view)) {
            this.views.add(view);
        }
        updateAttachState();
    }

    public void addView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        if (this.holders == null) {
            this.holders = new ArrayList<>(10);
        }
        if (!this.holders.contains(invalidateHolder)) {
            this.holders.add(invalidateHolder);
        }
        updateAttachState();
    }

    public void removeView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        ArrayList<AnimatedEmojiSpan.InvalidateHolder> arrayList = this.holders;
        if (arrayList != null) {
            arrayList.remove(invalidateHolder);
        }
        updateAttachState();
    }

    public void removeView(View view) {
        ArrayList<View> arrayList = this.views;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        updateAttachState();
    }

    private void updateAttachState() {
        ArrayList<AnimatedEmojiSpan.InvalidateHolder> arrayList;
        if (this.imageReceiver == null) {
            return;
        }
        ArrayList<View> arrayList2 = this.views;
        boolean z = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.holders) != null && arrayList.size() > 0);
        if (z != this.attached) {
            this.attached = z;
            if (z) {
                this.imageReceiver.onAttachedToWindow();
            } else {
                this.imageReceiver.onDetachedFromWindow();
            }
            if (LOG_MEMORY_LEAK) {
                if (attachedDrawable == null) {
                    attachedDrawable = new ArrayList<>();
                }
                if (this.attached) {
                    attachedCount++;
                    attachedDrawable.add(this);
                } else {
                    attachedCount--;
                    attachedDrawable.remove(this);
                }
                Log.d("animatedDrawable", "attached count " + attachedCount);
            }
        }
    }

    public boolean canOverrideColor() {
        boolean z = true;
        if (this.cacheType == 19) {
            return true;
        }
        Boolean bool = this.canOverrideColorCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.document != null) {
            if (!isDefaultStatusEmoji() && !MessageObject.isTextColorEmoji(this.document)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.canOverrideColorCached = valueOf;
            return valueOf.booleanValue();
        }
        return false;
    }

    public boolean isDefaultStatusEmoji() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedEmojiDrawable.isDefaultStatusEmoji():boolean");
    }

    public static boolean isDefaultStatusEmoji(AnimatedEmojiDrawable animatedEmojiDrawable) {
        return animatedEmojiDrawable != null && animatedEmojiDrawable.isDefaultStatusEmoji();
    }

    @Override
    public int getAlpha() {
        return (int) (this.alpha * 255.0f);
    }

    @Override
    public void setAlpha(int i) {
        float f = i / 255.0f;
        this.alpha = f;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f);
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.imageReceiver == null || this.document == null) {
            this.colorFilterToSet = colorFilter;
        } else if (canOverrideColor()) {
            this.imageReceiver.setColorFilter(colorFilter);
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public static int getDominantColor(AnimatedEmojiDrawable animatedEmojiDrawable) {
        if (animatedEmojiDrawable == null) {
            return 0;
        }
        long documentId = animatedEmojiDrawable.getDocumentId();
        if (documentId == 0) {
            return 0;
        }
        if (dominantColors == null) {
            dominantColors = new HashMap<>();
        }
        Integer num = dominantColors.get(Long.valueOf(documentId));
        if (num == null && animatedEmojiDrawable.getImageReceiver() != null && animatedEmojiDrawable.getImageReceiver().getBitmap() != null) {
            HashMap<Long, Integer> hashMap = dominantColors;
            Long valueOf = Long.valueOf(documentId);
            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(animatedEmojiDrawable.getImageReceiver().getBitmap()));
            hashMap.put(valueOf, valueOf2);
            num = valueOf2;
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static class WrapSizeDrawable extends Drawable {
        private int alpha = 255;
        private Drawable drawable;
        int height;
        int width;

        public WrapSizeDrawable(Drawable drawable, int i, int i2) {
            this.drawable = drawable;
            this.width = i;
            this.height = i2;
        }

        public Drawable getDrawable() {
            return this.drawable;
        }

        @Override
        public void draw(Canvas canvas) {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.drawable.setAlpha(this.alpha);
                this.drawable.draw(canvas);
            }
        }

        @Override
        public int getIntrinsicWidth() {
            return this.width;
        }

        @Override
        public int getIntrinsicHeight() {
            return this.height;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i;
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }

        @Override
        public int getOpacity() {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
    }

    public static class SwapAnimatedEmojiDrawable extends Drawable implements AnimatedEmojiSpan.InvalidateHolder {
        private int alpha;
        boolean attached;
        private int cacheType;
        public boolean center;
        private AnimatedFloat changeProgress;
        private ColorFilter colorFilter;
        private int colorFilterLastColor;
        private Drawable[] drawables;
        private boolean invalidateParent;
        private Integer lastColor;
        private OvershootInterpolator overshootInterpolator;
        private View parentView;
        private RenderNode renderNode;
        private boolean renderNodeForceUpdate;
        private float renderedNodeWithProgress;
        private View secondParent;
        private int size;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public SwapAnimatedEmojiDrawable(View view, int i) {
            this(view, false, i, 7);
        }

        public SwapAnimatedEmojiDrawable(View view, boolean z, int i) {
            this(view, z, i, 7);
        }

        public SwapAnimatedEmojiDrawable(View view, int i, int i2) {
            this(view, false, i, i2);
        }

        public SwapAnimatedEmojiDrawable(View view, boolean z, int i, int i2) {
            this.center = false;
            this.overshootInterpolator = new OvershootInterpolator(2.0f);
            AnimatedFloat animatedFloat = new AnimatedFloat((View) null, 300L, CubicBezierInterpolator.EASE_OUT);
            this.changeProgress = animatedFloat;
            this.drawables = new Drawable[2];
            this.alpha = 255;
            this.renderedNodeWithProgress = -1.0f;
            this.parentView = view;
            animatedFloat.setParent(view);
            this.size = i;
            this.cacheType = i2;
            this.invalidateParent = z;
        }

        public void setParentView(View view) {
            this.changeProgress.setParent(view);
            this.parentView = view;
        }

        public void play() {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            ImageReceiver imageReceiver;
            if (!(getDrawable() instanceof AnimatedEmojiDrawable) || (imageReceiver = (animatedEmojiDrawable = (AnimatedEmojiDrawable) getDrawable()).getImageReceiver()) == null) {
                return;
            }
            animatedEmojiDrawable.updateAutoRepeat(imageReceiver);
            imageReceiver.startAnimation();
        }

        public void setColor(Integer num) {
            PorterDuffColorFilter porterDuffColorFilter;
            Integer num2 = this.lastColor;
            if (num2 == null && num == null) {
                return;
            }
            if (num2 == null || !num2.equals(num)) {
                this.lastColor = num;
                if (num == null || this.colorFilterLastColor != num.intValue()) {
                    if (num != null) {
                        int intValue = num.intValue();
                        this.colorFilterLastColor = intValue;
                        porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                    } else {
                        porterDuffColorFilter = null;
                    }
                    this.colorFilter = porterDuffColorFilter;
                }
            }
        }

        public Integer getColor() {
            return this.lastColor;
        }

        @Override
        public void draw(Canvas canvas) {
            float f = this.changeProgress.set(1.0f);
            android.graphics.Rect bounds = getBounds();
            boolean z = this.renderNode != null && canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 29;
            RenderNode renderNode = this.renderNode;
            if (renderNode == null || (z && (!renderNode.hasDisplayList() || Math.abs(this.renderedNodeWithProgress - f) > 0.1f || this.renderNodeForceUpdate))) {
                if (z) {
                    this.renderNode.setPosition(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
                }
                RecordingCanvas beginRecording = z ? this.renderNode.beginRecording() : canvas;
                if (z) {
                    beginRecording.translate((-bounds.centerX()) + (getIntrinsicWidth() / 2.0f), (-bounds.centerY()) + (getIntrinsicHeight() / 2.0f));
                }
                int i = z ? 255 : this.alpha;
                Drawable[] drawableArr = this.drawables;
                if (drawableArr[1] != null && f < 1.0f) {
                    drawableArr[1].setAlpha((int) (i * (1.0f - f)));
                    Drawable[] drawableArr2 = this.drawables;
                    if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                        drawableArr2[1].setBounds(bounds);
                    } else if (this.center) {
                        drawableArr2[1].setBounds(bounds.centerX() - (this.drawables[1].getIntrinsicWidth() / 2), bounds.centerY() - (this.drawables[1].getIntrinsicHeight() / 2), bounds.centerX() + (this.drawables[1].getIntrinsicWidth() / 2), bounds.centerY() + (this.drawables[1].getIntrinsicHeight() / 2));
                    } else {
                        drawableArr2[1].setBounds(bounds.left, bounds.centerY() - (this.drawables[1].getIntrinsicHeight() / 2), bounds.left + this.drawables[1].getIntrinsicWidth(), bounds.centerY() + (this.drawables[1].getIntrinsicHeight() / 2));
                    }
                    this.drawables[1].setColorFilter(this.colorFilter);
                    this.drawables[1].draw(beginRecording);
                    this.drawables[1].setColorFilter(null);
                }
                if (this.drawables[0] != null) {
                    beginRecording.save();
                    Drawable[] drawableArr3 = this.drawables;
                    if (drawableArr3[0] instanceof AnimatedEmojiDrawable) {
                        if (((AnimatedEmojiDrawable) drawableArr3[0]).imageReceiver != null) {
                            ((AnimatedEmojiDrawable) this.drawables[0]).imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                        }
                        if (f < 1.0f) {
                            float interpolation = this.overshootInterpolator.getInterpolation(f);
                            beginRecording.scale(interpolation, interpolation, bounds.centerX(), bounds.centerY());
                        }
                        this.drawables[0].setBounds(bounds);
                    } else if (this.center) {
                        if (f < 1.0f) {
                            float interpolation2 = this.overshootInterpolator.getInterpolation(f);
                            beginRecording.scale(interpolation2, interpolation2, bounds.centerX(), bounds.centerY());
                        }
                        this.drawables[0].setBounds(bounds.centerX() - (this.drawables[0].getIntrinsicWidth() / 2), bounds.centerY() - (this.drawables[0].getIntrinsicHeight() / 2), bounds.centerX() + (this.drawables[0].getIntrinsicWidth() / 2), bounds.centerY() + (this.drawables[0].getIntrinsicHeight() / 2));
                    } else {
                        if (f < 1.0f) {
                            float interpolation3 = this.overshootInterpolator.getInterpolation(f);
                            beginRecording.scale(interpolation3, interpolation3, bounds.left + (this.drawables[0].getIntrinsicWidth() / 2.0f), bounds.centerY());
                        }
                        this.drawables[0].setBounds(bounds.left, bounds.centerY() - (this.drawables[0].getIntrinsicHeight() / 2), bounds.left + this.drawables[0].getIntrinsicWidth(), bounds.centerY() + (this.drawables[0].getIntrinsicHeight() / 2));
                    }
                    this.drawables[0].setAlpha(i);
                    this.drawables[0].setColorFilter(this.colorFilter);
                    this.drawables[0].draw(beginRecording);
                    this.drawables[0].setColorFilter(null);
                    beginRecording.restore();
                }
                if (z) {
                    this.renderNode.endRecording();
                }
                this.renderedNodeWithProgress = f;
                this.renderNodeForceUpdate = false;
            }
            if (Build.VERSION.SDK_INT < 29 || this.renderNode == null || !canvas.isHardwareAccelerated()) {
                return;
            }
            this.renderNode.setAlpha(this.alpha / 255.0f);
            canvas.save();
            canvas.translate(bounds.centerX() - (getIntrinsicWidth() / 2.0f), bounds.centerY() - (getIntrinsicHeight() / 2.0f));
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }

        public Drawable getDrawable() {
            return this.drawables[0];
        }

        public boolean set(long j, boolean z) {
            return set(j, this.cacheType, z);
        }

        public void resetAnimation() {
            this.changeProgress.set(1.0f, true);
        }

        public float isNotEmpty() {
            return (this.drawables[1] != null ? 1.0f - this.changeProgress.get() : 0.0f) + (this.drawables[0] != null ? this.changeProgress.get() : 0.0f);
        }

        public boolean set(long j, int i, boolean z) {
            Drawable[] drawableArr = this.drawables;
            if ((drawableArr[0] instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawableArr[0]).getDocumentId() == j) {
                return false;
            }
            this.renderNodeForceUpdate = true;
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable[] drawableArr2 = this.drawables;
                if (drawableArr2[1] != null) {
                    if (this.attached && (drawableArr2[1] instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawableArr2[1]).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr3 = this.drawables;
                drawableArr3[1] = drawableArr3[0];
                drawableArr3[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, j);
                if (this.attached) {
                    ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                }
            } else {
                this.changeProgress.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                this.drawables[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, j);
                if (z2) {
                    attach();
                }
            }
            this.lastColor = null;
            this.colorFilter = null;
            this.colorFilterLastColor = 0;
            play();
            invalidate();
            return true;
        }

        public void set(TLRPC$Document tLRPC$Document, boolean z) {
            set(tLRPC$Document, this.cacheType, z);
        }

        public void removeOldDrawable() {
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[1] != null) {
                if (drawableArr[1] instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawableArr[1]).removeView(this);
                }
                this.drawables[1] = null;
            }
        }

        public void set(TLRPC$Document tLRPC$Document, int i, boolean z) {
            Drawable[] drawableArr = this.drawables;
            if ((drawableArr[0] instanceof AnimatedEmojiDrawable) && tLRPC$Document != null && ((AnimatedEmojiDrawable) drawableArr[0]).getDocumentId() == tLRPC$Document.id) {
                return;
            }
            this.renderNodeForceUpdate = true;
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable[] drawableArr2 = this.drawables;
                if (drawableArr2[1] != null) {
                    if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawableArr2[1]).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr3 = this.drawables;
                drawableArr3[1] = drawableArr3[0];
                if (tLRPC$Document != null) {
                    drawableArr3[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, tLRPC$Document);
                    if (this.attached) {
                        ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                    }
                } else {
                    drawableArr3[0] = null;
                }
            } else {
                this.changeProgress.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                if (tLRPC$Document != null) {
                    this.drawables[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, tLRPC$Document);
                } else {
                    this.drawables[0] = null;
                }
                if (z2) {
                    attach();
                }
            }
            this.lastColor = null;
            this.colorFilter = null;
            this.colorFilterLastColor = 0;
            play();
            invalidate();
        }

        public void set(Drawable drawable, boolean z) {
            if (this.drawables[0] == drawable) {
                return;
            }
            this.renderNodeForceUpdate = true;
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable[] drawableArr = this.drawables;
                if (drawableArr[1] != null) {
                    if (this.attached && (drawableArr[1] instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawableArr[1]).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr2 = this.drawables;
                drawableArr2[1] = drawableArr2[0];
                drawableArr2[0] = drawable;
            } else {
                this.changeProgress.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                this.drawables[0] = drawable;
                if (z2) {
                    attach();
                }
            }
            this.lastColor = null;
            this.colorFilter = null;
            this.colorFilterLastColor = 0;
            play();
            invalidate();
        }

        public void detach() {
            if (this.attached) {
                this.attached = false;
                this.renderNodeForceUpdate = true;
                Drawable[] drawableArr = this.drawables;
                if (drawableArr[0] instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawableArr[0]).removeView(this);
                }
                Drawable[] drawableArr2 = this.drawables;
                if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawableArr2[1]).removeView(this);
                }
            }
        }

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            this.renderNodeForceUpdate = true;
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[0] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr[0]).addView(this);
            }
            Drawable[] drawableArr2 = this.drawables;
            if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr2[1]).addView(this);
            }
        }

        @Override
        public int getIntrinsicWidth() {
            return this.size;
        }

        @Override
        public int getIntrinsicHeight() {
            return this.size;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public void invalidate() {
            View view = this.parentView;
            if (view != null) {
                if (this.invalidateParent && (view.getParent() instanceof View)) {
                    ((View) this.parentView.getParent()).invalidate();
                } else {
                    this.parentView.invalidate();
                }
            }
            View view2 = this.secondParent;
            if (view2 != null) {
                view2.invalidate();
            }
            invalidateSelf();
        }

        public void setSecondParent(View view) {
            this.secondParent = view;
        }

        public void cacheNode() {
            if (Build.VERSION.SDK_INT >= 29) {
                RenderNode renderNode = new RenderNode("SwapAnimatedEmojiDrawable");
                this.renderNode = renderNode;
                renderNode.setClipToBounds(false);
            }
        }
    }

    public static void updateAll() {
        if (globalEmojiCache == null) {
            return;
        }
        updateLiteModeValues();
        for (int i = 0; i < globalEmojiCache.size(); i++) {
            LongSparseArray<AnimatedEmojiDrawable> valueAt = globalEmojiCache.valueAt(i);
            for (int i2 = 0; i2 < valueAt.size(); i2++) {
                long keyAt = valueAt.keyAt(i2);
                AnimatedEmojiDrawable animatedEmojiDrawable = valueAt.get(keyAt);
                if (animatedEmojiDrawable != null && animatedEmojiDrawable.attached) {
                    animatedEmojiDrawable.initDocument(true);
                } else {
                    valueAt.remove(keyAt);
                }
            }
        }
    }
}
