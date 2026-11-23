package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class wf0 implements ui.a, dh.b, si.a {
    public final ui.a f41766a;
    public final Paint f41767b = new Paint(1);
    public final Paint f41768c = new Paint();
    public RadialGradient d;
    public int f41769e;
    public float f41770f;
    public final xf0 h;

    public wf0(xf0 xf0Var, vf0 vf0Var) {
        this.h = xf0Var;
        this.f41766a = vf0Var;
    }

    @Override
    public final int a() {
        return i().a();
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
        xf0 xf0Var = this.h;
        ui.a aVar = this.f41766a;
        if (aVar != null) {
            f12 = xf0Var.f42035l;
        } else {
            f12 = 0.0f;
        }
        int i11 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        si.a aVar2 = null;
        if (i11 < 0) {
            ri.c cVar = xf0Var.f42027b;
            if (cVar == null) {
                cVar = null;
            }
            cVar.d(f10, f11, i7, canvas, rectF);
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
            float f14 = 1.0f - xf0Var.f42034k;
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
            i10 = i7;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f12 > 0.0f) {
            if (i11 < 0) {
                canvas2.saveLayerAlpha(null, (int) (f12 * 255.0f));
            }
            if (aVar instanceof si.a) {
                aVar2 = (si.a) aVar;
            }
            aVar2.d(f13, f11, i10, canvas2, rectF2);
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
        ri.c cVar = this.h.f42027b;
        si.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        ui.a aVar2 = this.f41766a;
        if (aVar2 instanceof si.a) {
            aVar = (si.a) aVar2;
        }
        if (cVar != null && cVar.e() > 1) {
            if (aVar2 == null || (aVar != null && aVar.g())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15) {
        xf0 xf0Var = this.h;
        boolean z10 = xf0Var.f42033j;
        Paint paint = this.f41767b;
        if (z10) {
            float f16 = f12 - f10;
            float max = Math.max(1.0f, 0.65f * f16);
            if (this.d == null || this.f41769e != xf0Var.f42032i || this.f41770f != max) {
                this.f41769e = xf0Var.f42032i;
                this.f41770f = max;
                this.d = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.m6.r1(0.8f, xf0Var.f42032i), xf0Var.f42032i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            paint.setShader(this.d);
            paint.setColor(-16777216);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(((f10 - f12) / 2.0f) - f15, ((f11 - f13) / 2.0f) - f15, (f16 / 2.0f) + f15, com.google.android.gms.internal.vision.e2.A(f13, f11, 2.0f, f15), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(f14, xf0Var.f42032i));
        canvas.drawRect(f10 - f15, f11 - f15, f12 + f15, f13 + f15, paint);
    }

    public final si.a i() {
        ri.c cVar = this.h.f42027b;
        si.a aVar = null;
        if (cVar == null) {
            cVar = null;
        }
        ui.a aVar2 = this.f41766a;
        if (aVar2 instanceof si.a) {
            aVar = (si.a) aVar2;
        }
        if (aVar != null && cVar.e() >= aVar.e()) {
            return aVar;
        }
        return cVar;
    }

    @Override
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        float f14;
        ui.a aVar = this.f41766a;
        xf0 xf0Var = this.h;
        if (aVar != null) {
            f14 = xf0Var.f42035l;
        } else {
            f14 = 0.0f;
        }
        int i7 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
        if (i7 < 0) {
            if (xf0Var.f42027b != null && canvas.isHardwareAccelerated()) {
                xf0Var.f42027b.o(f10, f11, f12, f13, canvas);
            } else {
                float f15 = xf0Var.f42034k;
                if (f15 > 0.0f) {
                    int r12 = org.telegram.ui.ActionBar.m6.r1(f15 * 0.5f, -16777216);
                    Paint paint = this.f41768c;
                    paint.setColor(r12);
                    canvas.drawRect(f10, f11, f12, f13, paint);
                }
            }
            float f16 = 1.0f - xf0Var.f42034k;
            if (f16 > 0.0f) {
                h(canvas, f10, f11, f12, f13, f16, 0.0f);
            }
        }
        if (f14 > 0.0f) {
            if (i7 < 0) {
                canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
            }
            this.f41766a.o(f10, f11, f12, f13, canvas);
            if (i7 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void c(fh.g gVar) {
    }
}
