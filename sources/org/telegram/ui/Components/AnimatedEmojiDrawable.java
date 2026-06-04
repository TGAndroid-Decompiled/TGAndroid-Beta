package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class AnimatedEmojiDrawable extends Drawable {
    private static boolean LOG_MEMORY_LEAK = false;
    public static int attachedCount;
    public static ArrayList attachedDrawable;
    private static final Runnable cleanup = new Runnable() {
        @Override
        public final void run() {
            AnimatedEmojiDrawable.lambda$static$2();
        }
    };
    private static boolean disabledToggleableAnimations;
    private static HashMap dominantColors;
    private static HashMap fetchers;
    private static SparseArray globalEmojiCache;
    private static boolean liteModeKeyboard;
    private static boolean liteModeReactions;
    private String absolutePath;
    private boolean attached;
    private int cacheType;
    private ColorFilter colorFilterToSet;
    private int currentAccount;
    private TLRPC.Document document;
    private long documentId;
    private ArrayList holders;
    private ImageReceiver imageReceiver;
    private boolean imageReceiverEmojiThumb;
    public boolean preloading;
    public int sizedp;
    private ArrayList views;
    private float alpha = 1.0f;
    private Boolean canOverrideColorCached = null;
    private Boolean isDefaultStatusEmojiCached = null;

    public interface ReceivedDocument {
        void run(TLRPC.Document document);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public static void access$200(AnimatedEmojiDrawable animatedEmojiDrawable) {
        animatedEmojiDrawable.updateAttachState();
    }

    public static AnimatedEmojiDrawable make(int i, int i2, long j) {
        return make(i, i2, j, null);
    }

    public static AnimatedEmojiDrawable make(int i, int i2, long j, String str) {
        if (globalEmojiCache == null) {
            globalEmojiCache = new SparseArray();
        }
        int iHash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) globalEmojiCache.get(iHash);
        if (longSparseArray == null) {
            SparseArray sparseArray = globalEmojiCache;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(iHash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) longSparseArray.get(j);
        if (animatedEmojiDrawable != null) {
            return animatedEmojiDrawable;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, j, str);
        longSparseArray.put(j, animatedEmojiDrawable2);
        return animatedEmojiDrawable2;
    }

    public static AnimatedEmojiDrawable make(int i, int i2, TLRPC.Document document) {
        if (globalEmojiCache == null) {
            globalEmojiCache = new SparseArray();
        }
        int iHash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) globalEmojiCache.get(iHash);
        if (longSparseArray == null) {
            SparseArray sparseArray = globalEmojiCache;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(iHash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) longSparseArray.get(document.id);
        if (animatedEmojiDrawable != null) {
            return animatedEmojiDrawable;
        }
        long j = document.id;
        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, i, document);
        longSparseArray.put(j, animatedEmojiDrawable2);
        return animatedEmojiDrawable2;
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
            fetchers = new HashMap();
        }
        EmojiDocumentFetcher emojiDocumentFetcher = (EmojiDocumentFetcher) fetchers.get(Integer.valueOf(i));
        if (emojiDocumentFetcher != null) {
            return emojiDocumentFetcher;
        }
        HashMap map = fetchers;
        Integer numValueOf = Integer.valueOf(i);
        EmojiDocumentFetcher emojiDocumentFetcher2 = new EmojiDocumentFetcher(i);
        map.put(numValueOf, emojiDocumentFetcher2);
        return emojiDocumentFetcher2;
    }

    public static class EmojiDocumentFetcher {
        private final int currentAccount;
        private HashMap emojiDocumentsCache;
        private Runnable fetchRunnable;
        private HashMap loadingDocuments;
        private HashSet toFetchDocuments;
        private Runnable uiDbCallback;

        public EmojiDocumentFetcher(int i) {
            this.currentAccount = i;
        }

        public void fetchDocument(long j, ReceivedDocument receivedDocument) {
            TLRPC.Document document;
            if (j == 0) {
                return;
            }
            synchronized (this) {
                try {
                    HashMap map = this.emojiDocumentsCache;
                    if (map != null && (document = (TLRPC.Document) map.get(Long.valueOf(j))) != null) {
                        if (receivedDocument != null) {
                            receivedDocument.run(document);
                        }
                        return;
                    }
                    if (checkThread()) {
                        if (this.loadingDocuments == null) {
                            this.loadingDocuments = new HashMap();
                        }
                        ArrayList arrayList = (ArrayList) this.loadingDocuments.get(Long.valueOf(j));
                        if (arrayList != null) {
                            arrayList.add(receivedDocument);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(receivedDocument);
                        this.loadingDocuments.put(Long.valueOf(j), arrayList2);
                        if (this.toFetchDocuments == null) {
                            this.toFetchDocuments = new HashSet();
                        }
                        this.toFetchDocuments.add(Long.valueOf(j));
                        if (this.fetchRunnable != null) {
                            return;
                        }
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$fetchDocument$0();
                            }
                        };
                        this.fetchRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void lambda$fetchDocument$0() {
            ArrayList arrayList = new ArrayList(this.toFetchDocuments);
            this.toFetchDocuments.clear();
            loadFromDatabase(arrayList, this.uiDbCallback == null);
            this.fetchRunnable = null;
        }

        private boolean checkThread() {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                return true;
            }
            if (!BuildVars.DEBUG_VERSION) {
                return false;
            }
            FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
            return false;
        }

        private void loadFromDatabase(final ArrayList arrayList, boolean z) {
            if (z) {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$loadFromDatabase$1(arrayList);
                    }
                });
            } else {
                lambda$loadFromDatabase$1(arrayList);
            }
        }

        public void lambda$loadFromDatabase$1(ArrayList arrayList) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (database == null) {
                return;
            }
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data FROM animated_emoji WHERE document_id IN (%s)", TextUtils.join(",", arrayList)), new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet(arrayList);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    try {
                        TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                        if (documentTLdeserialize != null && documentTLdeserialize.id != 0) {
                            arrayList2.add(documentTLdeserialize);
                            hashSet.remove(Long.valueOf(documentTLdeserialize.id));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (nativeByteBufferByteBufferValue != null) {
                        nativeByteBufferByteBufferValue.reuse();
                    }
                }
                processDatabaseResult(arrayList2, hashSet);
                sQLiteCursorQueryFinalized.dispose();
                Runnable runnable = this.uiDbCallback;
                if (runnable != null) {
                    runnable.run();
                    this.uiDbCallback = null;
                }
            } catch (SQLiteException e2) {
                messagesStorage.checkSQLException(e2);
            }
        }

        public void lambda$processDatabaseResult$2(ArrayList arrayList, HashSet hashSet) {
            processDocuments(arrayList);
            if (hashSet.isEmpty()) {
                return;
            }
            loadFromServer(new ArrayList(hashSet));
        }

        private void processDatabaseResult(final ArrayList arrayList, final HashSet hashSet) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                lambda$processDatabaseResult$2(arrayList, hashSet);
            } else {
                NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$processDatabaseResult$3(arrayList, hashSet);
                    }
                });
            }
        }

        public void lambda$processDatabaseResult$3(final ArrayList arrayList, final HashSet hashSet) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processDatabaseResult$2(arrayList, hashSet);
                }
            });
        }

        private void loadFromServer(final ArrayList arrayList) {
            TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
            tL_messages_getCustomEmojiDocuments.document_id = arrayList;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getCustomEmojiDocuments, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadFromServer$6(arrayList, tLObject, tL_error);
                }
            });
        }

        public void lambda$loadFromServer$5(final ArrayList arrayList, final TLObject tLObject) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadFromServer$4(arrayList, tLObject);
                }
            });
        }

        public void lambda$loadFromServer$6(final ArrayList arrayList, final TLObject tLObject, TLRPC.TL_error tL_error) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadFromServer$5(arrayList, tLObject);
                }
            });
        }

        public void lambda$loadFromServer$4(ArrayList arrayList, TLObject tLObject) {
            HashSet hashSet = new HashSet(arrayList);
            if (tLObject instanceof Vector) {
                ArrayList arrayList2 = ((Vector) tLObject).objects;
                putToStorage(arrayList2);
                processDocuments(arrayList2);
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) instanceof TLRPC.Document) {
                        hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList2.get(i)).id));
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                loadFromServer(new ArrayList(hashSet));
            }
        }

        private void putToStorage(final ArrayList arrayList) {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$putToStorage$7(arrayList);
                }
            });
        }

        public void lambda$putToStorage$7(java.util.ArrayList r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedEmojiDrawable.EmojiDocumentFetcher.lambda$putToStorage$7(java.util.ArrayList):void");
        }

        public void processDocuments(ArrayList arrayList) {
            ArrayList arrayList2;
            if (checkThread()) {
                AnimatedEmojiDrawable.updateLiteModeValues();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) instanceof TLRPC.Document) {
                        TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
                        putDocument(document);
                        HashMap map = this.loadingDocuments;
                        if (map != null && (arrayList2 = (ArrayList) map.remove(Long.valueOf(document.id))) != null) {
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                ReceivedDocument receivedDocument = (ReceivedDocument) arrayList2.get(i2);
                                if (receivedDocument != null) {
                                    receivedDocument.run(document);
                                }
                            }
                            arrayList2.clear();
                        }
                    }
                }
            }
        }

        public void putDocument(TLRPC.Document document) {
            if (document == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.emojiDocumentsCache == null) {
                        this.emojiDocumentsCache = new HashMap();
                    }
                    this.emojiDocumentsCache.put(Long.valueOf(document.id), document);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void putDocuments(ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.emojiDocumentsCache == null) {
                        this.emojiDocumentsCache = new HashMap();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Document document = (TLRPC.Document) it.next();
                        this.emojiDocumentsCache.put(Long.valueOf(document.id), document);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public TLRPC.InputStickerSet findStickerSet(long j) {
            synchronized (this) {
                try {
                    HashMap map = this.emojiDocumentsCache;
                    if (map == null) {
                        return null;
                    }
                    TLRPC.Document document = (TLRPC.Document) map.get(Long.valueOf(j));
                    if (document == null) {
                        return null;
                    }
                    return MessageObject.getInputStickerSet(document);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static TLRPC.Document findDocument(int i, long j) {
        EmojiDocumentFetcher documentFetcher = getDocumentFetcher(i);
        if (documentFetcher == null || documentFetcher.emojiDocumentsCache == null) {
            return null;
        }
        return (TLRPC.Document) documentFetcher.emojiDocumentsCache.get(Long.valueOf(j));
    }

    public AnimatedEmojiDrawable(int i, int i2, long j) {
        this.currentAccount = i2;
        this.cacheType = i;
        updateSize();
        this.documentId = j;
        getDocumentFetcher(i2).fetchDocument(j, new ReceivedDocument() {
            @Override
            public final void run(TLRPC.Document document) {
                this.f$0.lambda$new$0(document);
            }
        });
    }

    public void lambda$new$0(TLRPC.Document document) {
        this.document = document;
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
            public final void run(TLRPC.Document document) {
                this.f$0.lambda$new$1(document);
            }
        });
    }

    public void lambda$new$1(TLRPC.Document document) {
        this.document = document;
        initDocument(false);
    }

    public AnimatedEmojiDrawable(int i, int i2, TLRPC.Document document) {
        this.cacheType = i;
        this.currentAccount = i2;
        this.document = document;
        updateSize();
        updateLiteModeValues();
        initDocument(false);
    }

    public AnimatedEmojiDrawable(int i, int i2) {
        this.cacheType = i;
        this.currentAccount = i2;
        updateSize();
        updateLiteModeValues();
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
        if (i == 0 || i == 26) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaint.ascent()) + Math.abs(Theme.chat_msgTextPaint.descent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = Theme.chat_msgTextPaintEmoji;
        if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
            this.sizedp = (int) (((Math.abs(textPaintArr[2].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[2].descent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i == 8) {
            this.sizedp = (int) (((Math.abs(textPaintArr[0].ascent()) + Math.abs(Theme.chat_msgTextPaintEmoji[0].descent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (i == 14 || i == 15 || i == 17) {
            this.sizedp = 100;
            return;
        }
        if (i == 11 || i == 22) {
            this.sizedp = 56;
            return;
        }
        if (i == 27) {
            this.sizedp = 50;
            return;
        }
        if (i == 24) {
            this.sizedp = 140;
            return;
        }
        if (i == 23) {
            this.sizedp = 14;
        } else if (i == 21) {
            this.sizedp = 90;
        } else {
            this.sizedp = 34;
        }
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        return document != null ? document.id : this.documentId;
    }

    public static void updateLiteModeValues() {
        liteModeKeyboard = LiteMode.isEnabled(16388);
        liteModeReactions = LiteMode.isEnabled(8200);
    }

    public TLRPC.Document getDocument() {
        return this.document;
    }

    class AnonymousClass1 extends ImageReceiver {
        AnonymousClass1() {
        }

        @Override
        public void invalidate() {
            AnimatedEmojiDrawable.this.invalidate();
            super.invalidate();
        }

        @Override
        protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
            AnimatedEmojiDrawable.this.invalidate();
            boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
            if (AnimatedEmojiDrawable.this.preloading && hasImageLoaded()) {
                final AnimatedEmojiDrawable animatedEmojiDrawable = AnimatedEmojiDrawable.this;
                animatedEmojiDrawable.preloading = false;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AnimatedEmojiDrawable.access$200(animatedEmojiDrawable);
                    }
                });
            }
            return imageBitmapByKey;
        }
    }

    private void createImageReceiver() {
        if (this.imageReceiver == null) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            this.imageReceiver = anonymousClass1;
            anonymousClass1.setCurrentAccount(this.currentAccount);
            this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (this.cacheType == 12) {
                this.imageReceiver.ignoreNotifications = true;
            }
        }
    }

    public void setupDocument(TLRPC.Document document) {
        this.document = document;
        initDocument(false);
    }

    private void initDocument(boolean z) {
        int i;
        SvgHelper.SvgDrawable svgThumb;
        ImageLocation forDocument;
        String str;
        int i2;
        Drawable emojiDrawable;
        ImageLocation forDocument2;
        int iDp;
        TLRPC.Document document = this.document;
        if (document != null) {
            if (this.imageReceiver == null || this.imageReceiverEmojiThumb || z) {
                int i3 = this.cacheType;
                if ((i3 == 20 || i3 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.imageReceiverEmojiThumb = false;
                createImageReceiver();
                if (this.colorFilterToSet != null && canOverrideColor()) {
                    this.imageReceiver.setColorFilter(this.colorFilterToSet);
                }
                int i4 = this.cacheType;
                if (i4 != 0) {
                    if (i4 == 12) {
                        i4 = 2;
                    }
                    this.imageReceiver.setUniqKeyPrefix(i4 + "_");
                }
                this.imageReceiver.setVideoThumbIsSame(true);
                boolean z2 = (SharedConfig.getDevicePerformanceClass() == 0 && this.cacheType == 5) || (((i = this.cacheType) == 2 || i == 25) && !liteModeKeyboard) || (i == 3 && !liteModeReactions);
                int i5 = this.cacheType;
                if (i5 == 13 || i5 == 16) {
                    z2 = true;
                }
                if (i5 == 24 || i5 == 27) {
                    z2 = false;
                }
                String str2 = this.sizedp + "_" + this.sizedp;
                if (this.cacheType == 12) {
                    str2 = str2 + "_d_nostream";
                }
                int i6 = this.cacheType;
                if (i6 != 17 && i6 != 15 && i6 != 14 && i6 != 8 && ((i6 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && this.cacheType != 12)) {
                    str2 = str2 + "_pcache";
                }
                int i7 = this.cacheType;
                if (i7 != 17 && i7 != 0 && i7 != 26 && i7 != 1 && i7 != 14 && i7 != 15 && i7 != 19 && i7 != 20 && i7 != 21) {
                    str2 = str2 + "_compress";
                }
                if (this.cacheType == 8) {
                    str2 = str2 + "firstframe";
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.document.thumbs, 90);
                if ("video/webm".equals(this.document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(this.document);
                    str2 = str2 + "_g";
                    svgThumb = DocumentObject.getSvgThumb(this.document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f, true);
                } else if ("application/x-tgsticker".equals(this.document.mime_type)) {
                    StringBuilder sb = new StringBuilder();
                    if (this.cacheType != 0) {
                        str = this.cacheType + "_";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(this.documentId);
                    sb.append("@");
                    sb.append(str2);
                    String string = sb.toString();
                    if (SharedConfig.getDevicePerformanceClass() != 0 || (i2 = this.cacheType) == 2 || i2 == 25 || i2 == 22 || !ImageLoader.getInstance().hasLottieMemCache(string)) {
                        SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, this.cacheType == 22 ? 0.8f : 0.2f);
                        if (svgThumb2 != null && MessageObject.isAnimatedStickerDocument(this.document, true)) {
                            svgThumb2.overrideWidthAndHeight(512, 512);
                        }
                        svgThumb = svgThumb2;
                    } else {
                        svgThumb = null;
                    }
                    forDocument = ImageLocation.getForDocument(this.document);
                } else {
                    svgThumb = DocumentObject.getSvgThumb(this.document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f, true);
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(this.document, true)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = null;
                }
                int i8 = this.cacheType;
                if ((i8 != 20 && i8 != 21) || (emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.document, null))) == null) {
                    emojiDrawable = svgThumb;
                }
                if (this.absolutePath != null) {
                    this.imageReceiver.setImageBitmap(new AnimatedFileDrawable(new File(this.absolutePath), true, 0L, 0, null, null, null, 0L, this.currentAccount, true, 512, 512, null));
                } else {
                    int i9 = this.cacheType;
                    if (i9 == 8) {
                        ImageReceiver imageReceiver = this.imageReceiver;
                        TLRPC.Document document2 = this.document;
                        imageReceiver.setImage(null, null, forDocument, str2, null, null, emojiDrawable, document2.size, null, document2, 1);
                    } else if (z2 || (!liteModeKeyboard && i9 != 14)) {
                        forDocument2 = i9 == 16 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document) : null;
                        if ("video/webm".equals(this.document.mime_type)) {
                            ImageReceiver imageReceiver2 = this.imageReceiver;
                            ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str3 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document3 = this.document;
                            imageReceiver2.setImage(null, null, forDocument3, str3, forDocument2, null, emojiDrawable, document3.size, null, document3, 1);
                        } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                            TLRPC.Document document4 = this.document;
                            this.imageReceiver.setImage(forDocument, str2 + "_firstframe", forDocument2, null, emojiDrawable, document4.size, null, document4, 1);
                        } else {
                            ImageReceiver imageReceiver3 = this.imageReceiver;
                            ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str4 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document5 = this.document;
                            imageReceiver3.setImage(forDocument4, str4, forDocument2, null, emojiDrawable, document5.size, null, document5, 1);
                        }
                    } else {
                        forDocument2 = i9 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document) : null;
                        ImageReceiver imageReceiver4 = this.imageReceiver;
                        ImageLocation forDocument5 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                        String str5 = this.sizedp + "_" + this.sizedp;
                        TLRPC.Document document6 = this.document;
                        imageReceiver4.setImage(forDocument, str2, forDocument5, str5, forDocument2, null, emojiDrawable, document6.size, null, document6, 1);
                    }
                }
                updateAutoRepeat(this.imageReceiver);
                int i10 = this.cacheType;
                if (i10 == 13 || i10 == 16 || i10 == 3 || i10 == 5 || i10 == 4 || i10 == 24) {
                    this.imageReceiver.setLayerNum(7);
                }
                int i11 = this.cacheType;
                if (i11 == 9 || i11 == 21 || i11 == 27) {
                    this.imageReceiver.setLayerNum(6656);
                }
                this.imageReceiver.setAspectFit(true);
                int i12 = this.cacheType;
                if (i12 == 12 || i12 == 26 || i12 == 18 || i12 == 8 || i12 == 6 || i12 == 5 || (i12 == 25 && disabledToggleableAnimations)) {
                    this.imageReceiver.setAllowStartAnimation(false);
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    this.imageReceiver.setAutoRepeat(0);
                } else {
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setAllowStartAnimation(true);
                    this.imageReceiver.setAutoRepeat(1);
                }
                this.imageReceiver.setAllowDecodeSingleFrame(true);
                int i13 = this.cacheType;
                if (i13 == 5 || i13 == 6 || i13 == 27) {
                    iDp = AndroidUtilities.dp(6.0f);
                } else {
                    iDp = i13 == 24 ? AndroidUtilities.dp(14.0f) : 0;
                }
                this.imageReceiver.setRoundRadius(iDp);
                updateAttachState();
                invalidate();
            }
        }
    }

    public static void toggleAnimations(int i, boolean z) {
        LongSparseArray longSparseArray;
        ImageReceiver imageReceiver;
        boolean z2 = !z;
        if (disabledToggleableAnimations == z2) {
            return;
        }
        disabledToggleableAnimations = z2;
        if (globalEmojiCache == null || (longSparseArray = (LongSparseArray) globalEmojiCache.get(Objects.hash(Integer.valueOf(i), 25))) == null) {
            return;
        }
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) longSparseArray.valueAt(i2);
            if (animatedEmojiDrawable != null && (imageReceiver = animatedEmojiDrawable.getImageReceiver()) != null) {
                if (z) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setAllowStartAnimation(true);
                    imageReceiver.setAutoRepeat(1);
                    AnimatedFileDrawable animation = imageReceiver.getAnimation();
                    if (animation != null) {
                        animation.setUseSharedQueue(imageReceiver.useSharedAnimationQueue);
                        animation.start();
                    } else {
                        RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    imageReceiver.setAllowStartAnimation(false);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.stopAnimation();
                }
            }
        }
    }

    public void preload() {
        this.preloading = true;
        updateAttachState();
    }

    public void updateAutoRepeat(ImageReceiver imageReceiver) {
        int i = this.cacheType;
        if (i == 7 || i == 9 || i == 10) {
            imageReceiver.setAutoRepeatCount(2);
            return;
        }
        if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5 || i == 22) {
            imageReceiver.setAutoRepeatCount(1);
        } else if (i == 17) {
            imageReceiver.setAutoRepeatCount(0);
        }
    }

    void invalidate() {
        if (this.views != null) {
            for (int i = 0; i < this.views.size(); i++) {
                View view = (View) this.views.get(i);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.holders != null) {
            for (int i2 = 0; i2 < this.holders.size(); i2++) {
                AnimatedEmojiSpan.InvalidateHolder invalidateHolder = (AnimatedEmojiSpan.InvalidateHolder) this.holders.get(i2);
                if (invalidateHolder != null) {
                    invalidateHolder.invalidate();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.document;
        sb.append(document == null ? "null" : MessageObject.findAnimatedEmojiEmoticon(document, null));
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.sizedp);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.sizedp);
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

    public void addViewListening(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                AnimatedEmojiDrawable.this.addView(view2);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                AnimatedEmojiDrawable.this.removeView(view2);
            }
        });
    }

    public void addView(View view) {
        if (view instanceof SelectAnimatedEmojiDialog.EmojiListView) {
            throw new RuntimeException();
        }
        this.preloading = false;
        if (this.views == null) {
            this.views = new ArrayList(10);
        }
        if (!this.views.contains(view)) {
            this.views.add(view);
        }
        updateAttachState();
    }

    public void addView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        if (this.holders == null) {
            this.holders = new ArrayList(10);
        }
        this.preloading = false;
        if (!this.holders.contains(invalidateHolder)) {
            this.holders.add(invalidateHolder);
        }
        updateAttachState();
    }

    public void removeView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        ArrayList arrayList = this.holders;
        if (arrayList != null) {
            arrayList.remove(invalidateHolder);
        }
        this.preloading = false;
        updateAttachState();
    }

    public void removeView(View view) {
        ArrayList arrayList = this.views;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.preloading = false;
        updateAttachState();
    }

    public void clear() {
        ArrayList arrayList = this.holders;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.views;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.preloading = false;
        updateAttachState();
    }

    public void updateAttachState() {
        ArrayList arrayList;
        if (this.imageReceiver == null) {
            return;
        }
        ArrayList arrayList2 = this.views;
        boolean z = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.holders) != null && arrayList.size() > 0) || this.preloading;
        if (z != this.attached) {
            this.attached = z;
            if (z) {
                this.imageReceiver.onAttachedToWindow();
            } else {
                this.imageReceiver.onDetachedFromWindow();
            }
            if (LOG_MEMORY_LEAK) {
                if (attachedDrawable == null) {
                    attachedDrawable = new ArrayList();
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
            if (this.attached) {
                return;
            }
            Runnable runnable = cleanup;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    public static void lambda$static$2() {
        AndroidUtilities.cancelRunOnUIThread(cleanup);
        try {
            if (globalEmojiCache != null) {
                for (int i = 0; i < globalEmojiCache.size(); i++) {
                    LongSparseArray longSparseArray = (LongSparseArray) globalEmojiCache.valueAt(i);
                    int i2 = 0;
                    while (i2 < longSparseArray.size()) {
                        if (!((AnimatedEmojiDrawable) longSparseArray.valueAt(i2)).attached) {
                            longSparseArray.removeAt(i2);
                            i2--;
                        }
                        i2++;
                    }
                }
            }
        } catch (Exception e) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                FileLog.e(e);
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
        if (this.document == null) {
            return false;
        }
        if (!isDefaultStatusEmoji() && !MessageObject.isTextColorEmoji(this.document)) {
            z = false;
        }
        this.canOverrideColorCached = Boolean.valueOf(z);
        return z;
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
            dominantColors = new HashMap();
        }
        Integer num = (Integer) dominantColors.get(Long.valueOf(documentId));
        if (num == null && animatedEmojiDrawable.getImageReceiver() != null && animatedEmojiDrawable.getImageReceiver().getBitmap() != null) {
            HashMap map = dominantColors;
            Long lValueOf = Long.valueOf(documentId);
            Integer numValueOf = Integer.valueOf(AndroidUtilities.getDominantColor(animatedEmojiDrawable.getImageReceiver().getBitmap()));
            map.put(lValueOf, numValueOf);
            num = numValueOf;
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
        private Integer account;
        private int alpha;
        boolean attached;
        private final Rect bounds;
        private int cacheType;
        public boolean center;
        private final AnimatedFloat changeProgress;
        private ColorFilter colorFilter;
        private int colorFilterLastColor;
        private final Drawable[] drawables;
        private boolean hasParticles;
        private boolean invalidateParent;
        private final Runnable invalidateRunnable;
        private Integer lastColor;
        private int offsetX;
        private int offsetY;
        private final OvershootInterpolator overshootInterpolator;
        private View parentView;
        private StarsReactionsSheet.Particles particles;
        private final AnimatedFloat particlesAlpha;
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
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            AnimatedFloat animatedFloat = new AnimatedFloat((View) null, 300L, cubicBezierInterpolator);
            this.changeProgress = animatedFloat;
            AnimatedFloat animatedFloat2 = new AnimatedFloat((View) null, 300L, cubicBezierInterpolator);
            this.particlesAlpha = animatedFloat2;
            this.drawables = new Drawable[2];
            this.alpha = 255;
            this.bounds = new Rect();
            this.invalidateRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            };
            this.parentView = view;
            animatedFloat.setParent(view);
            this.parentView = view;
            animatedFloat2.setParent(view);
            this.size = i;
            this.cacheType = i2;
            this.invalidateParent = z;
        }

        public void setCurrentAccount(int i) {
            this.account = Integer.valueOf(i);
        }

        public void setParentView(View view) {
            this.changeProgress.setParent(view);
            this.particlesAlpha.setParent(view);
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

        public void setParticles(boolean z, boolean z2) {
            if (this.hasParticles == z) {
                return;
            }
            if (z2) {
                if (this.particles == null) {
                    this.particles = new StarsReactionsSheet.Particles(1, 8);
                }
                this.hasParticles = z;
                invalidate();
                return;
            }
            this.hasParticles = z;
            if (z && this.particles == null) {
                this.particles = new StarsReactionsSheet.Particles(1, 8);
            } else if (!z && this.particles != null) {
                this.particles = null;
            }
            this.particlesAlpha.set(z, true);
            invalidate();
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
                        int iIntValue = num.intValue();
                        this.colorFilterLastColor = iIntValue;
                        porterDuffColorFilter = new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
                    } else {
                        porterDuffColorFilter = null;
                    }
                    this.colorFilter = porterDuffColorFilter;
                }
            }
        }

        public void offset(int i, int i2) {
            this.offsetX = i;
            this.offsetY = i2;
        }

        public Integer getColor() {
            return this.lastColor;
        }

        @Override
        public void draw(Canvas canvas) {
            float f = this.changeProgress.set(1.0f);
            this.bounds.set(getBounds());
            this.bounds.offset(this.offsetX, this.offsetY);
            float f2 = this.particlesAlpha.set(this.hasParticles);
            if (f2 > 0.0f) {
                this.particles.setBounds(this.bounds);
                this.particles.process();
                StarsReactionsSheet.Particles particles = this.particles;
                Integer num = this.lastColor;
                particles.draw(canvas, Theme.multAlpha(num == null ? -1 : num.intValue(), f2));
                Choreographer60FpsContent.getInstance().addFrameCallback(this.invalidateRunnable, 15);
            } else {
                Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateRunnable);
            }
            Drawable drawable = this.drawables[1];
            if (drawable != null && f < 1.0f) {
                drawable.setAlpha((int) (this.alpha * (1.0f - f)));
                int intrinsicWidth = this.drawables[1].getIntrinsicWidth() < 0 ? getIntrinsicWidth() : this.drawables[1].getIntrinsicWidth();
                int intrinsicHeight = this.drawables[1].getIntrinsicHeight() < 0 ? getIntrinsicHeight() : this.drawables[1].getIntrinsicHeight();
                Drawable drawable2 = this.drawables[1];
                if (drawable2 instanceof AnimatedEmojiDrawable) {
                    drawable2.setBounds(this.bounds);
                } else if (this.center) {
                    int i = intrinsicWidth / 2;
                    int i2 = intrinsicHeight / 2;
                    drawable2.setBounds(this.bounds.centerX() - i, this.bounds.centerY() - i2, this.bounds.centerX() + i, this.bounds.centerY() + i2);
                } else {
                    Rect rect = this.bounds;
                    int i3 = rect.left;
                    int i4 = intrinsicHeight / 2;
                    int iCenterY = rect.centerY() - i4;
                    Rect rect2 = this.bounds;
                    drawable2.setBounds(i3, iCenterY, rect2.left + intrinsicWidth, rect2.centerY() + i4);
                }
                this.drawables[1].setColorFilter(this.colorFilter);
                this.drawables[1].draw(canvas);
                this.drawables[1].setColorFilter(null);
            }
            if (this.drawables[0] != null) {
                canvas.save();
                int intrinsicWidth2 = this.drawables[0].getIntrinsicWidth() < 0 ? getIntrinsicWidth() : this.drawables[0].getIntrinsicWidth();
                int intrinsicHeight2 = this.drawables[0].getIntrinsicHeight() < 0 ? getIntrinsicHeight() : this.drawables[0].getIntrinsicHeight();
                Drawable drawable3 = this.drawables[0];
                if (drawable3 instanceof AnimatedEmojiDrawable) {
                    if (((AnimatedEmojiDrawable) drawable3).imageReceiver != null) {
                        ((AnimatedEmojiDrawable) this.drawables[0]).imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                    }
                    if (f < 1.0f) {
                        float interpolation = this.overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation, interpolation, this.bounds.centerX(), this.bounds.centerY());
                    }
                    this.drawables[0].setBounds(this.bounds);
                } else if (this.center) {
                    if (f < 1.0f) {
                        float interpolation2 = this.overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation2, interpolation2, this.bounds.centerX(), this.bounds.centerY());
                    }
                    int i5 = intrinsicWidth2 / 2;
                    int i6 = intrinsicHeight2 / 2;
                    this.drawables[0].setBounds(this.bounds.centerX() - i5, this.bounds.centerY() - i6, this.bounds.centerX() + i5, this.bounds.centerY() + i6);
                } else {
                    if (f < 1.0f) {
                        float interpolation3 = this.overshootInterpolator.getInterpolation(f);
                        Rect rect3 = this.bounds;
                        canvas.scale(interpolation3, interpolation3, rect3.left + (intrinsicWidth2 / 2.0f), rect3.centerY());
                    }
                    Drawable drawable4 = this.drawables[0];
                    Rect rect4 = this.bounds;
                    int i7 = rect4.left;
                    int i8 = intrinsicHeight2 / 2;
                    int iCenterY2 = rect4.centerY() - i8;
                    Rect rect5 = this.bounds;
                    drawable4.setBounds(i7, iCenterY2, rect5.left + intrinsicWidth2, rect5.centerY() + i8);
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

        public boolean set(long j, boolean z) {
            return set(j, this.cacheType, z);
        }

        public void resetAnimation() {
            this.changeProgress.set(1.0f, true);
        }

        public float isNotEmpty() {
            return (this.drawables[1] != null ? 1.0f - this.changeProgress.get() : 0.0f) + (this.drawables[0] != null ? this.changeProgress.get() : 0.0f);
        }

        public boolean isEmpty() {
            return this.drawables[0] == null;
        }

        public boolean isStable() {
            return this.drawables[0] != null && this.changeProgress.get() == 1.0f;
        }

        public boolean set(long j, int i, boolean z) {
            Drawable drawable = this.drawables[0];
            if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).getDocumentId() == j) {
                return false;
            }
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable drawable2 = this.drawables[1];
                if (drawable2 != null) {
                    if (this.attached && (drawable2 instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr = this.drawables;
                drawableArr[1] = drawableArr[0];
                Integer num = this.account;
                drawableArr[0] = AnimatedEmojiDrawable.make(num != null ? num.intValue() : UserConfig.selectedAccount, i, j);
                if (this.attached) {
                    ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                }
            } else {
                this.changeProgress.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                Drawable[] drawableArr2 = this.drawables;
                Integer num2 = this.account;
                drawableArr2[0] = AnimatedEmojiDrawable.make(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i, j);
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

        public void set(TLRPC.Document document, boolean z) {
            set(document, this.cacheType, z);
        }

        public void removeOldDrawable() {
            Drawable drawable = this.drawables[1];
            if (drawable != null) {
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this);
                }
                this.drawables[1] = null;
            }
        }

        public void set(TLRPC.Document document, int i, boolean z) {
            Drawable drawable = this.drawables[0];
            if ((drawable instanceof AnimatedEmojiDrawable) && document != null && ((AnimatedEmojiDrawable) drawable).getDocumentId() == document.id) {
                return;
            }
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable drawable2 = this.drawables[1];
                if (drawable2 != null) {
                    if (drawable2 instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr = this.drawables;
                drawableArr[1] = drawableArr[0];
                if (document != null) {
                    Integer num = this.account;
                    drawableArr[0] = AnimatedEmojiDrawable.make(num != null ? num.intValue() : UserConfig.selectedAccount, i, document);
                    if (this.attached) {
                        ((AnimatedEmojiDrawable) this.drawables[0]).addView(this);
                    }
                } else {
                    drawableArr[0] = null;
                }
            } else {
                this.changeProgress.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                if (document != null) {
                    Drawable[] drawableArr2 = this.drawables;
                    Integer num2 = this.account;
                    drawableArr2[0] = AnimatedEmojiDrawable.make(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i, document);
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
            if (z) {
                this.changeProgress.set(0.0f, true);
                Drawable drawable2 = this.drawables[1];
                if (drawable2 != null) {
                    if (this.attached && (drawable2 instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    this.drawables[1] = null;
                }
                Drawable[] drawableArr = this.drawables;
                drawableArr[1] = drawableArr[0];
                drawableArr[0] = drawable;
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
                Drawable drawable = this.drawables[0];
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this);
                }
                Drawable drawable2 = this.drawables[1];
                if (drawable2 instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(this);
                }
            }
        }

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            Drawable drawable = this.drawables[0];
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).addView(this);
            }
            Drawable drawable2 = this.drawables[1];
            if (drawable2 instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable2).addView(this);
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
    }

    public static void updateAll() {
        if (globalEmojiCache == null) {
            return;
        }
        updateLiteModeValues();
        for (int i = 0; i < globalEmojiCache.size(); i++) {
            LongSparseArray longSparseArray = (LongSparseArray) globalEmojiCache.valueAt(i);
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long jKeyAt = longSparseArray.keyAt(i2);
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) longSparseArray.get(jKeyAt);
                if (animatedEmojiDrawable != null && animatedEmojiDrawable.attached) {
                    animatedEmojiDrawable.initDocument(true);
                } else {
                    longSparseArray.remove(jKeyAt);
                }
            }
        }
    }
}
