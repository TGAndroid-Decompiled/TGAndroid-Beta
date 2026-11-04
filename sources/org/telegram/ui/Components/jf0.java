package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class jf0 implements si.a, eh.b, qi.a {
    public final si.a f35060a;
    public final Paint f35061b = new Paint(1);
    public RadialGradient f35062c;
    public int d;
    public float f35063e;
    public final kf0 f35064f;

    public jf0(kf0 kf0Var, if0 if0Var) {
        this.f35064f = kf0Var;
        this.f35060a = if0Var;
    }

    @Override
    public final int a() {
        return i().a();
    }

    @Override
    public final gh.g b() {
        return new gh.g(this, this, this);
    }

    @Override
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        int i10;
        Canvas canvas2;
        RectF rectF2;
        kf0 kf0Var = this.f35064f;
        si.a aVar = this.f35060a;
        if (aVar != null) {
            f12 = kf0Var.f35394l;
        } else {
            f12 = 0.0f;
        }
        int i11 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        qi.a aVar2 = null;
        if (i11 < 0) {
            pi.c cVar = kf0Var.f35386b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.c(f10, f11, i3, canvas, rectF);
            i10 = i3;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - kf0Var.f35393k;
            if (f14 > 0.0f) {
                canvas2.save();
                float f15 = 1.0f / i10;
                canvas2.scale(f15, f15);
                f13 = f10;
                canvas2.translate(-f13, -f11);
                h(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f14, i10 * 2);
                canvas2.restore();
            } else {
                f13 = f10;
            }
        } else {
            f13 = f10;
            i10 = i3;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f12 > 0.0f) {
            if (i11 < 0) {
                canvas2.saveLayerAlpha(null, (int) (f12 * 255.0f));
            }
            if (aVar instanceof qi.a) {
                aVar2 = (qi.a) aVar;
            }
            aVar2.c(f13, f11, i10, canvas2, rectF2);
            if (i11 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int e() {
        return i().e();
    }

    @Override
    public final int f() {
        return i().f();
    }

    @Override
    public final boolean g() {
        pi.c cVar = this.f35064f.f35386b;
        qi.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        si.a aVar2 = this.f35060a;
        if (aVar2 instanceof qi.a) {
            aVar = (qi.a) aVar2;
        }
        if (pi.q.f().f53625a && cVar != null && cVar.e() > 1) {
            if (aVar2 == null || (aVar != null && aVar.g())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        kf0 kf0Var = this.f35064f;
        boolean z10 = kf0Var.f35392j;
        Paint paint = this.f35061b;
        if (z10) {
            float f16 = f12 - f10;
            float max = Math.max(1.0f, 0.65f * f16);
            if (this.f35062c == null || this.d != kf0Var.f35391i || this.f35063e != max) {
                this.d = kf0Var.f35391i;
                this.f35063e = max;
                this.f35062c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.k6.r1(0.8f, kf0Var.f35391i), kf0Var.f35391i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            paint.setShader(this.f35062c);
            paint.setColor(-16777216);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.recaptcha.internal.a.z(f13, f11, 2.0f, f15), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(f14, kf0Var.f35391i));
        canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
    }

    public final qi.a i() {
        pi.c cVar = this.f35064f.f35386b;
        qi.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        si.a aVar2 = this.f35060a;
        if (aVar2 instanceof qi.a) {
            aVar = (qi.a) aVar2;
        }
        if (aVar != null && cVar.e() >= aVar.e()) {
            return aVar;
        }
        return cVar;
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z10;
        si.a aVar = this.f35060a;
        kf0 kf0Var = this.f35064f;
        if (aVar != null) {
            f14 = kf0Var.f35394l;
        } else {
            f14 = 0.0f;
        }
        float f15 = 1.0f;
        int i3 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
        if (i3 < 0) {
            if (kf0Var.f35386b != null && canvas.isHardwareAccelerated() && pi.q.f().f53625a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kf0Var.f35386b.l(canvas, f10, f11, f12, f13);
            }
            if (z10) {
                f15 = 1.0f - kf0Var.f35393k;
            }
            float f16 = f15;
            if (f16 > 0.0f) {
                h(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (i3 < 0) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.f35060a.l(canvas, f10, f11, f12, f13);
            if (i3 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void d(gh.g gVar) {
    }
}
