package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class w5 extends Drawable {
    public final int f43294a;
    public final Path f43295b;
    public final Paint f43296c;
    public final Object d;
    public final Object f43297e;

    public w5(org.telegram.ui.l0 l0Var) {
        this.f43294a = 1;
        this.f43297e = l0Var;
        this.f43295b = new Path();
        Paint paint = new Paint(1);
        this.f43296c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.d = new org.telegram.ui.Components.w5(new org.telegram.ui.ActionBar.m5(this, 17), 350L, xq.h, 0);
    }

    public void c() {
        invalidateSelf();
        ((org.telegram.ui.l0) this.f43297e).O.setContentDescription(id.M0(2131750588, null));
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43294a) {
            case 0:
                canvas.drawPath(this.f43295b, this.f43296c);
                return;
            default:
                float d = ((org.telegram.ui.Components.w5) this.d).d(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f10 = 0.57f * width;
                Path path = this.f43295b;
                path.rewind();
                float f11 = f10 / 2.0f;
                path.moveTo(centerX - org.telegram.messenger.g0.T1(f11, (-f10) / 2.0f, d), centerY);
                float f12 = f11 + centerX;
                path.lineTo(f12, centerY);
                float f13 = f12 - (0.27f * width);
                float f14 = (0.54f * width) / 2.0f;
                path.moveTo(f13, centerY - f14);
                path.lineTo(f12, centerY);
                path.lineTo(f13, f14 + centerY);
                canvas.save();
                Paint paint = this.f43296c;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                canvas.translate(0.0f, (-width) * 0.1f * d);
                canvas.rotate(d * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f43294a) {
            case 1:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f43294a) {
            case 1:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43294a) {
            case 0:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f43294a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.f43295b;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.f43297e, Path.Direction.CW);
                this.f43296c.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f43294a) {
            case 0:
                this.f43296c.setAlpha(i7);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f43294a) {
            case 0:
                this.f43296c.setColorFilter(colorFilter);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    public w5() {
        this.f43294a = 0;
        this.f43296c = new Paint(1);
        this.f43295b = new Path();
        this.d = new RectF();
        this.f43297e = new float[]{org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final void a(int i7) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
