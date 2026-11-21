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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.nr;
public final class m6 extends Drawable {
    public final int f44604a;
    public final Path f44605b;
    public final Paint f44606c;
    public final Object d;
    public final Object f44607e;

    public m6(org.telegram.ui.l0 l0Var) {
        this.f44604a = 1;
        this.f44607e = l0Var;
        this.f44605b = new Path();
        Paint paint = new Paint(1);
        this.f44606c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.d = new org.telegram.ui.Components.d6(new org.telegram.ui.web.z0(this, 1), 350L, nr.h, 0);
    }

    public void c() {
        invalidateSelf();
        ((org.telegram.ui.l0) this.f44607e).P.setContentDescription(gd.N0(2131750570, null));
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f44604a) {
            case 0:
                canvas.drawPath(this.f44605b, this.f44606c);
                return;
            default:
                float d = ((org.telegram.ui.Components.d6) this.d).d(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f10 = 0.57f * width;
                Path path = this.f44605b;
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
                Paint paint = this.f44606c;
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
        switch (this.f44604a) {
            case 1:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f44604a) {
            case 1:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f44604a) {
            case 0:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f44604a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.f44605b;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.f44607e, Path.Direction.CW);
                this.f44606c.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f44604a) {
            case 0:
                this.f44606c.setAlpha(i7);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f44604a) {
            case 0:
                this.f44606c.setColorFilter(colorFilter);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    public m6() {
        this.f44604a = 0;
        this.f44606c = new Paint(1);
        this.f44605b = new Path();
        this.d = new RectF();
        this.f44607e = new float[]{org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final void a(int i7) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
