package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;

public final class VectorAvatarThumbDrawable extends Drawable implements AnimatedEmojiSpan.InvalidateHolder, AttachableDrawable, NotificationCenter.NotificationCenterDelegate {
    public final AnimatedEmojiDrawable animatedEmojiDrawable;
    public final int currentAccount;
    public ImageReceiver currentParent;
    public final GradientTools gradientTools;
    public final AnonymousClass1 imageReceiver;
    public boolean imageSeted;
    public final boolean isPremium;
    public final HashSet parents;
    public float roundRadius;
    public final TLRPC.TL_videoSizeStickerMarkup sizeStickerMarkup;
    public final ImageReceiver stickerPreloadImageReceiver;
    public final int type;

    public VectorAvatarThumbDrawable(TLRPC.VideoSize videoSize, boolean z, int i) {
        GradientTools gradientTools = new GradientTools();
        this.gradientTools = gradientTools;
        this.parents = new HashSet();
        this.stickerPreloadImageReceiver = new ImageReceiver();
        this.currentAccount = UserConfig.selectedAccount;
        this.type = i;
        this.isPremium = z;
        gradientTools.setColors(ColorUtils.setAlphaComponent(videoSize.background_colors.get(0).intValue(), 255), videoSize.background_colors.size() > 1 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(1).intValue(), 255) : 0, videoSize.background_colors.size() > 2 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(2).intValue(), 255) : 0, videoSize.background_colors.size() > 3 ? ColorUtils.setAlphaComponent(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable((i == 1 && z) ? 7 : i == 2 ? 15 : 8, UserConfig.selectedAccount, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.sizeStickerMarkup = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            ?? r11 = new ImageReceiver() {
                @Override
                public final void invalidate() {
                    VectorAvatarThumbDrawable.this.invalidate();
                }
            };
            this.imageReceiver = r11;
            r11.setInvalidateAll(true);
            if (i == 1) {
                r11.setAutoRepeatCount(2);
            }
            setImage$4();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.groupStickersDidLoad || this.imageSeted) {
            return;
        }
        setImage$4();
    }

    @Override
    public final void draw(Canvas canvas) {
        GradientTools gradientTools = this.gradientTools;
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        gradientTools.getClass();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f, f2, f3, f4);
        gradientTools.setBounds(rectF);
        ImageReceiver imageReceiver = this.currentParent;
        if (imageReceiver != null) {
            this.roundRadius = imageReceiver.getRoundRadius()[0];
        }
        float f5 = this.roundRadius;
        if (f5 == 0.0f) {
            canvas.drawRect(getBounds(), gradientTools.paint);
        } else {
            canvas.drawRoundRect(gradientTools.bounds, f5, f5, gradientTools.paint);
        }
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        int iWidth = ((int) (getBounds().width() * 0.7f)) >> 1;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
            if (anonymousClass11 != null) {
                anonymousClass11.setRoundRadius((int) (iWidth * 2 * 0.13f));
            }
            animatedEmojiDrawable.setBounds(iCenterX - iWidth, iCenterY - iWidth, iCenterX + iWidth, iCenterY + iWidth);
            animatedEmojiDrawable.draw(canvas);
        }
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            float f6 = iWidth * 2;
            anonymousClass1.setRoundRadius((int) (0.13f * f6));
            anonymousClass1.setImageCoords(iCenterX - iWidth, iCenterY - iWidth, f6, f6);
            anonymousClass1.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorAvatarThumbDrawable.class == obj.getClass()) {
            VectorAvatarThumbDrawable vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) obj;
            if (this.type == vectorAvatarThumbDrawable.type) {
                GradientTools gradientTools = this.gradientTools;
                int i = gradientTools.color1;
                GradientTools gradientTools2 = vectorAvatarThumbDrawable.gradientTools;
                if (i == gradientTools2.color1 && gradientTools.color2 == gradientTools2.color2 && gradientTools.color3 == gradientTools2.color3 && gradientTools.color4 == gradientTools2.color4) {
                    AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
                    if (animatedEmojiDrawable2 != null && (animatedEmojiDrawable = vectorAvatarThumbDrawable.animatedEmojiDrawable) != null) {
                        return animatedEmojiDrawable2.getDocumentId() == animatedEmojiDrawable.getDocumentId();
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.sizeStickerMarkup;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = vectorAvatarThumbDrawable.sizeStickerMarkup) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidate() {
        Iterator it = this.parents.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.roundRadius = imageReceiver.getRoundRadius()[0];
        HashSet hashSet = this.parents;
        if (hashSet.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            AnonymousClass1 anonymousClass1 = this.imageReceiver;
            if (anonymousClass1 != null) {
                anonymousClass1.onAttachedToWindow();
            }
            ImageReceiver imageReceiver2 = this.stickerPreloadImageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onAttachedToWindow();
            }
        }
        hashSet.add(imageReceiver);
        if (this.sizeStickerMarkup != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void onDetachedFromWindow(ImageReceiver imageReceiver) {
        HashSet hashSet = this.parents;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            AnonymousClass1 anonymousClass1 = this.imageReceiver;
            if (anonymousClass1 != null) {
                anonymousClass1.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.stickerPreloadImageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.sizeStickerMarkup != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.gradientTools.paint.setAlpha(i);
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.setAlpha(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setImage$4() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.sizeStickerMarkup;
        TLRPC.TL_messages_stickerSet stickerSet = mediaDataController.getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
        if (stickerSet != null) {
            this.imageSeted = true;
            for (int i = 0; i < stickerSet.documents.size(); i++) {
                if (stickerSet.documents.get(i).id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = stickerSet.documents.get(i);
                    boolean z = this.isPremium;
                    int i2 = this.type;
                    if (!z || i2 != 1) {
                        if (i2 == 2) {
                            str3 = "100_100";
                        } else {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                        }
                        setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", document2, 0);
                        if (i2 == 3) {
                            this.stickerPreloadImageReceiver.setImage(ImageLocation.getForDocument(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                            return;
                        }
                        return;
                    }
                    str3 = "50_50";
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", document2, 0);
                    if (i2 == 3) {
                        this.stickerPreloadImageReceiver.setImage(ImageLocation.getForDocument(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void setParent(RLottieImageView rLottieImageView) {
    }
}
