package org.telegram.p009ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLObject;

public class BackupImageView extends View {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    boolean attached;
    private AvatarDrawable avatarDrawable;
    protected int height;
    protected ImageReceiver imageReceiver;
    ValueAnimator roundRadiusAnimator;
    protected int width;

    public BackupImageView(Context context) {
        super(context);
        this.width = -1;
        this.height = -1;
        this.imageReceiver = new ImageReceiver(this);
    }

    public void setOrientation(int i, boolean z) {
        this.imageReceiver.setOrientation(i, z);
    }

    public void setImage(SecureDocument secureDocument, String str) {
        setImage(ImageLocation.getForSecureDocument(secureDocument), str, null, null, null, null, null, 0, null);
    }

    public void setImage(ImageLocation imageLocation, String str, String str2, Drawable drawable, Object obj) {
        setImage(imageLocation, str, null, null, drawable, null, str2, 0, obj);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        setImage(imageLocation, str, null, null, drawable, null, null, 0, obj);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, int i, Object obj) {
        setImage(imageLocation, str, null, null, drawable, null, null, i, obj);
    }

    public void setForUserOrChat(TLObject tLObject, AvatarDrawable avatarDrawable) {
        this.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
    }

    public void setForUserOrChat(TLObject tLObject, AvatarDrawable avatarDrawable, Object obj) {
        this.imageReceiver.setForUserOrChat(tLObject, avatarDrawable, obj);
    }

    public void setImageMedia(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Bitmap bitmap, int i, int i2, Object obj) {
        BackupImageView backupImageView;
        BitmapDrawable bitmapDrawable;
        if (bitmap != null) {
            backupImageView = this;
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        } else {
            backupImageView = this;
            bitmapDrawable = null;
        }
        backupImageView.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, null, null, bitmapDrawable, i, null, obj, i2);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i, Object obj) {
        setImage(imageLocation, str, imageLocation2, str2, null, null, null, i, obj);
    }

    public void setImage(String str, String str2, Drawable drawable) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, null, null, 0, null);
    }

    public void setImage(String str, String str2, String str3, String str4) {
        setImage(ImageLocation.getForPath(str), str2, ImageLocation.getForPath(str3), str4, null, null, null, 0, null);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Bitmap bitmap, String str3, int i, Object obj) {
        BackupImageView backupImageView;
        BitmapDrawable bitmapDrawable;
        if (bitmap != null) {
            backupImageView = this;
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        } else {
            backupImageView = this;
            bitmapDrawable = drawable;
        }
        backupImageView.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, bitmapDrawable, i, str3, obj, 0);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, long j, int i, Object obj) {
        this.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, null, j, str3, obj, i);
    }

    public void setImageMedia(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, String str4, int i, int i2, Object obj) {
        this.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, imageLocation3, str3, null, i, str4, obj, i2);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imageReceiver.setImageBitmap(bitmap);
    }

    public void setImageResource(int i) {
        this.imageReceiver.setImageBitmap(getResources().getDrawable(i));
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        this.imageReceiver.setImageBitmap(drawable);
    }

    public void setLayerNum(int i) {
        this.imageReceiver.setLayerNum(i);
    }

    public void setRoundRadius(int i) {
        this.imageReceiver.setRoundRadius(i);
        invalidate();
    }

    public void setRoundRadius(int i, int i2, int i3, int i4) {
        this.imageReceiver.setRoundRadius(i, i2, i3, i4);
        invalidate();
    }

    public int[] getRoundRadius() {
        return this.imageReceiver.getRoundRadius();
    }

    public void setAspectFit(boolean z) {
        this.imageReceiver.setAspectFit(z);
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
        invalidate();
    }

    public AvatarDrawable getAvatarDrawable() {
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable();
        }
        return this.avatarDrawable;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        this.imageReceiver.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.imageReceiver.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        if (this.width != -1 && this.height != -1) {
            int height = getHeight();
            int i = this.height;
            imageReceiver.setImageCoords((getWidth() - this.width) / 2, (height - i) / 2, this.width, i);
        } else {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
        }
        imageReceiver.draw(canvas);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.imageReceiver.setColorFilter(colorFilter);
    }

    public void setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
        AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable2 == animatedEmojiDrawable) {
            return;
        }
        if (this.attached && animatedEmojiDrawable2 != null) {
            animatedEmojiDrawable2.removeView(this);
        }
        this.animatedEmojiDrawable = animatedEmojiDrawable;
        if (!this.attached || animatedEmojiDrawable == null) {
            return;
        }
        animatedEmojiDrawable.addView(this);
    }

    public void animateToRoundRadius(int i) {
        if (getRoundRadius()[0] != i) {
            ValueAnimator valueAnimator = this.roundRadiusAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(getRoundRadius()[0], i);
            this.roundRadiusAnimator = ofInt;
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BackupImageView.this.setRoundRadius(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                }
            });
            this.roundRadiusAnimator.setDuration(200L);
            this.roundRadiusAnimator.start();
        }
    }
}
