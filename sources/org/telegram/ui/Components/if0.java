package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class if0 implements ri.a, dh.b, pi.a {
    public final ri.a f34727a;
    public final Paint f34728b = new Paint(1);
    public final Paint f34729c = new Paint();
    public RadialGradient d;
    public int f34730e;
    public float f34731f;
    public final jf0 h;

    public if0(jf0 jf0Var, hf0 hf0Var) {
        this.h = jf0Var;
        this.f34727a = hf0Var;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final fh.g b() {
        return new fh.g(this, this, this);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        jf0 jf0Var = this.h;
        ri.a aVar = this.f34727a;
        if (aVar != null) {
            f12 = jf0Var.f35005l;
        } else {
            f12 = 0.0f;
        }
        int i11 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        pi.a aVar2 = null;
        if (i11 < 0) {
            oi.c cVar = jf0Var.f34997b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.d(f10, f11, i7, canvas, rectF);
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - jf0Var.f35004k;
            if (f14 > 0.0f) {
                canvas2.save();
                float f15 = 1.0f / i10;
                canvas2.scale(f15, f15);
                f13 = f10;
                canvas2.translate(-f13, -f11);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f14, i10 * 2);
                canvas2.restore();
            } else {
                f13 = f10;
            }
        } else {
            f13 = f10;
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f12 > 0.0f) {
            if (i11 < 0) {
                canvas2.saveLayerAlpha(null, (int) (f12 * 255.0f));
            }
            if (aVar instanceof pi.a) {
                aVar2 = (pi.a) aVar;
            }
            aVar2.d(f13, f11, i10, canvas2, rectF2);
            if (i11 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14;
        ri.a aVar = this.f34727a;
        jf0 jf0Var = this.h;
        if (aVar != null) {
            f14 = jf0Var.f35005l;
        } else {
            f14 = 0.0f;
        }
        int i7 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
        if (i7 < 0) {
            if (jf0Var.f34997b != null && canvas.isHardwareAccelerated()) {
                jf0Var.f34997b.e(canvas, f10, f11, f12, f13);
            } else {
                float f15 = jf0Var.f35004k;
                if (f15 > 0.0f) {
                    int r12 = org.telegram.ui.ActionBar.l6.r1(f15 * 0.5f, -16777216);
                    Paint paint = this.f34729c;
                    paint.setColor(r12);
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
            }
            float f16 = 1.0f - jf0Var.f35004k;
            if (f16 > 0.0f) {
                i(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (i7 < 0) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.f34727a.e(canvas, f10, f11, f12, f13);
            if (i7 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int f() {
        return j().f();
    }

    @Override
    public final int g() {
        return j().g();
    }

    @Override
    public final boolean h() {
        oi.c cVar = this.h.f34997b;
        pi.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        ri.a aVar2 = this.f34727a;
        if (aVar2 instanceof pi.a) {
            aVar = (pi.a) aVar2;
        }
        if (cVar != null && cVar.f() > 1) {
            if (aVar2 == null || (aVar != null && aVar.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        jf0 jf0Var = this.h;
        boolean z9 = jf0Var.f35003j;
        Paint paint = this.f34728b;
        if (z9) {
            float f16 = f12 - f10;
            float max = Math.max(1.0f, 0.65f * f16);
            if (this.d == null || this.f34730e != jf0Var.f35002i || this.f34731f != max) {
                this.f34730e = jf0Var.f35002i;
                this.f34731f = max;
                this.d = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.l6.r1(0.8f, jf0Var.f35002i), jf0Var.f35002i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            paint.setShader(this.d);
            paint.setColor(-16777216);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f15), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(org.telegram.ui.ActionBar.l6.r1(f14, jf0Var.f35002i));
        canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
    }

    public final pi.a j() {
        oi.c cVar = this.h.f34997b;
        pi.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        ri.a aVar2 = this.f34727a;
        if (aVar2 instanceof pi.a) {
            aVar = (pi.a) aVar2;
        }
        if (aVar != null && cVar.f() >= aVar.f()) {
            return aVar;
        }
        return cVar;
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
