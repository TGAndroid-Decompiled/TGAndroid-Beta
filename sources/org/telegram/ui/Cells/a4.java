package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.jr;
public final class a4 {
    public float f24072a;
    public float f24073b;
    public float f24074c;
    public boolean f24075e;
    public final org.telegram.ui.Components.y9 f24076f;
    public final org.telegram.ui.Components.y9 f24077g;
    public boolean h;
    public int f24078i;
    public float d = 0.0f;
    public float f24079j = 0.0f;

    public a4(int i10, int i11) {
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(6);
        this.f24076f = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(8);
        this.f24077g = y9Var2;
        float f9 = i10;
        y9Var.f34975a = f9;
        float f10 = i11;
        y9Var.f34976b = f10;
        y9Var2.f34975a = f9;
        y9Var2.f34976b = f10;
        y9Var.b();
        y9Var2.b();
        int i12 = org.telegram.ui.ActionBar.g6.f23302qg;
        y9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
        y9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = jr.f29801g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, ((this.f24072a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f9 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f24075e) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f10 = 1.0f;
        } else if (f9 >= 0.0f) {
            f10 = f9;
        }
        this.f24073b = f10;
        this.f24074c = (f10 - this.f24072a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f24076f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.f24075e != z10) {
            view.invalidate();
        }
        this.f24075e = z10;
    }

    public final void f() {
        float f9 = this.f24073b;
        float f10 = this.f24072a;
        if (f9 != f10) {
            float f11 = this.f24074c;
            float f12 = (16.0f * f11) + f10;
            this.f24072a = f12;
            if (f11 > 0.0f) {
                if (f12 > f9) {
                    this.f24072a = f9;
                }
            } else if (f12 < f9) {
                this.f24072a = f9;
            }
        }
        boolean z10 = this.f24075e;
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
