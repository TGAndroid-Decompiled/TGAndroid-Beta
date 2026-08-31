package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.pr;
public final class c4 {
    public float f22638a;
    public float f22639b;
    public float f22640c;
    public boolean f22641e;
    public final org.telegram.ui.Components.u9 f22642f;
    public final org.telegram.ui.Components.u9 f22643g;
    public boolean h;
    public int f22644i;
    public float d = 0.0f;
    public float f22645j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(6);
        this.f22642f = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(8);
        this.f22643g = u9Var2;
        float f10 = i10;
        u9Var.f31606a = f10;
        float f11 = i11;
        u9Var.f31607b = f11;
        u9Var2.f31606a = f10;
        u9Var2.f31607b = f11;
        u9Var.b();
        u9Var2.b();
        int i12 = org.telegram.ui.ActionBar.k6.f21903qg;
        u9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i12, false), 38));
        u9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = pr.f30184g.getInterpolation(this.d);
        return e2.c.w(1.0f, interpolation, 1.0f, ((this.f22638a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f22641e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f22639b = f11;
        this.f22640c = (f11 - this.f22638a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f22642f.d.setColor(i10);
    }

    public final void e(View view, boolean z4) {
        if (this.f22641e != z4) {
            view.invalidate();
        }
        this.f22641e = z4;
    }

    public final void f() {
        float f10 = this.f22639b;
        float f11 = this.f22638a;
        if (f10 != f11) {
            float f12 = this.f22640c;
            float f13 = (16.0f * f12) + f11;
            this.f22638a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f22638a = f10;
                }
            } else if (f13 < f10) {
                this.f22638a = f10;
            }
        }
        boolean z4 = this.f22641e;
        if (z4) {
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
        if (!z4) {
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
