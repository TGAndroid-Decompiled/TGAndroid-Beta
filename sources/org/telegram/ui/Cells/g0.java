package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class g0 extends Drawable {
    public final Drawable f19176a;
    public final Paint f19177b;
    public final Paint f19178c;
    public final Paint d;
    public int e;
    public ColorFilter f19179f;

    public g0(Context context) {
        Paint paint = new Paint(1);
        this.f19177b = paint;
        Paint paint2 = new Paint(1);
        this.f19178c = paint2;
        this.d = new Paint();
        this.e = 255;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_folders_bots).mutate();
        this.f19176a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-13628751, PorterDuff.Mode.SRC_IN));
        paint.setShader(new RadialGradient(400.0f, 213.0f, 500.0f, -4811527, -9674273, Shader.TileMode.CLAMP));
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12) {
        Drawable drawable = this.f19176a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            drawable.setAlpha(Math.round(this.e * f12));
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.save();
            canvas.translate(f7, f10);
            canvas.scale(f11 / intrinsicWidth, f11 / intrinsicHeight);
            canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, Rect rect, float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = rect.left;
        float f16 = rect.top;
        canvas.drawLine((f11 * f7) + f15, (f12 * f10) + f16, (f13 * f7) + f15, (f14 * f10) + f16, this.f19178c);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.e != 0) {
            ColorFilter colorFilter = this.f19179f;
            if (colorFilter != null) {
                Paint paint = this.d;
                paint.setColorFilter(colorFilter);
                i10 = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                i10 = -1;
            }
            float width = bounds.width() / 800.0f;
            float height = bounds.height() / 427.0f;
            int i11 = this.e;
            Paint paint2 = this.f19177b;
            paint2.setAlpha(i11);
            canvas2.save();
            canvas2.translate(bounds.left, bounds.top);
            canvas2.scale(width, height);
            Canvas canvas3 = canvas2;
            canvas3.drawRect(0.0f, 0.0f, 800.0f, 427.0f, paint2);
            canvas3.restore();
            int i12 = this.e;
            Paint paint3 = this.f19178c;
            paint3.setAlpha(i12);
            paint3.setStrokeWidth(Math.min(width, height) * 16.4f);
            b(canvas3, bounds, width, height, 449.809f, 246.04f, 483.703f, 212.418f);
            b(canvas3, bounds, width, height, 483.703f, 212.418f, 451.291f, 179.901f);
            b(canvas3, bounds, width, height, 350.197f, 246.04f, 316.302f, 212.418f);
            b(canvas3, bounds, width, height, 316.302f, 212.418f, 348.716f, 179.901f);
            b(canvas3, bounds, width, height, 379.613f, 278.0f, 420.657f, 146.0f);
            canvas3.save();
            canvas3.translate(bounds.left, bounds.top);
            canvas3.scale(width, height);
            a(canvas3, 299.339f, 60.9305f, 56.0f, 0.1629f);
            a(canvas3, 500.651f, 60.9305f, 56.0f, 0.1629f);
            a(canvas3, 579.018f, 225.477f, 56.0f, 0.2239f);
            a(canvas3, 220.979f, 225.477f, 56.0f, 0.2239f);
            a(canvas3, 548.102f, 359.18f, 52.0f, 0.1816f);
            a(canvas3, 400.0f, 382.172f, 52.0f, 0.123f);
            a(canvas3, 251.891f, 359.18f, 52.0f, 0.1816f);
            a(canvas3, 698.424f, 175.361f, 42.0f, 0.12f);
            a(canvas3, 572.549f, 125.064f, 42.0f, 0.2409f);
            a(canvas3, 650.19f, 61.1149f, 42.0f, 0.0764f);
            a(canvas3, 399.994f, 18.0016f, 42.0f, 0.1231f);
            a(canvas3, 149.799f, 61.1149f, 42.0f, 0.0753f);
            a(canvas3, 227.44f, 125.064f, 42.0f, 0.2409f);
            a(canvas3, 101.565f, 175.361f, 42.0f, 0.12f);
            a(canvas3, 167.057f, 316.916f, 42.0f, 0.15f);
            a(canvas3, 114.502f, 408.888f, 42.0f, 0.075f);
            a(canvas3, 678.299f, 408.888f, 42.0f, 0.075f);
            a(canvas3, 655.947f, 316.916f, 42.0f, 0.15f);
            canvas3.restore();
            if (i10 >= 0) {
                canvas3.restoreToCount(i10);
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(427.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(800.0f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        int max = Math.max(0, Math.min(255, i10));
        if (this.e != max) {
            this.e = max;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f19179f != colorFilter) {
            this.f19179f = colorFilter;
            invalidateSelf();
        }
    }
}
