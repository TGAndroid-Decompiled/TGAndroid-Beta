package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xq;
public final class e4 {
    public float f29112a;
    public float f29113b;
    public float f29114c;
    public boolean f29115e;
    public final org.telegram.ui.Components.q9 f29116f;
    public final org.telegram.ui.Components.q9 f29117g;
    public boolean h;
    public int f29118i;
    public float d = 0.0f;
    public float f29119j = 0.0f;

    public e4(int i3, int i10) {
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(6);
        this.f29116f = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(8);
        this.f29117g = q9Var2;
        float f10 = i3;
        q9Var.f37381a = f10;
        float f11 = i10;
        q9Var.f37382b = f11;
        q9Var2.f37381a = f10;
        q9Var2.f37382b = f11;
        q9Var.b();
        q9Var2.b();
        int i11 = org.telegram.ui.ActionBar.k6.f27908eh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = xq.f40453g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.y(1.0f, interpolation, 1.0f, ((this.f29112a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f29115e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f29113b = f11;
        this.f29114c = (f11 - this.f29112a) / 200.0f;
    }

    public final void d(int i3) {
        this.h = true;
        this.f29116f.d.setColor(i3);
    }

    public final void e(View view, boolean z10) {
        if (this.f29115e != z10) {
            view.invalidate();
        }
        this.f29115e = z10;
    }

    public final void f() {
        float f10 = this.f29113b;
        float f11 = this.f29112a;
        if (f10 != f11) {
            float f12 = this.f29114c;
            float f13 = (16.0f * f12) + f11;
            this.f29112a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f29112a = f10;
                }
            } else if (f13 < f10) {
                this.f29112a = f10;
            }
        }
        boolean z10 = this.f29115e;
        if (z10) {
            float f14 = this.d;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.045714285f;
                this.d = f15;
                if (f15 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f16 = this.d;
            if (f16 != 0.0f) {
                float f17 = f16 - 0.045714285f;
                this.d = f17;
                if (f17 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
    }
}
