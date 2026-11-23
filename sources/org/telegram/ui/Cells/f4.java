package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.nr;
public final class f4 {
    public float f30636a;
    public float f30637b;
    public float f30638c;
    public boolean f30639e;
    public final org.telegram.ui.Components.w9 f30640f;
    public final org.telegram.ui.Components.w9 f30641g;
    public boolean h;
    public int f30642i;
    public float d = 0.0f;
    public float f30643j = 0.0f;

    public f4(int i7, int i10) {
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(6);
        this.f30640f = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(8);
        this.f30641g = w9Var2;
        float f10 = i7;
        w9Var.f41713a = f10;
        float f11 = i10;
        w9Var.f41714b = f11;
        w9Var2.f41713a = f10;
        w9Var2.f41714b = f11;
        w9Var.b();
        w9Var2.b();
        int i11 = org.telegram.ui.ActionBar.m6.f29464hh;
        w9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 38));
        w9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = nr.f37962g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f30636a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f30639e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f30637b = f11;
        this.f30638c = (f11 - this.f30636a) / 200.0f;
    }

    public final void d(int i7) {
        this.h = true;
        this.f30640f.d.setColor(i7);
    }

    public final void e(View view, boolean z10) {
        if (this.f30639e != z10) {
            view.invalidate();
        }
        this.f30639e = z10;
    }

    public final void f() {
        float f10 = this.f30637b;
        float f11 = this.f30636a;
        if (f10 != f11) {
            float f12 = this.f30638c;
            float f13 = (16.0f * f12) + f11;
            this.f30636a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f30636a = f10;
                }
            } else if (f13 < f10) {
                this.f30636a = f10;
            }
        }
        boolean z10 = this.f30639e;
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
