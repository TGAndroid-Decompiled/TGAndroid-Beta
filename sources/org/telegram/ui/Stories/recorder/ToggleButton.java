package org.telegram.ui.Stories.recorder;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class ToggleButton extends View implements FlashViews.Invertable {
    public Bitmap activeBitmap;
    public final Paint activeBitmapPaint;
    public final Paint activePaint;
    public final int activeResId;
    public final Path clipPath;
    public final Drawable drawable;
    public float value;
    public final AnimatedFloat valueAnimated;

    public ToggleButton(Activity activity, int i, int i2) {
        super(activity);
        Paint paint = new Paint(1);
        this.activePaint = paint;
        Paint paint2 = new Paint(3);
        this.activeBitmapPaint = paint2;
        this.valueAnimated = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.clipPath = new Path();
        this.drawable = activity.getResources().getDrawable(i).mutate();
        this.activeResId = i2;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.activeBitmap == null) {
            this.activeBitmap = BitmapFactory.decodeResource(getResources(), this.activeResId);
        }
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

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.valueAnimated.set(this.value);
        Drawable drawable = this.drawable;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (f <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (f < 1.0f) {
            canvas.save();
            Path path = this.clipPath;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * f, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
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
    public void setInvert(float f) {
        this.drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.activePaint.setColor(ColorUtils.blendARGB(f, -1, -16777216));
    }

    public void setValue(boolean z) {
        this.value = z ? 1.0f : 0.0f;
        invalidate();
    }
}
