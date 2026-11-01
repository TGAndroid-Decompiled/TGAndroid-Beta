package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gr;
public final class g4 {
    public float f21914a;
    public float f21915b;
    public float f21916c;
    public boolean e;
    public final org.telegram.ui.Components.m9 f21917f;
    public final org.telegram.ui.Components.m9 f21918g;
    public boolean h;
    public int f21919i;
    public float d = 0.0f;
    public float f21920j = 0.0f;

    public g4(int i10, int i11) {
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(6);
        this.f21917f = m9Var;
        org.telegram.ui.Components.m9 m9Var2 = new org.telegram.ui.Components.m9(8);
        this.f21918g = m9Var2;
        float f7 = i10;
        m9Var.f28417a = f7;
        float f10 = i11;
        m9Var.f28418b = f10;
        m9Var2.f28417a = f7;
        m9Var2.f28418b = f10;
        m9Var.b();
        m9Var2.b();
        int i12 = org.telegram.ui.ActionBar.t6.f20958eh;
        m9Var.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 38));
        m9Var2.d.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = gr.f26524g.getInterpolation(this.d);
        return c3.i0.z(1.0f, interpolation, 1.0f, ((this.f21914a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f21915b = f10;
        this.f21916c = (f10 - this.f21914a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f21917f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f21915b;
        float f10 = this.f21914a;
        if (f7 != f10) {
            float f11 = this.f21916c;
            float f12 = (16.0f * f11) + f10;
            this.f21914a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f21914a = f7;
                }
            } else if (f12 < f7) {
                this.f21914a = f7;
            }
        }
        boolean z10 = this.e;
        if (z10) {
            float f13 = this.d;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.045714285f;
                this.d = f14;
                if (f14 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f15 = this.d;
            if (f15 != 0.0f) {
                float f16 = f15 - 0.045714285f;
                this.d = f16;
                if (f16 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
    }
}
