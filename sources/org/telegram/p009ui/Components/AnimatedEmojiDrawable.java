package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AnimatedEmojiSpan;
import org.telegram.p009ui.Components.Premium.PremiumLockIconView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getCustomEmojiDocuments;
import org.telegram.tgnet.TLRPC$Vector;

public class AnimatedEmojiDrawable extends Drawable {
    private static HashMap<Long, Integer> dominantColors;
    private static HashMap<Integer, EmojiDocumentFetcher> fetchers;
    private static HashMap<Integer, HashMap<Long, AnimatedEmojiDrawable>> globalEmojiCache;
    private String absolutePath;
    private boolean attached;
    private int cacheType;
    private ColorFilter colorFilterToSet;
    private int currentAccount;
    private TLRPC$Document document;
    private long documentId;
    private ArrayList<AnimatedEmojiSpan.InvalidateHolder> holders;
    private ImageReceiver imageReceiver;
    public int rawDrawIndex;
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
            globalEmojiCache = new HashMap<>();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        HashMap<Long, AnimatedEmojiDrawable> hashMap = globalEmojiCache.get(Integer.valueOf(hash));
        if (hashMap == null) {
            HashMap<Integer, HashMap<Long, AnimatedEmojiDrawable>> hashMap2 = globalEmojiCache;
            Integer valueOf = Integer.valueOf(hash);
            HashMap<Long, AnimatedEmojiDrawable> hashMap3 = new HashMap<>();
            hashMap2.put(valueOf, hashMap3);
            hashMap = hashMap3;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = hashMap.get(Long.valueOf(j));
        if (animatedEmojiDrawable == null) {
            Long valueOf2 = Long.valueOf(j);
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, j, str);
            hashMap.put(valueOf2, animatedEmojiDrawable2);
            return animatedEmojiDrawable2;
        }
        return animatedEmojiDrawable;
    }

    public static AnimatedEmojiDrawable make(int i, int i2, TLRPC$Document tLRPC$Document) {
        if (globalEmojiCache == null) {
            globalEmojiCache = new HashMap<>();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        HashMap<Long, AnimatedEmojiDrawable> hashMap = globalEmojiCache.get(Integer.valueOf(hash));
        if (hashMap == null) {
            HashMap<Integer, HashMap<Long, AnimatedEmojiDrawable>> hashMap2 = globalEmojiCache;
            Integer valueOf = Integer.valueOf(hash);
            HashMap<Long, AnimatedEmojiDrawable> hashMap3 = new HashMap<>();
            hashMap2.put(valueOf, hashMap3);
            hashMap = hashMap3;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = hashMap.get(Long.valueOf(tLRPC$Document.f865id));
        if (animatedEmojiDrawable == null) {
            Long valueOf2 = Long.valueOf(tLRPC$Document.f865id);
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, tLRPC$Document);
            hashMap.put(valueOf2, animatedEmojiDrawable2);
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

        public EmojiDocumentFetcher(int i) {
            this.currentAccount = i;
        }

        public void fetchDocument(long j, ReceivedDocument receivedDocument) {
            TLRPC$Document tLRPC$Document;
            synchronized (this) {
                HashMap<Long, TLRPC$Document> hashMap = this.emojiDocumentsCache;
                if (hashMap != null && (tLRPC$Document = hashMap.get(Long.valueOf(j))) != null) {
                    receivedDocument.run(tLRPC$Document);
                } else if (checkThread()) {
                    if (receivedDocument != null) {
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
                    }
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
            loadFromDatabase(arrayList);
            this.fetchRunnable = null;
        }

        private boolean checkThread() {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.m33e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
                    return false;
                }
                return false;
            }
            return true;
        }

        private void loadFromDatabase(final ArrayList<Long> arrayList) {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromDatabase$2(arrayList);
                }
            });
        }

        public void lambda$loadFromDatabase$2(ArrayList arrayList) {
            SQLiteDatabase database = MessagesStorage.getInstance(this.currentAccount).getDatabase();
            try {
                SQLiteCursor queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data FROM animated_emoji WHERE document_id IN (%s)", TextUtils.join(",", arrayList)), new Object[0]);
                final ArrayList arrayList2 = new ArrayList();
                final HashSet hashSet = new HashSet(arrayList);
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    try {
                        TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.f865id != 0) {
                            arrayList2.add(TLdeserialize);
                            hashSet.remove(Long.valueOf(TLdeserialize.f865id));
                        }
                    } catch (Exception e) {
                        FileLog.m32e(e);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromDatabase$1(arrayList2, hashSet);
                    }
                });
                queryFinalized.dispose();
            } catch (SQLiteException e2) {
                FileLog.m32e(e2);
            }
        }

        public void lambda$loadFromDatabase$1(ArrayList arrayList, HashSet hashSet) {
            processDocuments(arrayList);
            if (hashSet.isEmpty()) {
                return;
            }
            loadFromServer(new ArrayList<>(hashSet));
        }

        private void loadFromServer(final ArrayList<Long> arrayList) {
            TLRPC$TL_messages_getCustomEmojiDocuments tLRPC$TL_messages_getCustomEmojiDocuments = new TLRPC$TL_messages_getCustomEmojiDocuments();
            tLRPC$TL_messages_getCustomEmojiDocuments.document_id = arrayList;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getCustomEmojiDocuments, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromServer$4(arrayList, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$loadFromServer$4(final ArrayList arrayList, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$loadFromServer$3(arrayList, tLObject);
                }
            });
        }

        public void lambda$loadFromServer$3(ArrayList arrayList, TLObject tLObject) {
            HashSet hashSet = new HashSet(arrayList);
            if (tLObject instanceof TLRPC$Vector) {
                ArrayList<Object> arrayList2 = ((TLRPC$Vector) tLObject).objects;
                putToStorage(arrayList2);
                processDocuments(arrayList2);
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) instanceof TLRPC$Document) {
                        hashSet.remove(Long.valueOf(((TLRPC$Document) arrayList2.get(i)).f865id));
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
                    AnimatedEmojiDrawable.EmojiDocumentFetcher.this.lambda$putToStorage$5(arrayList);
                }
            });
        }

        public void lambda$putToStorage$5(java.util.ArrayList r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AnimatedEmojiDrawable.EmojiDocumentFetcher.lambda$putToStorage$5(java.util.ArrayList):void");
        }

        public void processDocuments(ArrayList<?> arrayList) {
            ArrayList<ReceivedDocument> remove;
            if (checkThread()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) instanceof TLRPC$Document) {
                        TLRPC$Document tLRPC$Document = (TLRPC$Document) arrayList.get(i);
                        putDocument(tLRPC$Document);
                        HashMap<Long, ArrayList<ReceivedDocument>> hashMap = this.loadingDocuments;
                        if (hashMap != null && (remove = hashMap.remove(Long.valueOf(tLRPC$Document.f865id))) != null) {
                            for (int i2 = 0; i2 < remove.size(); i2++) {
                                remove.get(i2).run(tLRPC$Document);
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
                this.emojiDocumentsCache.put(Long.valueOf(tLRPC$Document.f865id), tLRPC$Document);
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
        initDocument(false);
    }

    private void updateSize() {
        int i = this.cacheType;
        if (i == 0) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaint.ascent()) + Math.abs(Theme.chat_msgTextPaint.descent())) * 1.15f) / AndroidUtilities.density);
        } else if (i == 1 || i == 4) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[2].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[2].descent())) * 1.15f) / AndroidUtilities.density);
        } else if (i == 8) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[0].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[0].descent())) * 1.15f) / AndroidUtilities.density);
        } else {
            this.sizedp = 34;
        }
    }

    public long getDocumentId() {
        TLRPC$Document tLRPC$Document = this.document;
        return tLRPC$Document != null ? tLRPC$Document.f865id : this.documentId;
    }

    public TLRPC$Document getDocument() {
        return this.document;
    }

    private void initDocument(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AnimatedEmojiDrawable.initDocument(boolean):void");
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

    public void drawRaw(Canvas canvas, boolean z, int i) {
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        if (imageReceiver.getLottieAnimation() != null) {
            RLottieDrawable lottieAnimation = this.imageReceiver.getLottieAnimation();
            if (z) {
                lottieAnimation.currentFrame = (lottieAnimation.currentFrame + Math.round((lottieAnimation.getFramesCount() / (((float) lottieAnimation.getDuration()) / 1000.0f)) / 30.0f)) % lottieAnimation.getFramesCount();
            }
            lottieAnimation.setBounds(getBounds());
            lottieAnimation.drawFrame(canvas, lottieAnimation.currentFrame);
        } else if (this.imageReceiver.getAnimation() != null) {
            this.imageReceiver.getAnimation().drawFrame(canvas, z ? i / 30 : 0);
        } else {
            this.imageReceiver.setImageCoords(getBounds());
            this.imageReceiver.setAlpha(this.alpha);
            this.imageReceiver.draw(canvas);
        }
    }

    public void draw(Canvas canvas, Rect rect, float f) {
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
        }
    }

    public boolean canOverrideColor() {
        Boolean bool = this.canOverrideColorCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (this.document != null) {
            Boolean valueOf = Boolean.valueOf((isDefaultStatusEmoji() || MessageObject.isTextColorEmoji(this.document)) ? true : true);
            this.canOverrideColorCached = valueOf;
            return valueOf.booleanValue();
        }
        return false;
    }

    public boolean isDefaultStatusEmoji() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AnimatedEmojiDrawable.isDefaultStatusEmoji():boolean");
    }

    public static boolean isDefaultStatusEmoji(Drawable drawable) {
        if (drawable instanceof AnimatedEmojiDrawable) {
            return isDefaultStatusEmoji((AnimatedEmojiDrawable) drawable);
        }
        return false;
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
            Integer valueOf2 = Integer.valueOf(PremiumLockIconView.getDominantColor(animatedEmojiDrawable.getImageReceiver().getBitmap()));
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
        private int cacheType;
        public boolean center;
        private AnimatedFloat changeProgress;
        private ColorFilter colorFilter;
        private Drawable[] drawables;
        private boolean invalidateParent;
        private Integer lastColor;
        private OvershootInterpolator overshootInterpolator;
        private View parentView;
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
            this.parentView = view;
            animatedFloat.setParent(view);
            this.size = i;
            this.cacheType = i2;
            this.invalidateParent = z;
        }

        public void setParentView(View view) {
            removeParentView(this.parentView);
            this.parentView = view;
            addParentView(view);
            this.changeProgress.setParent(view);
            this.parentView = view;
        }

        public void addParentView(View view) {
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[0] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr[0]).addView(view);
            }
            Drawable[] drawableArr2 = this.drawables;
            if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr2[1]).addView(view);
            }
        }

        public void removeParentView(View view) {
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[0] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr[0]).removeView(view);
            }
            Drawable[] drawableArr2 = this.drawables;
            if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr2[1]).removeView(view);
            }
        }

        public void play() {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            ImageReceiver imageReceiver;
            if (!(getDrawable() instanceof AnimatedEmojiDrawable) || (imageReceiver = (animatedEmojiDrawable = (AnimatedEmojiDrawable) getDrawable()).getImageReceiver()) == null) {
                return;
            }
            if (animatedEmojiDrawable.cacheType == 7 || animatedEmojiDrawable.cacheType == 9 || animatedEmojiDrawable.cacheType == 10) {
                imageReceiver.setAutoRepeatCount(2);
            } else if (this.cacheType == 11) {
                imageReceiver.setAutoRepeatCount(1);
            }
            imageReceiver.startAnimation();
        }

        public void setColor(Integer num) {
            Integer num2 = this.lastColor;
            if (num2 == null && num == null) {
                return;
            }
            if (num2 == null || !num2.equals(num)) {
                this.lastColor = num;
                this.colorFilter = num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN) : null;
            }
        }

        public Integer getColor() {
            return this.lastColor;
        }

        @Override
        public void draw(Canvas canvas) {
            float f = this.changeProgress.set(1.0f);
            Rect bounds = getBounds();
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[1] != null && f < 1.0f) {
                drawableArr[1].setAlpha((int) (this.alpha * (1.0f - f)));
                Drawable[] drawableArr2 = this.drawables;
                if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                    drawableArr2[1].setBounds(bounds);
                } else if (this.center) {
                    drawableArr2[1].setBounds(bounds.centerX() - (this.drawables[1].getIntrinsicWidth() / 2), bounds.centerY() - (this.drawables[1].getIntrinsicHeight() / 2), bounds.centerX() + (this.drawables[1].getIntrinsicWidth() / 2), bounds.centerY() + (this.drawables[1].getIntrinsicHeight() / 2));
                } else {
                    drawableArr2[1].setBounds(bounds.left, bounds.centerY() - (this.drawables[1].getIntrinsicHeight() / 2), bounds.left + this.drawables[1].getIntrinsicWidth(), bounds.centerY() + (this.drawables[1].getIntrinsicHeight() / 2));
                }
                this.drawables[1].setColorFilter(this.colorFilter);
                this.drawables[1].draw(canvas);
                this.drawables[1].setColorFilter(null);
            }
            if (this.drawables[0] != null) {
                canvas.save();
                Drawable[] drawableArr3 = this.drawables;
                if (drawableArr3[0] instanceof AnimatedEmojiDrawable) {
                    if (((AnimatedEmojiDrawable) drawableArr3[0]).imageReceiver != null) {
                        ((AnimatedEmojiDrawable) this.drawables[0]).imageReceiver.setRoundRadius(AndroidUtilities.m36dp(4.0f));
                    }
                    if (f < 1.0f) {
                        float interpolation = this.overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation, interpolation, bounds.centerX(), bounds.centerY());
                    }
                    this.drawables[0].setBounds(bounds);
                } else if (this.center) {
                    if (f < 1.0f) {
                        float interpolation2 = this.overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation2, interpolation2, bounds.centerX(), bounds.centerY());
                    }
                    this.drawables[0].setBounds(bounds.centerX() - (this.drawables[0].getIntrinsicWidth() / 2), bounds.centerY() - (this.drawables[0].getIntrinsicHeight() / 2), bounds.centerX() + (this.drawables[0].getIntrinsicWidth() / 2), bounds.centerY() + (this.drawables[0].getIntrinsicHeight() / 2));
                } else {
                    if (f < 1.0f) {
                        float interpolation3 = this.overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation3, interpolation3, bounds.left + (this.drawables[0].getIntrinsicWidth() / 2.0f), bounds.centerY());
                    }
                    this.drawables[0].setBounds(bounds.left, bounds.centerY() - (this.drawables[0].getIntrinsicHeight() / 2), bounds.left + this.drawables[0].getIntrinsicWidth(), bounds.centerY() + (this.drawables[0].getIntrinsicHeight() / 2));
                }
                this.drawables[0].setAlpha(this.alpha);
                this.drawables[0].setColorFilter(this.colorFilter);
                this.drawables[0].draw(canvas);
                this.drawables[0].setColorFilter(null);
                canvas.restore();
            }
        }

        public Drawable getDrawable() {
            return this.drawables[0];
        }

        public void set(long j, boolean z) {
            set(j, this.cacheType, z);
        }

        public void set(long j, int i, boolean z) {
            Drawable[] drawableArr = this.drawables;
            if ((drawableArr[0] instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawableArr[0]).getDocumentId() == j) {
                return;
            }
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
                drawableArr3[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, j);
                ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
            } else {
                this.changeProgress.set(1.0f, true);
                detach();
                this.drawables[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, j);
                ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
            }
            this.lastColor = -1;
            this.colorFilter = null;
            play();
            invalidate();
        }

        public void set(TLRPC$Document tLRPC$Document, boolean z) {
            set(tLRPC$Document, this.cacheType, z);
        }

        public void set(TLRPC$Document tLRPC$Document, int i, boolean z) {
            Drawable[] drawableArr = this.drawables;
            if ((drawableArr[0] instanceof AnimatedEmojiDrawable) && tLRPC$Document != null && ((AnimatedEmojiDrawable) drawableArr[0]).getDocumentId() == tLRPC$Document.f865id) {
                return;
            }
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
                    ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                } else {
                    drawableArr3[0] = null;
                }
            } else {
                this.changeProgress.set(1.0f, true);
                detach();
                if (tLRPC$Document != null) {
                    this.drawables[0] = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, i, tLRPC$Document);
                    ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                } else {
                    this.drawables[0] = null;
                }
            }
            this.lastColor = -1;
            this.colorFilter = null;
            play();
            invalidate();
        }

        public void set(Drawable drawable, boolean z) {
            if (this.drawables[0] == drawable) {
                return;
            }
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable[] drawableArr = this.drawables;
                if (drawableArr[1] != null) {
                    if (drawableArr[1] instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawableArr[1]).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr2 = this.drawables;
                drawableArr2[1] = drawableArr2[0];
                drawableArr2[0] = drawable;
            } else {
                this.changeProgress.set(1.0f, true);
                detach();
                this.drawables[0] = drawable;
            }
            this.lastColor = -1;
            this.colorFilter = null;
            play();
            invalidate();
        }

        public void detach() {
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[0] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr[0]).removeView(this);
            }
            Drawable[] drawableArr2 = this.drawables;
            if (drawableArr2[1] instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawableArr2[1]).removeView(this);
            }
        }

        public void attach() {
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
        }
    }

    public static void lightModeChanged() {
        for (HashMap<Long, AnimatedEmojiDrawable> hashMap : globalEmojiCache.values()) {
            Iterator it = new ArrayList(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                AnimatedEmojiDrawable animatedEmojiDrawable = hashMap.get(l);
                if (animatedEmojiDrawable.attached) {
                    animatedEmojiDrawable.initDocument(true);
                } else {
                    hashMap.remove(l);
                }
            }
        }
    }
}
