package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
public final class jg0 implements hi.a, tg.a {
    public final hi.a f27371a;
    public final Paint f27372b = new Paint(1);
    public RadialGradient f27373c;
    public int d;
    public float e;
    public final kg0 f27374f;

    public jg0(kg0 kg0Var, hi.a aVar) {
        this.f27374f = kg0Var;
        this.f27371a = aVar;
    }

    @Override
    public final vg.f a() {
        return new vg.f(this);
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14;
        hi.a aVar = this.f27371a;
        kg0 kg0Var = this.f27374f;
        if (aVar != null) {
            f13 = kg0Var.f27759l;
        } else {
            f13 = 0.0f;
        }
        int i10 = (f13 > 1.0f ? 1 : (f13 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            if (kg0Var.f27752b != null && canvas.isHardwareAccelerated()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kg0Var.f27752b.e(canvas, f7, f10, f11, f12);
            }
            if (z10) {
                f14 = 1.0f - kg0Var.f27758k;
            } else {
                f14 = 1.0f;
            }
            if (f14 > 0.0f) {
                boolean z11 = kg0Var.f27757j;
                Paint paint = this.f27372b;
                if (z11) {
                    float f15 = f11 - f7;
                    float max = Math.max(1.0f, 0.65f * f15);
                    if (this.f27373c == null || this.d != kg0Var.f27756i || this.e != max) {
                        this.d = kg0Var.f27756i;
                        this.e = max;
                        this.f27373c = new RadialGradient(0.0f, 0.0f, max, org.telegram.ui.ActionBar.t6.r1(0.8f, kg0Var.f27756i), kg0Var.f27756i, Shader.TileMode.CLAMP);
                    }
                    canvas.save();
                    float f16 = (f7 + f11) / 2.0f;
                    float f17 = (f10 + f12) / 2.0f;
                    canvas.translate(f16, f17);
                    paint.setShader(this.f27373c);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (f14 * 255.0f));
                    canvas.drawRect(f7 - f16, f10 - f17, f15 / 2.0f, (f12 - f10) / 2.0f, paint);
                    canvas.restore();
                } else {
                    paint.setShader(null);
                    paint.setColor(org.telegram.ui.ActionBar.t6.r1(f14, kg0Var.f27756i));
                    canvas.drawRect(f7, f10, f11, f12, paint);
                }
            }
        }
        if (f13 > 0.0f) {
            if (i10 < 0) {
                canvas.saveLayerAlpha(f7, f10, f11, f12, (int) (f13 * 255.0f));
            }
            this.f27371a.e(canvas, f7, f10, f11, f12);
            if (i10 < 0) {
                canvas.restore();
            }
        }
    }
}
