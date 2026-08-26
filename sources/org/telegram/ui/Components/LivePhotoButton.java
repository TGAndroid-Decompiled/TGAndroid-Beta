package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class LivePhotoButton extends View {
    public final AnimatedFloat animatedValue;
    public final Paint cutPaint;
    public final Drawable icon;
    public boolean value;
    public final Paint whitePaint;

    public LivePhotoButton(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.cutPaint = paint2;
        this.animatedValue = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
        this.icon = context.getResources().getDrawable(R.drawable.media_live_on).mutate();
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(-65536);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f = this.animatedValue.set(!this.value);
        int width = getWidth();
        Drawable drawable = this.icon;
        drawable.setBounds((width - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        Rect bounds = drawable.getBounds();
        float fWidth = (bounds.width() * 0.325f) + bounds.left;
        float fHeight = (bounds.height() * 0.152f) + bounds.top;
        float fHeight2 = bounds.bottom - (bounds.height() * 0.152f);
        float fWidth2 = bounds.right - (bounds.width() * 0.101f);
        if (f > 0.0f) {
            Paint paint = this.cutPaint;
            paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.draw(canvas);
            if (this.value) {
                canvas.drawLine(fWidth2 - AndroidUtilities.dp(4.0f), fHeight2 - AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(fWidth2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + fWidth, f), AndroidUtilities.lerp(fHeight2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + fHeight, f), paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(fWidth + AndroidUtilities.dp(4.0f), fHeight + AndroidUtilities.dp(4.0f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + fWidth, fWidth2 - AndroidUtilities.dp(4.0f), f), AndroidUtilities.lerp(AndroidUtilities.dp(4.0f) + fHeight, fHeight2 - AndroidUtilities.dp(4.0f), f), paint);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
            drawable.draw(canvas2);
        }
        if (f > 0.0f) {
            Paint paint2 = this.whitePaint;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (this.value) {
                canvas2.drawLine(fWidth2, fHeight2, AndroidUtilities.lerp(fWidth2, fWidth, f), AndroidUtilities.lerp(fHeight2, fHeight, f), paint2);
            } else {
                canvas.drawLine(fWidth, fHeight, AndroidUtilities.lerp(fWidth, fWidth2, f), AndroidUtilities.lerp(fHeight, fHeight2, f), paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }
}
