package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class kg0 implements hi.a, tg.a, fi.a {
    public final hi.a f27841a;
    public final Paint f27842b = new Paint(1);
    public RadialGradient f27843c;
    public int d;
    public float e;
    public final lg0 f27844f;

    public kg0(lg0 lg0Var, jg0 jg0Var) {
        this.f27844f = lg0Var;
        this.f27841a = jg0Var;
    }

    @Override
    public final int a() {
        return j().a();
    }

    @Override
    public final vg.f b() {
        return new vg.f(this, this, this);
    }

    @Override
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        float f11;
        float f12;
        int i11;
        Canvas canvas2;
        RectF rectF2;
        lg0 lg0Var = this.f27844f;
        hi.a aVar = this.f27841a;
        if (aVar != null) {
            f11 = lg0Var.f28165l;
        } else {
            f11 = 0.0f;
        }
        int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        fi.a aVar2 = null;
        if (i12 < 0) {
            ei.d dVar = lg0Var.f28158b;
            if (dVar == null) {
                dVar = null;
            }
            dVar.d(f7, f10, i10, canvas, rectF);
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
            float f13 = 1.0f - lg0Var.f28164k;
            if (f13 > 0.0f) {
                canvas2.save();
                float f14 = 1.0f / i11;
                canvas2.scale(f14, f14);
                f12 = f7;
                canvas2.translate(-f12, -f10);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f13, i11 * 2);
                canvas2.restore();
            } else {
                f12 = f7;
            }
        } else {
            f12 = f7;
            i11 = i10;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f11 > 0.0f) {
            if (i12 < 0) {
                canvas2.saveLayerAlpha(null, (int) (f11 * 255.0f));
            }
            if (aVar instanceof fi.a) {
                aVar2 = (fi.a) aVar;
            }
            aVar2.d(f12, f10, i11, canvas2, rectF2);
            if (i12 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        hi.a aVar = this.f27841a;
        lg0 lg0Var = this.f27844f;
        if (aVar != null) {
            f13 = lg0Var.f28165l;
        } else {
            f13 = 0.0f;
        }
        float f14 = 1.0f;
        int i10 = (f13 > 1.0f ? 1 : (f13 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            if (lg0Var.f28158b != null && canvas.isHardwareAccelerated() && ei.r.f().f6693a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                lg0Var.f28158b.e(canvas, f7, f10, f11, f12);
            }
            if (z10) {
                f14 = 1.0f - lg0Var.f28164k;
            }
            float f15 = f14;
            if (f15 > 0.0f) {
                i(canvas, f7, f10, f11, f12, f15, 0.0f);
            }
        }
        if (f13 > 0.0f) {
            if (i10 < 0) {
                canvas.saveLayerAlpha(f7, f10, f11, f12, (int) (f13 * 255.0f));
            }
            this.f27841a.e(canvas, f7, f10, f11, f12);
            if (i10 < 0) {
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
        ei.d dVar = this.f27844f.f28158b;
        fi.a aVar = null;
        if (dVar == null) {
            dVar = null;
        }
        hi.a aVar2 = this.f27841a;
        if (aVar2 instanceof fi.a) {
            aVar = (fi.a) aVar2;
        }
        if (ei.r.f().f6693a && dVar != null && dVar.f() > 1) {
            if (aVar2 == null || (aVar != null && aVar.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14) {
        lg0 lg0Var = this.f27844f;
        boolean z10 = lg0Var.f28163j;
        Paint paint = this.f27842b;
        if (z10) {
            float f15 = f11 - f7;
            float max = Math.max(1.0f, 0.65f * f15);
            if (this.f27843c == null || this.d != lg0Var.f28162i || this.e != max) {
                this.d = lg0Var.f28162i;
                this.e = max;
                this.f27843c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.t6.r1(0.8f, lg0Var.f28162i), lg0Var.f28162i, Shader.TileMode.CLAMP);
            }
            canvas.save();
            canvas.translate((f7 + f11) / 2.0f, (f10 + f12) / 2.0f);
            paint.setShader(this.f27843c);
            paint.setColor(-16777216);
            paint.setAlpha((int) (f13 * 255.0f));
            canvas.drawRect(((f7 - f11) / 2.0f) - f14, ((f10 - f12) / 2.0f) - f14, (f15 / 2.0f) + f14, c3.i0.B(f12, f10, 2.0f, f14), paint);
            canvas.restore();
            return;
        }
        paint.setShader(null);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(f13, lg0Var.f28162i));
        canvas.drawRect(f7 - f14, f10 - f14, f11 + f14, f12 + f14, paint);
    }

    public final fi.a j() {
        ei.d dVar = this.f27844f.f28158b;
        fi.a aVar = null;
        if (dVar == null) {
            dVar = null;
        }
        hi.a aVar2 = this.f27841a;
        if (aVar2 instanceof fi.a) {
            aVar = (fi.a) aVar2;
        }
        if (aVar != null && dVar.f() >= aVar.f()) {
            return aVar;
        }
        return dVar;
    }

    @Override
    public final void c(vg.f fVar) {
    }
}
