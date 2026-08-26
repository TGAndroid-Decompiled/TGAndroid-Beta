package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

public class BackupImageView extends View {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public ColorFilter animatedEmojiDrawableColorFilter;
    public boolean applyAttach;
    public boolean attached;
    public AvatarDrawable avatarDrawable;
    public boolean blurAllowed;
    public ImageReceiver blurImageReceiver;
    public Text blurText;
    public ColorMatrixColorFilter blurTextBgColorFilter;
    public Path blurTextClipPath;
    public boolean drawFromStart;
    public boolean hasBlur;
    public int height;
    public ImageReceiver imageReceiver;
    public ValueAnimator roundRadiusAnimator;
    public int width;

    public BackupImageView(Context context) {
        super(context);
        this.width = -1;
        this.height = -1;
        this.applyAttach = true;
        ImageReceiver imageReceiverCreateImageReciever = createImageReciever();
        this.imageReceiver = imageReceiverCreateImageReciever;
        imageReceiverCreateImageReciever.setCrossfadeByScale(0.0f);
        this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
        this.imageReceiver.setDelegate(new ColorPicker$$ExternalSyntheticLambda6(this, 8));
    }

    public final void checkCreateBlurredImage() {
        Bitmap bitmap;
        if (!this.hasBlur || this.blurImageReceiver.getBitmap() != null || this.imageReceiver.getBitmap() == null || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
        invalidate();
    }

    public ImageReceiver createImageReciever() {
        return new ImageReceiver(this);
    }

    public AnimatedEmojiDrawable getAnimatedEmojiDrawable() {
        return this.animatedEmojiDrawable;
    }

    public AvatarDrawable getAvatarDrawable() {
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        }
        return this.avatarDrawable;
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public int[] getRoundRadius() {
        return this.imageReceiver.getRoundRadius();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        if (this.applyAttach) {
            this.imageReceiver.onAttachedToWindow();
        }
        if (this.blurAllowed) {
            this.blurImageReceiver.onAttachedToWindow();
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        if (this.applyAttach) {
            this.imageReceiver.onDetachedFromWindow();
        }
        if (this.blurAllowed) {
            this.blurImageReceiver.onDetachedFromWindow();
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        ColorFilter colorFilter;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : this.imageReceiver;
        if (imageReceiver == null) {
            return;
        }
        if (animatedEmojiDrawable != null && (colorFilter = this.animatedEmojiDrawableColorFilter) != null) {
            animatedEmojiDrawable.setColorFilter(colorFilter);
        }
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            if (this.blurAllowed) {
                this.blurImageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.drawFromStart) {
            imageReceiver.setImageCoords(0.0f, 0.0f, i2, i);
            if (this.blurAllowed) {
                this.blurImageReceiver.setImageCoords(0.0f, 0.0f, this.width, this.height);
            }
        } else {
            float width = (getWidth() - this.width) / 2;
            int height = getHeight();
            int i3 = this.height;
            imageReceiver.setImageCoords(width, (height - i3) / 2, this.width, i3);
            if (this.blurAllowed) {
                ImageReceiver imageReceiver2 = this.blurImageReceiver;
                float width2 = (getWidth() - this.width) / 2;
                int height2 = getHeight();
                int i4 = this.height;
                imageReceiver2.setImageCoords(width2, (height2 - i4) / 2, this.width, i4);
            }
        }
        imageReceiver.draw(canvas);
        if (this.blurAllowed) {
            this.blurImageReceiver.draw(canvas);
        }
    }

    public final void onNewImageSet() {
        if (this.hasBlur) {
            if (this.blurImageReceiver.getBitmap() != null && !this.blurImageReceiver.getBitmap().isRecycled()) {
                this.blurImageReceiver.getBitmap().recycle();
            }
            this.blurImageReceiver.setImageBitmap((Bitmap) null);
            checkCreateBlurredImage();
        }
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
        if (this.attached && animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z) {
        this.imageReceiver.setAspectFit(z);
    }

    public void setBlurAllowed(boolean z) {
        if (this.attached) {
            throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
        }
        this.blurAllowed = z;
        if (z) {
            this.blurImageReceiver = new ImageReceiver();
        }
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.blurText = null;
            return;
        }
        this.blurText = new Text(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.blurTextBgColorFilter == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.blurTextBgColorFilter = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.imageReceiver.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.animatedEmojiDrawableColorFilter = colorFilter;
        invalidate();
    }

    public final void setForUserOrChat(TLObject tLObject, AvatarDrawable avatarDrawable) {
        this.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        onNewImageSet();
    }

    public void setHasBlur(boolean z) {
        if (z && !this.blurAllowed) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.hasBlur = z;
        if (!z) {
            if (this.blurImageReceiver.getBitmap() != null && !this.blurImageReceiver.getBitmap().isRecycled()) {
                this.blurImageReceiver.getBitmap().recycle();
            }
            this.blurImageReceiver.setImageBitmap((Bitmap) null);
        }
        checkCreateBlurredImage();
    }

    public final void setImage(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        setImage(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void setImage$1(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        setImage(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imageReceiver.setImageBitmap(bitmap);
        onNewImageSet();
    }

    public void setImageDrawable(Drawable drawable) {
        this.imageReceiver.setImageBitmap(drawable);
        onNewImageSet();
    }

    public void setImageResource(int i) {
        this.imageReceiver.setImageBitmap(getResources().getDrawable(i));
        invalidate();
        onNewImageSet();
    }

    public void setLayerNum(int i) {
        this.imageReceiver.setLayerNum(i);
    }

    public final void setOrientation(int i, int i2, boolean z) {
        this.imageReceiver.setOrientation(i, i2, true);
    }

    public void setRoundRadius(int i) {
        this.imageReceiver.setRoundRadius(i);
        if (this.blurAllowed) {
            this.blurImageReceiver.setRoundRadius(i);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.imageReceiver.getDrawable() || drawable == this.imageReceiver.getImageDrawable() || super.verifyDrawable(drawable);
    }

    public final void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        onNewImageSet();
    }

    public final void setImage(String str, String str2, Drawable drawable) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public final void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i, Object obj) {
        this.imageReceiver.setImage(imageLocation, str, imageLocation2, str2, drawable, i, str3, obj, 0);
        onNewImageSet();
    }
}
