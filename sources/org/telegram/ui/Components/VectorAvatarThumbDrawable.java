package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$TL_videoSizeEmojiMarkup;
import org.telegram.tgnet.TLRPC$TL_videoSizeStickerMarkup;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.Components.AnimatedEmojiSpan;
public class VectorAvatarThumbDrawable extends Drawable implements AnimatedEmojiSpan.InvalidateHolder, AttachableDrawable, NotificationCenter.NotificationCenterDelegate {
    AnimatedEmojiDrawable animatedEmojiDrawable;
    final int currentAccount;
    ImageReceiver currentParent;
    public final GradientTools gradientTools;
    ImageReceiver imageReceiver;
    boolean imageSeted;
    boolean isPremium;
    HashSet<ImageReceiver> parents;
    float roundRadius;
    TLRPC$TL_videoSizeStickerMarkup sizeStickerMarkup;
    ImageReceiver stickerPreloadImageReceiver;
    private final int type;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public VectorAvatarThumbDrawable(TLRPC$VideoSize tLRPC$VideoSize, boolean z, int i) {
        GradientTools gradientTools = new GradientTools();
        this.gradientTools = gradientTools;
        this.parents = new HashSet<>();
        this.stickerPreloadImageReceiver = new ImageReceiver();
        this.currentAccount = UserConfig.selectedAccount;
        this.type = i;
        this.isPremium = z;
        gradientTools.setColors(ColorUtils.setAlphaComponent(tLRPC$VideoSize.background_colors.get(0).intValue(), 255), tLRPC$VideoSize.background_colors.size() > 1 ? ColorUtils.setAlphaComponent(tLRPC$VideoSize.background_colors.get(1).intValue(), 255) : 0, tLRPC$VideoSize.background_colors.size() > 2 ? ColorUtils.setAlphaComponent(tLRPC$VideoSize.background_colors.get(2).intValue(), 255) : 0, tLRPC$VideoSize.background_colors.size() > 3 ? ColorUtils.setAlphaComponent(tLRPC$VideoSize.background_colors.get(3).intValue(), 255) : 0);
        if (tLRPC$VideoSize instanceof TLRPC$TL_videoSizeEmojiMarkup) {
            TLRPC$TL_videoSizeEmojiMarkup tLRPC$TL_videoSizeEmojiMarkup = (TLRPC$TL_videoSizeEmojiMarkup) tLRPC$VideoSize;
            int i2 = 8;
            if (i == 1 && z) {
                i2 = 7;
            } else if (i == 2) {
                i2 = 15;
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(i2, UserConfig.selectedAccount, tLRPC$TL_videoSizeEmojiMarkup.emoji_id);
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (tLRPC$VideoSize instanceof TLRPC$TL_videoSizeStickerMarkup) {
            this.sizeStickerMarkup = (TLRPC$TL_videoSizeStickerMarkup) tLRPC$VideoSize;
            ImageReceiver imageReceiver = new ImageReceiver() {
                @Override
                public void invalidate() {
                    VectorAvatarThumbDrawable.this.invalidate();
                }
            };
            this.imageReceiver = imageReceiver;
            imageReceiver.setInvalidateAll(true);
            if (i == 1) {
                this.imageReceiver.setAutoRepeatCount(2);
            }
            setImage();
        }
    }

    private void setImage() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.VectorAvatarThumbDrawable.setImage():void");
    }

    @Override
    public void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        this.gradientTools.setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        if (this.currentParent != null) {
            this.roundRadius = imageReceiver.getRoundRadius()[0];
        }
        float f = this.roundRadius;
        if (f == 0.0f) {
            canvas.drawRect(getBounds(), this.gradientTools.paint);
        } else {
            GradientTools gradientTools = this.gradientTools;
            canvas.drawRoundRect(gradientTools.bounds, f, f, gradientTools.paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            if (animatedEmojiDrawable.getImageReceiver() != null) {
                this.animatedEmojiDrawable.getImageReceiver().setRoundRadius((int) (width * 2 * 0.13f));
            }
            this.animatedEmojiDrawable.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            this.animatedEmojiDrawable.draw(canvas);
        }
        ImageReceiver imageReceiver2 = this.imageReceiver;
        if (imageReceiver2 != null) {
            float f2 = width * 2;
            imageReceiver2.setRoundRadius((int) (0.13f * f2));
            this.imageReceiver.setImageCoords(centerX - width, centerY - width, f2, f2);
            this.imageReceiver.draw(canvas);
        }
    }

    @Override
    public void setAlpha(int i) {
        this.gradientTools.paint.setAlpha(i);
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.setAlpha(i);
        }
    }

    @Override
    public void onAttachedToWindow(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.roundRadius = imageReceiver.getRoundRadius()[0];
        if (this.parents.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            ImageReceiver imageReceiver2 = this.imageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onAttachedToWindow();
            }
            ImageReceiver imageReceiver3 = this.stickerPreloadImageReceiver;
            if (imageReceiver3 != null) {
                imageReceiver3.onAttachedToWindow();
            }
        }
        this.parents.add(imageReceiver);
        if (this.sizeStickerMarkup != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public void onDetachedFromWindow(ImageReceiver imageReceiver) {
        this.parents.remove(imageReceiver);
        if (this.parents.isEmpty()) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            ImageReceiver imageReceiver2 = this.imageReceiver;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver3 = this.stickerPreloadImageReceiver;
            if (imageReceiver3 != null) {
                imageReceiver3.onDetachedFromWindow();
            }
        }
        if (this.sizeStickerMarkup != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public void invalidate() {
        Iterator<ImageReceiver> it = this.parents.iterator();
        while (it.hasNext()) {
            it.next().invalidate();
        }
    }

    public boolean equals(Object obj) {
        TLRPC$TL_videoSizeStickerMarkup tLRPC$TL_videoSizeStickerMarkup;
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
                    AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                    if (animatedEmojiDrawable != null && vectorAvatarThumbDrawable.animatedEmojiDrawable != null) {
                        return animatedEmojiDrawable.getDocumentId() == vectorAvatarThumbDrawable.animatedEmojiDrawable.getDocumentId();
                    }
                    TLRPC$TL_videoSizeStickerMarkup tLRPC$TL_videoSizeStickerMarkup2 = this.sizeStickerMarkup;
                    return tLRPC$TL_videoSizeStickerMarkup2 != null && (tLRPC$TL_videoSizeStickerMarkup = vectorAvatarThumbDrawable.sizeStickerMarkup) != null && tLRPC$TL_videoSizeStickerMarkup2.stickerset.id == tLRPC$TL_videoSizeStickerMarkup.stickerset.id && tLRPC$TL_videoSizeStickerMarkup2.sticker_id == tLRPC$TL_videoSizeStickerMarkup.sticker_id;
                }
            }
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.groupStickersDidLoad || this.imageSeted) {
            return;
        }
        setImage();
    }

    public void setParent(ImageReceiver imageReceiver) {
        this.currentParent = imageReceiver;
    }
}
