package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class fp extends vv0 {

    public final int f28422a;

    public boolean f28423b;

    public long f28424c;
    public boolean d;

    public float f28425e;

    public int f28426f;

    public final Paint f28427g;
    public final Object h;

    public fp() {
        this.f28422a = 0;
        this.f28424c = 0L;
        this.f28423b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.f28427g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.2f));
    }

    @Override
    public final void b(int i10) {
        switch (this.f28422a) {
            case 0:
                if (this.f28426f != i10) {
                    ((Paint) this.h).setColor(i10);
                    this.f28427g.setColor(i10);
                }
                this.f28426f = i10;
                break;
            default:
                Paint paint = this.f28427g;
                if (paint != null) {
                    paint.setColor(i10);
                }
                break;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28422a) {
            case 0:
                break;
            default:
                this.f28423b = z10;
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.f28422a) {
            case 0:
                this.f28424c = System.currentTimeMillis();
                this.f28423b = true;
                invalidateSelf();
                break;
            default:
                this.f28424c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                break;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float fDp;
        float fDpf2;
        switch (this.f28422a) {
            case 0:
                float fMin = Math.min(this.f28425e, 1.0f);
                float interpolation = er.f28124i.getInterpolation(fMin < 0.3f ? fMin / 0.3f : 1.0f);
                er erVar = er.f28123g;
                float interpolation2 = erVar.getInterpolation(fMin < 0.3f ? 0.0f : (fMin - 0.3f) / 0.7f);
                if (this.d) {
                    fDp = com.google.android.recaptcha.internal.a.z(1.0f, interpolation, AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f), AndroidUtilities.dp(2.1f) * interpolation);
                    fDpf2 = (1.0f - erVar.getInterpolation(this.f28425e / 2.0f)) * AndroidUtilities.dpf2(1.5f);
                } else {
                    fDp = ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f)) * interpolation) + ((1.0f - interpolation) * AndroidUtilities.dp(2.1f));
                    fDpf2 = AndroidUtilities.dpf2(1.5f) * er.h.getInterpolation(this.f28425e / 2.0f);
                }
                float fDp2 = AndroidUtilities.dp(11.0f) / 2.0f;
                float fDpf3 = AndroidUtilities.dpf2(2.0f);
                float fDpf4 = (AndroidUtilities.dpf2(0.5f) * interpolation) - (AndroidUtilities.dpf2(0.5f) * interpolation2);
                Paint paint = this.f28427g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.g6.f23049d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.g6.f23032c2;
                }
                if (paint.getStrokeWidth() != AndroidUtilities.dp(0.8f)) {
                    paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
                }
                for (int i10 = 0; i10 < 2; i10++) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(0.2f) + (paint.getStrokeWidth() / 2.0f) + fDpf2 + (AndroidUtilities.dp(9.0f) * i10) + getBounds().left, AndroidUtilities.dpf2(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, fDpf4, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(11.0f) - fDpf4);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(fDp, fDp2, fDpf3, paint2);
                    canvas.restore();
                }
                if (this.f28423b) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = jCurrentTimeMillis - this.f28424c;
                    this.f28424c = jCurrentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f10 = (j10 / 500.0f) + this.f28425e;
                    this.f28425e = f10;
                    if (f10 >= 2.0f) {
                        this.f28425e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                }
                break;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.f28427g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.g6.f23049d2;
                }
                Paint paint4 = paint3;
                if (paint4.getStrokeWidth() != AndroidUtilities.dp(2.0f)) {
                    paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
                }
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(this.f28423b ? 1.0f : 2.0f) + (AndroidUtilities.dp(14.0f) / 2));
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i11 == 0) {
                        paint4.setAlpha((int) (this.f28426f * this.f28425e));
                    } else if (i11 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.f28425e) * this.f28426f));
                    } else {
                        paint4.setAlpha(this.f28426f);
                    }
                    float fDp3 = (AndroidUtilities.dp(4.0f) * this.f28425e) + (AndroidUtilities.dp(4.0f) * i11);
                    float f11 = -fDp3;
                    rectF2.set(f11, f11, fDp3, fDp3);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j11 = jCurrentTimeMillis2 - this.f28424c;
                    this.f28424c = jCurrentTimeMillis2;
                    if (j11 > 50) {
                        j11 = 50;
                    }
                    this.f28425e = (j11 / 800.0f) + this.f28425e;
                    while (true) {
                        float f12 = this.f28425e;
                        if (f12 <= 1.0f) {
                            a();
                        } else {
                            this.f28425e = f12 - 1.0f;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void e() {
        switch (this.f28422a) {
            case 0:
                this.f28423b = false;
                break;
            default:
                this.d = false;
                break;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f28422a) {
            case 0:
                return AndroidUtilities.dp(18.0f);
            default:
                return AndroidUtilities.dp(14.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f28422a) {
            case 0:
                return AndroidUtilities.dp(20.0f);
            default:
                return AndroidUtilities.dp(18.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28422a) {
        }
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28422a) {
            case 0:
                break;
            default:
                this.f28426f = i10;
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f28422a;
    }

    public fp(boolean z10) {
        this.f28422a = 1;
        this.f28423b = false;
        this.f28424c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f28426f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.f28427g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    private final void f(int i10) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
