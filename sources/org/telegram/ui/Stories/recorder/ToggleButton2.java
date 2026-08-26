package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class ToggleButton2 extends View implements FlashViews.Invertable {
    public Bitmap activeBitmap;
    public final Paint activeBitmapPaint;
    public final Paint activePaint;
    public final AnimatedFloat animatedSelected;
    public ValueAnimator animator;
    public final Path clipPath;
    public int currentIcon;
    public Drawable drawable;
    public boolean selected;

    public ToggleButton2(Activity activity) {
        super(activity);
        this.clipPath = new Path();
        Paint paint = new Paint(1);
        this.activePaint = paint;
        Paint paint2 = new Paint(3);
        this.activeBitmapPaint = paint2;
        this.animatedSelected = new AnimatedFloat(this, 0L, 380L, CubicBezierInterpolator.EASE_OUT_QUINT);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.drawable == null) {
            return;
        }
        float f = this.animatedSelected.set(this.selected);
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (f <= 0.0f) {
            this.drawable.setBounds(rect);
            this.drawable.draw(canvas);
        } else if (f < 1.0f) {
            canvas.save();
            Path path = this.clipPath;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * f, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            this.drawable.setBounds(rect);
            this.drawable.draw(canvas);
            canvas.restore();
        }
        if (f > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * f, this.activePaint);
            canvas.save();
            Bitmap bitmap = this.activeBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.activeBitmapPaint);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.activeBitmap != null || this.currentIcon == 0) {
            return;
        }
        this.activeBitmap = BitmapFactory.decodeResource(getResources(), this.currentIcon);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.activeBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.activeBitmap = null;
        }
    }

    public void setDrawable(int i) {
        this.drawable = getContext().getResources().getDrawable(i).mutate();
        Bitmap bitmap = this.activeBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.activeBitmap = null;
        }
        if (this.activeBitmap == null && i != 0) {
            this.activeBitmap = BitmapFactory.decodeResource(getResources(), i);
        }
        invalidate();
    }

    public final void setIcon(int i) {
        if (this.currentIcon == i) {
            return;
        }
        this.currentIcon = i;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        setDrawable(i);
    }

    @Override
    public void setInvert(float f) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.activePaint.setColor(ColorUtils.blendARGB(f, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z) {
        this.selected = z;
        invalidate();
    }

    public final void setSelected(boolean z, boolean z2) {
        this.selected = z;
        if (!z2) {
            this.animatedSelected.set(z ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    public final void setIcon(CollageLayoutButton.CollageLayoutDrawable collageLayoutDrawable, boolean z) {
        if (this.drawable == collageLayoutDrawable) {
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (z) {
            this.animator = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.animator.addUpdateListener(new PaintView$$ExternalSyntheticLambda37(1, this, new AtomicBoolean(), collageLayoutDrawable));
            this.animator.start();
            return;
        }
        setDrawable(collageLayoutDrawable);
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
        Bitmap bitmap = this.activeBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.activeBitmap = null;
        }
        if (this.activeBitmap == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.activeBitmap = bitmapCreateBitmap;
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), this.activeBitmap.getHeight());
            drawable.draw(new Canvas(this.activeBitmap));
        }
        invalidate();
    }
}
