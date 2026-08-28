package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gr;
public final class c4 {
    public float f24186a;
    public float f24187b;
    public float f24188c;
    public boolean f24189e;
    public final org.telegram.ui.Components.t9 f24190f;
    public final org.telegram.ui.Components.t9 f24191g;
    public boolean h;
    public int f24192i;
    public float d = 0.0f;
    public float f24193j = 0.0f;

    public c4(int i9, int i10) {
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(6);
        this.f24190f = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(8);
        this.f24191g = t9Var2;
        float f10 = i9;
        t9Var.f32647a = f10;
        float f11 = i10;
        t9Var.f32648b = f11;
        t9Var2.f32647a = f10;
        t9Var2.f32648b = f11;
        t9Var.b();
        t9Var2.b();
        int i11 = org.telegram.ui.ActionBar.f6.f23239qg;
        t9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 38));
        t9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = gr.f28845g.getInterpolation(this.d);
        return e2.c.z(1.0f, interpolation, 1.0f, ((this.f24186a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f24189e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f24187b = f11;
        this.f24188c = (f11 - this.f24186a) / 200.0f;
    }

    public final void d(int i9) {
        this.h = true;
        this.f24190f.d.setColor(i9);
    }

    public final void e(View view, boolean z10) {
        if (this.f24189e != z10) {
            view.invalidate();
        }
        this.f24189e = z10;
    }

    public final void f() {
        float f10 = this.f24187b;
        float f11 = this.f24186a;
        if (f10 != f11) {
            float f12 = this.f24188c;
            float f13 = (16.0f * f12) + f11;
            this.f24186a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f24186a = f10;
                }
            } else if (f13 < f10) {
                this.f24186a = f10;
            }
        }
        boolean z10 = this.f24189e;
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
