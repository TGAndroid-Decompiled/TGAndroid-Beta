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
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.StickerSetCell$$ExternalSyntheticLambda5;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class AnimatedEmojiDrawable extends Drawable {
    public static final ChatActivity$$ExternalSyntheticLambda470 cleanup = new ChatActivity$$ExternalSyntheticLambda470(10);
    public static boolean disabledToggleableAnimations;
    public static HashMap dominantColors;
    public static HashMap fetchers;
    public static SparseArray globalEmojiCache;
    public static boolean liteModeKeyboard;
    public static boolean liteModeReactions;
    public final String absolutePath;
    public float alpha;
    public boolean attached;
    public final int cacheType;
    public Boolean canOverrideColorCached;
    public ColorFilter colorFilterToSet;
    public final int currentAccount;
    public TLRPC.Document document;
    public final long documentId;
    public ArrayList holders;
    public PhotoViewer.AnonymousClass11 imageReceiver;
    public boolean imageReceiverEmojiThumb;
    public Boolean isDefaultStatusEmojiCached;
    public boolean preloading;
    public int sizedp;
    public ArrayList views;

    public final class EmojiDocumentFetcher {
        public final int currentAccount;
        public HashMap emojiDocumentsCache;
        public ChatActivity$$ExternalSyntheticLambda174 fetchRunnable;
        public HashMap loadingDocuments;
        public HashSet toFetchDocuments;

        public EmojiDocumentFetcher(int i) {
            this.currentAccount = i;
        }

        public final void fetchDocument(long j, ReceivedDocument receivedDocument) {
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
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
                            return;
                        }
                        return;
                    }
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
                    ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = new ChatActivity$$ExternalSyntheticLambda174(this, 27);
                    this.fetchRunnable = chatActivity$$ExternalSyntheticLambda174;
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda174);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final TLRPC.InputStickerSet findStickerSet(long j) {
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

        public final void loadFromServer(ArrayList arrayList) {
            TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
            tL_messages_getCustomEmojiDocuments.document_id = arrayList;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getCustomEmojiDocuments, new ChatActivity$$ExternalSyntheticLambda208(23, this, arrayList));
        }

        public final void processDocuments(ArrayList arrayList) {
            ArrayList arrayList2;
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.e("EmojiDocumentFetcher", new IllegalStateException("Wrong thread"));
                    return;
                }
                return;
            }
            AnimatedEmojiDrawable.liteModeKeyboard = LiteMode.isEnabled(16388);
            AnimatedEmojiDrawable.liteModeReactions = LiteMode.isEnabled(8200);
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

        public final void putDocument(TLRPC.Document document) {
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

        public final void putDocuments(ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.emojiDocumentsCache == null) {
                        this.emojiDocumentsCache = new HashMap();
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        TLRPC.Document document = (TLRPC.Document) obj;
                        this.emojiDocumentsCache.put(Long.valueOf(document.id), document);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface ReceivedDocument {
        void run(TLRPC.Document document);
    }

    public class SwapAnimatedEmojiDrawable extends Drawable implements AnimatedEmojiSpan.InvalidateHolder {
        public Integer account;
        public int alpha;
        public boolean attached;
        public final Rect bounds;
        public final int cacheType;
        public boolean center;
        public final AnimatedFloat changeProgress;
        public PorterDuffColorFilter colorFilter;
        public int colorFilterLastColor;
        public final Drawable[] drawables;
        public boolean hasParticles;
        public final boolean invalidateParent;
        public final ChatActivity$$ExternalSyntheticLambda174 invalidateRunnable;
        public Integer lastColor;
        public int offsetX;
        public int offsetY;
        public final OvershootInterpolator overshootInterpolator;
        public View parentView;
        public StarsReactionsSheet.Particles particles;
        public final AnimatedFloat particlesAlpha;
        public SelectAnimatedEmojiDialog secondParent;
        public final int size;

        public SwapAnimatedEmojiDrawable(int i) {
            this(null, false, i, 7);
        }

        public final void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            Drawable[] drawableArr = this.drawables;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).addView(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable2).addView(this);
            }
        }

        public final void detach() {
            if (this.attached) {
                this.attached = false;
                Drawable[] drawableArr = this.drawables;
                Drawable drawable = drawableArr[0];
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this);
                }
                Drawable drawable2 = drawableArr[1];
                if (drawable2 instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(this);
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            float f = this.changeProgress.set(1.0f, false);
            Rect bounds = getBounds();
            Rect rect = this.bounds;
            rect.set(bounds);
            rect.offset(this.offsetX, this.offsetY);
            float f2 = this.particlesAlpha.set(this.hasParticles);
            ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = this.invalidateRunnable;
            if (f2 > 0.0f) {
                StarsReactionsSheet.Particles particles = this.particles;
                particles.bounds.set(rect);
                particles.removeParticlesOutside();
                this.particles.process();
                StarsReactionsSheet.Particles particles2 = this.particles;
                Integer num = this.lastColor;
                particles2.draw(canvas, Theme.multAlpha(f2, num == null ? -1 : num.intValue()), 1.0f);
                Choreographer60FpsContent.getInstance().addFrameCallback(15, chatActivity$$ExternalSyntheticLambda174);
            } else {
                Choreographer60FpsContent.getInstance().removeFrameCallback(chatActivity$$ExternalSyntheticLambda174);
            }
            Drawable[] drawableArr = this.drawables;
            Drawable drawable = drawableArr[1];
            int intrinsicHeight = this.size;
            if (drawable != null && f < 1.0f) {
                drawable.setAlpha((int) ((1.0f - f) * this.alpha));
                int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? intrinsicHeight : drawableArr[1].getIntrinsicWidth();
                int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight() < 0 ? intrinsicHeight : drawableArr[1].getIntrinsicHeight();
                Drawable drawable2 = drawableArr[1];
                if (drawable2 instanceof AnimatedEmojiDrawable) {
                    drawable2.setBounds(rect);
                } else if (this.center) {
                    int i = intrinsicWidth / 2;
                    int i2 = intrinsicHeight2 / 2;
                    drawable2.setBounds(rect.centerX() - i, rect.centerY() - i2, rect.centerX() + i, rect.centerY() + i2);
                } else {
                    int i3 = intrinsicHeight2 / 2;
                    drawable2.setBounds(rect.left, rect.centerY() - i3, rect.left + intrinsicWidth, rect.centerY() + i3);
                }
                drawableArr[1].setColorFilter(this.colorFilter);
                drawableArr[1].draw(canvas);
                drawableArr[1].setColorFilter(null);
            }
            if (drawableArr[0] != null) {
                canvas.save();
                int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? intrinsicHeight : drawableArr[0].getIntrinsicWidth();
                if (drawableArr[0].getIntrinsicHeight() >= 0) {
                    intrinsicHeight = drawableArr[0].getIntrinsicHeight();
                }
                Drawable drawable3 = drawableArr[0];
                boolean z = drawable3 instanceof AnimatedEmojiDrawable;
                OvershootInterpolator overshootInterpolator = this.overshootInterpolator;
                if (z) {
                    PhotoViewer.AnonymousClass11 anonymousClass11 = ((AnimatedEmojiDrawable) drawable3).imageReceiver;
                    if (anonymousClass11 != null) {
                        anonymousClass11.setRoundRadius(AndroidUtilities.dp(4.0f));
                    }
                    if (f < 1.0f) {
                        float interpolation = overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                    }
                    drawableArr[0].setBounds(rect);
                } else if (this.center) {
                    if (f < 1.0f) {
                        float interpolation2 = overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                    }
                    int i4 = intrinsicWidth2 / 2;
                    int i5 = intrinsicHeight / 2;
                    drawableArr[0].setBounds(rect.centerX() - i4, rect.centerY() - i5, rect.centerX() + i4, rect.centerY() + i5);
                } else {
                    if (f < 1.0f) {
                        float interpolation3 = overshootInterpolator.getInterpolation(f);
                        canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                    }
                    int i6 = intrinsicHeight / 2;
                    drawableArr[0].setBounds(rect.left, rect.centerY() - i6, rect.left + intrinsicWidth2, rect.centerY() + i6);
                }
                drawableArr[0].setAlpha(this.alpha);
                drawableArr[0].setColorFilter(this.colorFilter);
                drawableArr[0].draw(canvas);
                drawableArr[0].setColorFilter(null);
                canvas.restore();
            }
        }

        public final Drawable getDrawable() {
            return this.drawables[0];
        }

        @Override
        public final int getIntrinsicHeight() {
            return this.size;
        }

        @Override
        public final int getIntrinsicWidth() {
            return this.size;
        }

        @Override
        public final int getOpacity() {
            return -2;
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
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.secondParent;
            if (selectAnimatedEmojiDialog != null) {
                selectAnimatedEmojiDialog.invalidate();
            }
            invalidateSelf();
        }

        public final boolean isEmpty() {
            return this.drawables[0] == null;
        }

        public final float isNotEmpty() {
            Drawable[] drawableArr = this.drawables;
            Drawable drawable = drawableArr[1];
            AnimatedFloat animatedFloat = this.changeProgress;
            return (drawable != null ? 1.0f - animatedFloat.value : 0.0f) + (drawableArr[0] != null ? animatedFloat.value : 0.0f);
        }

        public final void play() {
            AnimatedEmojiDrawable animatedEmojiDrawable;
            PhotoViewer.AnonymousClass11 anonymousClass11;
            Drawable drawable = this.drawables[0];
            if (!(drawable instanceof AnimatedEmojiDrawable) || (anonymousClass11 = (animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable).imageReceiver) == null) {
                return;
            }
            animatedEmojiDrawable.updateAutoRepeat(anonymousClass11);
            anonymousClass11.startAnimation();
        }

        public final boolean set(long j, boolean z) {
            Drawable[] drawableArr = this.drawables;
            Drawable drawable = drawableArr[0];
            if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).getDocumentId() == j) {
                return false;
            }
            AnimatedFloat animatedFloat = this.changeProgress;
            int i = this.cacheType;
            if (z) {
                animatedFloat.set(0.0f, true);
                Drawable drawable2 = drawableArr[1];
                if (drawable2 != null) {
                    if (this.attached && (drawable2 instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    drawableArr[1] = null;
                }
                drawableArr[1] = drawableArr[0];
                Integer num = this.account;
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(num != null ? num.intValue() : UserConfig.selectedAccount, j, null, i);
                drawableArr[0] = animatedEmojiDrawableMake;
                if (this.attached) {
                    animatedEmojiDrawableMake.addView(this);
                }
            } else {
                animatedFloat.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                Integer num2 = this.account;
                drawableArr[0] = AnimatedEmojiDrawable.make(num2 != null ? num2.intValue() : UserConfig.selectedAccount, j, null, i);
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

        @Override
        public final void setAlpha(int i) {
            this.alpha = i;
        }

        public final void setColor(Integer num) {
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

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setParentView(View view) {
            this.changeProgress.parent = view;
            this.particlesAlpha.parent = view;
            this.parentView = view;
        }

        public final void setParticles(boolean z, boolean z2) {
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

        public SwapAnimatedEmojiDrawable(int i, ChatMessageCell chatMessageCell) {
            this(chatMessageCell, true, i, 7);
        }

        public SwapAnimatedEmojiDrawable(View view, boolean z, int i, int i2) {
            this.center = false;
            this.overshootInterpolator = new OvershootInterpolator(2.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            AnimatedFloat animatedFloat = new AnimatedFloat(300L, (View) null, cubicBezierInterpolator);
            this.changeProgress = animatedFloat;
            AnimatedFloat animatedFloat2 = new AnimatedFloat(300L, (View) null, cubicBezierInterpolator);
            this.particlesAlpha = animatedFloat2;
            this.drawables = new Drawable[2];
            this.alpha = 255;
            this.bounds = new Rect();
            this.invalidateRunnable = new ChatActivity$$ExternalSyntheticLambda174(this, 28);
            animatedFloat.parent = view;
            this.parentView = view;
            animatedFloat2.parent = view;
            this.size = i;
            this.cacheType = i2;
            this.invalidateParent = z;
        }

        public final void set(TLRPC.Document document) {
            set(document, this.cacheType, false);
        }

        public final void set(TLRPC.Document document, int i, boolean z) {
            Drawable[] drawableArr = this.drawables;
            Drawable drawable = drawableArr[0];
            if ((drawable instanceof AnimatedEmojiDrawable) && document != null && ((AnimatedEmojiDrawable) drawable).getDocumentId() == document.id) {
                return;
            }
            AnimatedFloat animatedFloat = this.changeProgress;
            if (z) {
                animatedFloat.set(0.0f, true);
                Drawable drawable2 = drawableArr[1];
                if (drawable2 != null) {
                    if (drawable2 instanceof AnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    drawableArr[1] = null;
                }
                drawableArr[1] = drawableArr[0];
                if (document != null) {
                    Integer num = this.account;
                    AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(num != null ? num.intValue() : UserConfig.selectedAccount, i, document);
                    drawableArr[0] = animatedEmojiDrawableMake;
                    if (this.attached) {
                        animatedEmojiDrawableMake.addView(this);
                    }
                } else {
                    drawableArr[0] = null;
                }
            } else {
                animatedFloat.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                if (document != null) {
                    Integer num2 = this.account;
                    drawableArr[0] = AnimatedEmojiDrawable.make(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i, document);
                } else {
                    drawableArr[0] = null;
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

        public final void set(Drawable drawable, boolean z) {
            Drawable[] drawableArr = this.drawables;
            if (drawableArr[0] == drawable) {
                return;
            }
            AnimatedFloat animatedFloat = this.changeProgress;
            if (z) {
                animatedFloat.set(0.0f, true);
                Drawable drawable2 = drawableArr[1];
                if (drawable2 != null) {
                    if (this.attached && (drawable2 instanceof AnimatedEmojiDrawable)) {
                        ((AnimatedEmojiDrawable) drawable2).removeView(this);
                    }
                    drawableArr[1] = null;
                }
                drawableArr[1] = drawableArr[0];
                drawableArr[0] = drawable;
            } else {
                animatedFloat.set(1.0f, true);
                boolean z2 = this.attached;
                if (z2) {
                    detach();
                }
                drawableArr[0] = drawable;
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
    }

    public class WrapSizeDrawable extends Drawable {
        public int alpha = 255;
        public final Drawable drawable;
        public final int height;
        public final int width;

        public WrapSizeDrawable(int i, int i2, Drawable drawable) {
            this.drawable = drawable;
            this.width = i;
            this.height = i2;
        }

        @Override
        public void draw(Canvas canvas) {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                drawable.setAlpha(this.alpha);
                drawable.draw(canvas);
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return this.height;
        }

        @Override
        public final int getIntrinsicWidth() {
            return this.width;
        }

        @Override
        public final int getOpacity() {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha = i;
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            Drawable drawable = this.drawable;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public AnimatedEmojiDrawable(int i, int i2, long j) {
        this.alpha = 1.0f;
        this.canOverrideColorCached = null;
        this.isDefaultStatusEmojiCached = null;
        this.currentAccount = i2;
        this.cacheType = i;
        updateSize();
        this.documentId = j;
        getDocumentFetcher(i2).fetchDocument(j, new StickerSetCell$$ExternalSyntheticLambda5(this, 2));
    }

    public static TLRPC.Document findDocument(int i, long j) {
        HashMap map = getDocumentFetcher(i).emojiDocumentsCache;
        if (map == null) {
            return null;
        }
        return (TLRPC.Document) map.get(Long.valueOf(j));
    }

    public static int getCacheTypeForEnterView() {
        return SharedConfig.getDevicePerformanceClass() == 0 ? 0 : 2;
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

    public static AnimatedEmojiDrawable make(int i, long j, String str, int i2) {
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
        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(i2, j, str, i);
        longSparseArray.put(j, animatedEmojiDrawable2);
        return animatedEmojiDrawable2;
    }

    public static void toggleAnimations(int i, boolean z) {
        LongSparseArray longSparseArray;
        PhotoViewer.AnonymousClass11 anonymousClass11;
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
            if (animatedEmojiDrawable != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                if (z) {
                    anonymousClass11.setAllowStartLottieAnimation(true);
                    anonymousClass11.setAllowStartAnimation(true);
                    anonymousClass11.setAutoRepeat(1);
                    AnimatedFileDrawable animation = anonymousClass11.getAnimation();
                    if (animation != null) {
                        boolean z3 = anonymousClass11.useSharedAnimationQueue;
                        if (!animation.isWebmSticker) {
                            animation.useSharedQueue = z3;
                        }
                        animation.start();
                    } else {
                        RLottieDrawable lottieAnimation = anonymousClass11.getLottieAnimation();
                        if (lottieAnimation != null) {
                            lottieAnimation.start();
                        }
                    }
                } else {
                    anonymousClass11.setAllowStartAnimation(false);
                    anonymousClass11.setAllowStartLottieAnimation(false);
                    anonymousClass11.setAutoRepeat(0);
                    anonymousClass11.stopAnimation();
                }
            }
        }
    }

    public static void updateAll() {
        if (globalEmojiCache == null) {
            return;
        }
        liteModeKeyboard = LiteMode.isEnabled(16388);
        liteModeReactions = LiteMode.isEnabled(8200);
        for (int i = 0; i < globalEmojiCache.size(); i++) {
            LongSparseArray longSparseArray = (LongSparseArray) globalEmojiCache.valueAt(i);
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long jKeyAt = longSparseArray.keyAt(i2);
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) longSparseArray.get(jKeyAt);
                if (animatedEmojiDrawable == null || !animatedEmojiDrawable.attached) {
                    longSparseArray.remove(jKeyAt);
                } else {
                    animatedEmojiDrawable.initDocument(true);
                }
            }
        }
    }

    public final void addView(View view) {
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

    public final boolean canOverrideColor() {
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

    public final void clear() {
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

    @Override
    public final void draw(Canvas canvas) {
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (anonymousClass11 == null) {
            return;
        }
        anonymousClass11.setImageCoords(getBounds());
        this.imageReceiver.setAlpha(this.alpha);
        this.imageReceiver.draw(canvas);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.alpha * 255.0f);
    }

    public final long getDocumentId() {
        TLRPC.Document document = this.document;
        return document != null ? document.id : this.documentId;
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.sizedp);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.sizedp);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void initDocument(boolean z) {
        SvgHelper.SvgDrawable svgThumb;
        String str;
        int i;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        ImageLocation imageLocation2;
        Emoji.EmojiDrawable emojiDrawable;
        Drawable drawable;
        String str2;
        ImageLocation imageLocation3;
        String str3;
        ImageLocation forDocument2;
        int iDp;
        TLRPC.Document document = this.document;
        if (document != null) {
            PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
            if (anonymousClass11 == null || this.imageReceiverEmojiThumb || z) {
                int i2 = this.cacheType;
                if ((i2 == 20 || i2 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                this.imageReceiverEmojiThumb = false;
                if (anonymousClass11 == null) {
                    PhotoViewer.AnonymousClass11 anonymousClass12 = new PhotoViewer.AnonymousClass11(this, 4);
                    this.imageReceiver = anonymousClass12;
                    anonymousClass12.setCurrentAccount(this.currentAccount);
                    this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
                    if (i2 == 12) {
                        this.imageReceiver.ignoreNotifications = true;
                    }
                }
                if (this.colorFilterToSet != null && canOverrideColor()) {
                    this.imageReceiver.setColorFilter(this.colorFilterToSet);
                }
                if (i2 != 0) {
                    int i3 = i2 == 12 ? 2 : i2;
                    this.imageReceiver.setUniqKeyPrefix(i3 + "_");
                }
                this.imageReceiver.setVideoThumbIsSame(true);
                boolean z2 = (SharedConfig.getDevicePerformanceClass() == 0 && i2 == 5) || ((i2 == 2 || i2 == 25) && !liteModeKeyboard) || (i2 == 3 && !liteModeReactions);
                if (i2 == 13 || i2 == 16) {
                    z2 = true;
                }
                if (i2 == 24 || i2 == 27) {
                    z2 = false;
                }
                String strM = this.sizedp + "_" + this.sizedp;
                if (i2 == 12) {
                    strM = zzhr.m(strM, "_d_nostream");
                }
                if (i2 != 17 && i2 != 15 && i2 != 14 && i2 != 8 && ((i2 != 1 || SharedConfig.getDevicePerformanceClass() < 2) && i2 != 12)) {
                    strM = zzhr.m(strM, "_pcache");
                }
                if (i2 != 17 && i2 != 0 && i2 != 26 && i2 != 1 && i2 != 14 && i2 != 15 && i2 != 19 && i2 != 20 && i2 != 21) {
                    strM = zzhr.m(strM, "_compress");
                }
                if (i2 == 8) {
                    strM = zzhr.m(strM, "firstframe");
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.document.thumbs, 90);
                if (!"video/webm".equals(this.document.mime_type)) {
                    if ("application/x-tgsticker".equals(this.document.mime_type)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2 != 0 ? RendererCapabilities.CC.m(i2, "_") : "");
                        sb.append(this.documentId);
                        sb.append("@");
                        sb.append(strM);
                        String string = sb.toString();
                        if (SharedConfig.getDevicePerformanceClass() != 0 || i2 == 2 || i2 == 25 || i2 == 22 || !ImageLoader.getInstance().hasLottieMemCache(string)) {
                            SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(this.document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, i2 == 22 ? 0.8f : 0.2f);
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
                        str = strM;
                        i = 20;
                        imageLocation = null;
                    }
                    if (i2 != i || i2 == 21) {
                        imageLocation2 = null;
                        emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.document, null));
                        if (emojiDrawable != null) {
                            drawable = emojiDrawable;
                        }
                        str2 = this.absolutePath;
                        if (str2 != null) {
                            this.imageReceiver.setImageBitmap(new AnimatedFileDrawable(new File(str2), true, 0L, 0, null, null, null, 0L, this.currentAccount, true, 512, 512, null, 0, true));
                        } else if (i2 == 8) {
                            PhotoViewer.AnonymousClass11 anonymousClass13 = this.imageReceiver;
                            TLRPC.Document document2 = this.document;
                            anonymousClass13.setImage(null, null, imageLocation, str, null, null, drawable, document2.size, null, document2, 1);
                        } else {
                            imageLocation3 = imageLocation;
                            str3 = str;
                            if (z2 && (liteModeKeyboard || i2 == 14)) {
                                ImageLocation forDocument3 = i2 == 17 ? ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document) : imageLocation2;
                                PhotoViewer.AnonymousClass11 anonymousClass14 = this.imageReceiver;
                                ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                String str4 = this.sizedp + "_" + this.sizedp;
                                TLRPC.Document document3 = this.document;
                                anonymousClass14.setImage(imageLocation3, str3, forDocument4, str4, forDocument3, null, drawable, document3.size, null, document3, 1);
                            } else {
                                if (i2 == 16) {
                                    forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                } else {
                                    forDocument2 = imageLocation2;
                                }
                                if ("video/webm".equals(this.document.mime_type)) {
                                    PhotoViewer.AnonymousClass11 anonymousClass15 = this.imageReceiver;
                                    ImageLocation forDocument5 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                    String str5 = this.sizedp + "_" + this.sizedp;
                                    TLRPC.Document document4 = this.document;
                                    anonymousClass15.setImage(null, null, forDocument5, str5, forDocument2, null, drawable, document4.size, null, document4, 1);
                                } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                                    PhotoViewer.AnonymousClass11 anonymousClass16 = this.imageReceiver;
                                    String strM2 = zzhr.m(str3, "_firstframe");
                                    TLRPC.Document document5 = this.document;
                                    anonymousClass16.setImage(imageLocation3, strM2, forDocument2, null, drawable, document5.size, null, document5, 1);
                                } else {
                                    PhotoViewer.AnonymousClass11 anonymousClass17 = this.imageReceiver;
                                    ImageLocation forDocument6 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                    String str6 = this.sizedp + "_" + this.sizedp;
                                    TLRPC.Document document6 = this.document;
                                    anonymousClass17.setImage(forDocument6, str6, forDocument2, null, drawable, document6.size, null, document6, 1);
                                }
                            }
                        }
                        updateAutoRepeat(this.imageReceiver);
                        if (i2 != 13 || i2 == 16 || i2 == 3 || i2 == 5 || i2 == 4 || i2 == 24) {
                            this.imageReceiver.setLayerNum(7);
                        }
                        if (i2 != 9 || i2 == 21 || i2 == 27) {
                            this.imageReceiver.setLayerNum(6656);
                        }
                        this.imageReceiver.setAspectFit(true);
                        if (i2 != 12 || i2 == 26 || i2 == 18 || i2 == 8 || i2 == 6 || i2 == 5 || (i2 == 25 && disabledToggleableAnimations)) {
                            this.imageReceiver.setAllowStartAnimation(false);
                            this.imageReceiver.setAllowStartLottieAnimation(false);
                            this.imageReceiver.setAutoRepeat(0);
                        } else {
                            this.imageReceiver.setAllowStartLottieAnimation(true);
                            this.imageReceiver.setAllowStartAnimation(true);
                            this.imageReceiver.setAutoRepeat(1);
                        }
                        this.imageReceiver.setAllowDecodeSingleFrame(true);
                        if (i2 != 5 || i2 == 6 || i2 == 27) {
                            iDp = AndroidUtilities.dp(6.0f);
                        } else {
                            iDp = i2 == 24 ? AndroidUtilities.dp(14.0f) : 0;
                        }
                        this.imageReceiver.setRoundRadius(iDp);
                        updateAttachState();
                        invalidate();
                    }
                    imageLocation2 = null;
                    drawable = svgThumb;
                    str2 = this.absolutePath;
                    if (str2 != null) {
                        this.imageReceiver.setImageBitmap(new AnimatedFileDrawable(new File(str2), true, 0L, 0, null, null, null, 0L, this.currentAccount, true, 512, 512, null, 0, true));
                    } else if (i2 == 8) {
                        PhotoViewer.AnonymousClass11 anonymousClass18 = this.imageReceiver;
                        TLRPC.Document document7 = this.document;
                        anonymousClass18.setImage(null, null, imageLocation, str, null, null, drawable, document7.size, null, document7, 1);
                    } else {
                        imageLocation3 = imageLocation;
                        str3 = str;
                        if (z2) {
                            if (i2 == 16) {
                                forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            } else {
                                forDocument2 = imageLocation2;
                            }
                            if ("video/webm".equals(this.document.mime_type)) {
                                PhotoViewer.AnonymousClass11 anonymousClass19 = this.imageReceiver;
                                ImageLocation forDocument7 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                String str7 = this.sizedp + "_" + this.sizedp;
                                TLRPC.Document document8 = this.document;
                                anonymousClass19.setImage(null, null, forDocument7, str7, forDocument2, null, drawable, document8.size, null, document8, 1);
                            } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                                PhotoViewer.AnonymousClass11 anonymousClass110 = this.imageReceiver;
                                String strM3 = zzhr.m(str3, "_firstframe");
                                TLRPC.Document document9 = this.document;
                                anonymousClass110.setImage(imageLocation3, strM3, forDocument2, null, drawable, document9.size, null, document9, 1);
                            } else {
                                PhotoViewer.AnonymousClass11 anonymousClass111 = this.imageReceiver;
                                ImageLocation forDocument8 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                String str8 = this.sizedp + "_" + this.sizedp;
                                TLRPC.Document document10 = this.document;
                                anonymousClass111.setImage(forDocument8, str8, forDocument2, null, drawable, document10.size, null, document10, 1);
                            }
                        } else {
                            if (i2 == 16) {
                                forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            } else {
                                forDocument2 = imageLocation2;
                            }
                            if ("video/webm".equals(this.document.mime_type)) {
                                PhotoViewer.AnonymousClass11 anonymousClass112 = this.imageReceiver;
                                ImageLocation forDocument9 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                String str9 = this.sizedp + "_" + this.sizedp;
                                TLRPC.Document document11 = this.document;
                                anonymousClass112.setImage(null, null, forDocument9, str9, forDocument2, null, drawable, document11.size, null, document11, 1);
                            } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                                PhotoViewer.AnonymousClass11 anonymousClass113 = this.imageReceiver;
                                String strM4 = zzhr.m(str3, "_firstframe");
                                TLRPC.Document document12 = this.document;
                                anonymousClass113.setImage(imageLocation3, strM4, forDocument2, null, drawable, document12.size, null, document12, 1);
                            } else {
                                PhotoViewer.AnonymousClass11 anonymousClass114 = this.imageReceiver;
                                ImageLocation forDocument10 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                                String str10 = this.sizedp + "_" + this.sizedp;
                                TLRPC.Document document13 = this.document;
                                anonymousClass114.setImage(forDocument10, str10, forDocument2, null, drawable, document13.size, null, document13, 1);
                            }
                        }
                    }
                    updateAutoRepeat(this.imageReceiver);
                    if (i2 != 13) {
                        this.imageReceiver.setLayerNum(7);
                    } else {
                        this.imageReceiver.setLayerNum(7);
                    }
                    if (i2 != 9) {
                        this.imageReceiver.setLayerNum(6656);
                    } else {
                        this.imageReceiver.setLayerNum(6656);
                    }
                    this.imageReceiver.setAspectFit(true);
                    if (i2 != 12) {
                        this.imageReceiver.setAllowStartAnimation(false);
                        this.imageReceiver.setAllowStartLottieAnimation(false);
                        this.imageReceiver.setAutoRepeat(0);
                    } else {
                        this.imageReceiver.setAllowStartAnimation(false);
                        this.imageReceiver.setAllowStartLottieAnimation(false);
                        this.imageReceiver.setAutoRepeat(0);
                    }
                    this.imageReceiver.setAllowDecodeSingleFrame(true);
                    if (i2 != 5) {
                        iDp = AndroidUtilities.dp(6.0f);
                    } else {
                        iDp = AndroidUtilities.dp(6.0f);
                    }
                    this.imageReceiver.setRoundRadius(iDp);
                    updateAttachState();
                    invalidate();
                }
                forDocument = ImageLocation.getForDocument(this.document);
                strM = zzhr.m(strM, "_g");
                svgThumb = DocumentObject.getSvgThumb(this.document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f, true);
                str = strM;
                imageLocation = forDocument;
                i = 20;
                if (i2 != i) {
                    imageLocation2 = null;
                    emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.document, null));
                    if (emojiDrawable != null) {
                        drawable = emojiDrawable;
                    } else {
                        drawable = svgThumb;
                    }
                } else {
                    imageLocation2 = null;
                    emojiDrawable = Emoji.getEmojiDrawable(MessageObject.findAnimatedEmojiEmoticon(this.document, null));
                    if (emojiDrawable != null) {
                        drawable = emojiDrawable;
                    } else {
                        drawable = svgThumb;
                    }
                }
                str2 = this.absolutePath;
                if (str2 != null) {
                    this.imageReceiver.setImageBitmap(new AnimatedFileDrawable(new File(str2), true, 0L, 0, null, null, null, 0L, this.currentAccount, true, 512, 512, null, 0, true));
                } else if (i2 == 8) {
                    PhotoViewer.AnonymousClass11 anonymousClass115 = this.imageReceiver;
                    TLRPC.Document document14 = this.document;
                    anonymousClass115.setImage(null, null, imageLocation, str, null, null, drawable, document14.size, null, document14, 1);
                } else {
                    imageLocation3 = imageLocation;
                    str3 = str;
                    if (z2) {
                        if (i2 == 16) {
                            forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                        } else {
                            forDocument2 = imageLocation2;
                        }
                        if ("video/webm".equals(this.document.mime_type)) {
                            PhotoViewer.AnonymousClass11 anonymousClass116 = this.imageReceiver;
                            ImageLocation forDocument11 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str11 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document15 = this.document;
                            anonymousClass116.setImage(null, null, forDocument11, str11, forDocument2, null, drawable, document15.size, null, document15, 1);
                        } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                            PhotoViewer.AnonymousClass11 anonymousClass117 = this.imageReceiver;
                            String strM5 = zzhr.m(str3, "_firstframe");
                            TLRPC.Document document16 = this.document;
                            anonymousClass117.setImage(imageLocation3, strM5, forDocument2, null, drawable, document16.size, null, document16, 1);
                        } else {
                            PhotoViewer.AnonymousClass11 anonymousClass118 = this.imageReceiver;
                            ImageLocation forDocument12 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str12 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document17 = this.document;
                            anonymousClass118.setImage(forDocument12, str12, forDocument2, null, drawable, document17.size, null, document17, 1);
                        }
                    } else {
                        if (i2 == 16) {
                            forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                        } else {
                            forDocument2 = imageLocation2;
                        }
                        if ("video/webm".equals(this.document.mime_type)) {
                            PhotoViewer.AnonymousClass11 anonymousClass119 = this.imageReceiver;
                            ImageLocation forDocument13 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str13 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document18 = this.document;
                            anonymousClass119.setImage(null, null, forDocument13, str13, forDocument2, null, drawable, document18.size, null, document18, 1);
                        } else if (MessageObject.isAnimatedStickerDocument(this.document, true)) {
                            PhotoViewer.AnonymousClass11 anonymousClass1110 = this.imageReceiver;
                            String strM6 = zzhr.m(str3, "_firstframe");
                            TLRPC.Document document19 = this.document;
                            anonymousClass1110.setImage(imageLocation3, strM6, forDocument2, null, drawable, document19.size, null, document19, 1);
                        } else {
                            PhotoViewer.AnonymousClass11 anonymousClass1111 = this.imageReceiver;
                            ImageLocation forDocument14 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.document);
                            String str14 = this.sizedp + "_" + this.sizedp;
                            TLRPC.Document document110 = this.document;
                            anonymousClass1111.setImage(forDocument14, str14, forDocument2, null, drawable, document110.size, null, document110, 1);
                        }
                    }
                }
                updateAutoRepeat(this.imageReceiver);
                if (i2 != 13) {
                    this.imageReceiver.setLayerNum(7);
                } else {
                    this.imageReceiver.setLayerNum(7);
                }
                if (i2 != 9) {
                    this.imageReceiver.setLayerNum(6656);
                } else {
                    this.imageReceiver.setLayerNum(6656);
                }
                this.imageReceiver.setAspectFit(true);
                if (i2 != 12) {
                    this.imageReceiver.setAllowStartAnimation(false);
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    this.imageReceiver.setAutoRepeat(0);
                } else {
                    this.imageReceiver.setAllowStartAnimation(false);
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    this.imageReceiver.setAutoRepeat(0);
                }
                this.imageReceiver.setAllowDecodeSingleFrame(true);
                if (i2 != 5) {
                    iDp = AndroidUtilities.dp(6.0f);
                } else {
                    iDp = AndroidUtilities.dp(6.0f);
                }
                this.imageReceiver.setRoundRadius(iDp);
                updateAttachState();
                invalidate();
            }
        }
    }

    public final void invalidate() {
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

    public final boolean isDefaultStatusEmoji() {
        Boolean bool = this.isDefaultStatusEmojiCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Document document = this.document;
        boolean z = false;
        if (document != null) {
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                z = true;
            } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                long j = inputStickerSet.id;
                if (j == 773947703670341676L || j == 2964141614563343L) {
                    z = true;
                }
            }
            this.isDefaultStatusEmojiCached = Boolean.valueOf(z);
        }
        return z;
    }

    public final void removeView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        ArrayList arrayList = this.holders;
        if (arrayList != null) {
            arrayList.remove(invalidateHolder);
        }
        this.preloading = false;
        updateAttachState();
    }

    @Override
    public final void setAlpha(int i) {
        float f = i / 255.0f;
        this.alpha = f;
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (anonymousClass11 != null) {
            anonymousClass11.setAlpha(f);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.imageReceiver == null || this.document == null) {
            this.colorFilterToSet = colorFilter;
        } else if (canOverrideColor()) {
            this.imageReceiver.setColorFilter(colorFilter);
        }
    }

    public final void setupEmojiThumb(String str) {
        PhotoViewer.AnonymousClass11 anonymousClass11;
        int i = this.cacheType;
        if ((i == 20 || i == 21) && !TextUtils.isEmpty(str) && (anonymousClass11 = this.imageReceiver) == null) {
            if (anonymousClass11 == null) {
                PhotoViewer.AnonymousClass11 anonymousClass12 = new PhotoViewer.AnonymousClass11(this, 4);
                this.imageReceiver = anonymousClass12;
                anonymousClass12.setCurrentAccount(this.currentAccount);
                this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
                if (i == 12) {
                    this.imageReceiver.ignoreNotifications = true;
                }
            }
            this.imageReceiverEmojiThumb = true;
            this.imageReceiver.setImageBitmap(Emoji.getEmojiDrawable(str));
            this.imageReceiver.setCrossfadeWithOldImage(true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.document;
        return MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, document == null ? "null" : MessageObject.findAnimatedEmojiEmoticon(document, null), "}");
    }

    public final void update(long j) {
        PhotoViewer.AnonymousClass11 anonymousClass11 = this.imageReceiver;
        if (anonymousClass11 != null) {
            if (this.cacheType == 8) {
                j = 0;
            }
            if (anonymousClass11.getLottieAnimation() != null) {
                this.imageReceiver.getLottieAnimation().updateCurrentFrame(j);
            }
            if (this.imageReceiver.getAnimation() != null) {
                this.imageReceiver.getAnimation().updateCurrentFrame(j);
            }
        }
    }

    public final void updateAttachState() {
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
            if (this.attached) {
                return;
            }
            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = cleanup;
            AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda470);
            AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda470, 5000L);
        }
    }

    public final void updateAutoRepeat(PhotoViewer.AnonymousClass11 anonymousClass11) {
        int i = this.cacheType;
        if (i == 7 || i == 9 || i == 10) {
            anonymousClass11.setAutoRepeatCount(2);
            return;
        }
        if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5 || i == 22) {
            anonymousClass11.setAutoRepeatCount(1);
        } else if (i == 17) {
            anonymousClass11.setAutoRepeatCount(0);
        }
    }

    public final void updateSize() {
        int i = this.cacheType;
        if (i == 0 || i == 26) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaint.descent()) + Math.abs(Theme.chat_msgTextPaint.ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        TextPaint[] textPaintArr = Theme.chat_msgTextPaintEmoji;
        if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / AndroidUtilities.density);
            return;
        }
        if (textPaintArr != null && i == 8) {
            this.sizedp = (int) (((Math.abs(Theme.chat_msgTextPaintEmoji[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / AndroidUtilities.density);
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

    public final void removeView(View view) {
        ArrayList arrayList = this.views;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.preloading = false;
        updateAttachState();
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

    public final void addView(AnimatedEmojiSpan.InvalidateHolder invalidateHolder) {
        if (this.holders == null) {
            this.holders = new ArrayList(10);
        }
        this.preloading = false;
        if (!this.holders.contains(invalidateHolder)) {
            this.holders.add(invalidateHolder);
        }
        updateAttachState();
    }

    public AnimatedEmojiDrawable(int i, long j, String str, int i2) {
        this.alpha = 1.0f;
        this.canOverrideColorCached = null;
        this.isDefaultStatusEmojiCached = null;
        this.currentAccount = i2;
        this.cacheType = i;
        updateSize();
        this.documentId = j;
        this.absolutePath = str;
        getDocumentFetcher(i2).fetchDocument(j, new StickerSetCell$$ExternalSyntheticLambda5(this, 1));
    }

    public AnimatedEmojiDrawable(int i, int i2, TLRPC.Document document) {
        this.alpha = 1.0f;
        this.canOverrideColorCached = null;
        this.isDefaultStatusEmojiCached = null;
        this.cacheType = i;
        this.currentAccount = i2;
        this.document = document;
        updateSize();
        liteModeKeyboard = LiteMode.isEnabled(16388);
        liteModeReactions = LiteMode.isEnabled(8200);
        initDocument(false);
    }

    public AnimatedEmojiDrawable(int i) {
        this.alpha = 1.0f;
        this.canOverrideColorCached = null;
        this.isDefaultStatusEmojiCached = null;
        this.cacheType = 21;
        this.currentAccount = i;
        updateSize();
        liteModeKeyboard = LiteMode.isEnabled(16388);
        liteModeReactions = LiteMode.isEnabled(8200);
    }
}
