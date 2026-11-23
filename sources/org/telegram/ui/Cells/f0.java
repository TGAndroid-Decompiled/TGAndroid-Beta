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
public final class f0 extends Drawable {
    public final Drawable f30677a;
    public final Paint f30678b;
    public final Paint f30679c;
    public final Paint d;
    public int f30680e;
    public ColorFilter f30681f;

    public f0(Context context) {
        Paint paint = new Paint(1);
        this.f30678b = paint;
        Paint paint2 = new Paint(1);
        this.f30679c = paint2;
        this.d = new Paint();
        this.f30680e = 255;
        Drawable g10 = i5.c.g(context, 2131232163);
        this.f30677a = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-13628751, PorterDuff.Mode.SRC_IN));
        paint.setShader(new RadialGradient(400.0f, 213.0f, 500.0f, -4811527, -9674273, Shader.TileMode.CLAMP));
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(float f10, float f11, float f12, float f13, Canvas canvas) {
        Drawable drawable = this.f30677a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            drawable.setAlpha(Math.round(this.f30680e * f13));
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12 / intrinsicWidth, f12 / intrinsicHeight);
            canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, Rect rect, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = rect.left;
        float f17 = rect.top;
        canvas.drawLine((f12 * f10) + f16, (f13 * f11) + f17, (f14 * f10) + f16, (f15 * f11) + f17, this.f30679c);
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f30680e != 0) {
            ColorFilter colorFilter = this.f30681f;
            if (colorFilter != null) {
                Paint paint = this.d;
                paint.setColorFilter(colorFilter);
                i7 = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                i7 = -1;
            }
            float width = bounds.width() / 800.0f;
            float height = bounds.height() / 427.0f;
            int i10 = this.f30680e;
            Canvas canvas3 = canvas2;
            Paint paint2 = this.f30678b;
            paint2.setAlpha(i10);
            canvas3.save();
            canvas3.translate(bounds.left, bounds.top);
            canvas3.scale(width, height);
            canvas3.drawRect(0.0f, 0.0f, 800.0f, 427.0f, paint2);
            canvas3.restore();
            int i11 = this.f30680e;
            Paint paint3 = this.f30679c;
            paint3.setAlpha(i11);
            paint3.setStrokeWidth(Math.min(width, height) * 16.4f);
            b(canvas3, bounds, width, height, 449.809f, 246.04f, 483.703f, 212.418f);
            b(canvas3, bounds, width, height, 483.703f, 212.418f, 451.291f, 179.901f);
            b(canvas3, bounds, width, height, 350.197f, 246.04f, 316.302f, 212.418f);
            b(canvas3, bounds, width, height, 316.302f, 212.418f, 348.716f, 179.901f);
            b(canvas3, bounds, width, height, 379.613f, 278.0f, 420.657f, 146.0f);
            canvas3.save();
            canvas3.translate(bounds.left, bounds.top);
            canvas3.scale(width, height);
            a(299.339f, 60.9305f, 56.0f, 0.1629f, canvas3);
            a(500.651f, 60.9305f, 56.0f, 0.1629f, canvas3);
            a(579.018f, 225.477f, 56.0f, 0.2239f, canvas3);
            a(220.979f, 225.477f, 56.0f, 0.2239f, canvas3);
            a(548.102f, 359.18f, 52.0f, 0.1816f, canvas3);
            a(400.0f, 382.172f, 52.0f, 0.123f, canvas3);
            a(251.891f, 359.18f, 52.0f, 0.1816f, canvas3);
            a(698.424f, 175.361f, 42.0f, 0.12f, canvas3);
            a(572.549f, 125.064f, 42.0f, 0.2409f, canvas3);
            a(650.19f, 61.1149f, 42.0f, 0.0764f, canvas3);
            a(399.994f, 18.0016f, 42.0f, 0.1231f, canvas3);
            a(149.799f, 61.1149f, 42.0f, 0.0753f, canvas3);
            a(227.44f, 125.064f, 42.0f, 0.2409f, canvas3);
            a(101.565f, 175.361f, 42.0f, 0.12f, canvas3);
            a(167.057f, 316.916f, 42.0f, 0.15f, canvas3);
            a(114.502f, 408.888f, 42.0f, 0.075f, canvas3);
            a(678.299f, 408.888f, 42.0f, 0.075f, canvas3);
            a(655.947f, 316.916f, 42.0f, 0.15f, canvas3);
            canvas3.restore();
            if (i7 >= 0) {
                canvas3.restoreToCount(i7);
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(427.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(800.0f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
        int max = Math.max(0, Math.min(255, i7));
        if (this.f30680e != max) {
            this.f30680e = max;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30681f != colorFilter) {
            this.f30681f = colorFilter;
            invalidateSelf();
        }
    }
}
