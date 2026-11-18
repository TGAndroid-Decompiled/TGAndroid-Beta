package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lr;
public final class e4 {
    public float f30553a;
    public float f30554b;
    public float f30555c;
    public boolean f30556e;
    public final org.telegram.ui.Components.w9 f30557f;
    public final org.telegram.ui.Components.w9 f30558g;
    public boolean h;
    public int f30559i;
    public float d = 0.0f;
    public float f30560j = 0.0f;

    public e4(int i7, int i10) {
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(6);
        this.f30557f = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(8);
        this.f30558g = w9Var2;
        float f10 = i7;
        w9Var.f41628a = f10;
        float f11 = i10;
        w9Var.f41629b = f11;
        w9Var2.f41628a = f10;
        w9Var2.f41629b = f11;
        w9Var.b();
        w9Var2.b();
        int i11 = org.telegram.ui.ActionBar.n6.f29479hh;
        w9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 38));
        w9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = lr.f37209g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f30553a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f30556e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f30554b = f11;
        this.f30555c = (f11 - this.f30553a) / 200.0f;
    }

    public final void d(int i7) {
        this.h = true;
        this.f30557f.d.setColor(i7);
    }

    public final void e(View view, boolean z10) {
        if (this.f30556e != z10) {
            view.invalidate();
        }
        this.f30556e = z10;
    }

    public final void f() {
        float f10 = this.f30554b;
        float f11 = this.f30553a;
        if (f10 != f11) {
            float f12 = this.f30555c;
            float f13 = (16.0f * f12) + f11;
            this.f30553a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f30553a = f10;
                }
            } else if (f13 < f10) {
                this.f30553a = f10;
            }
        }
        boolean z10 = this.f30556e;
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
