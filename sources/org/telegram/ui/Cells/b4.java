package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mr;
public final class b4 {
    public float f20836a;
    public float f20837b;
    public float f20838c;
    public boolean e;
    public final org.telegram.ui.Components.u9 f20839f;
    public final org.telegram.ui.Components.u9 f20840g;
    public boolean h;
    public int f20841i;
    public float d = 0.0f;
    public float f20842j = 0.0f;

    public b4(int i10, int i11) {
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(6);
        this.f20839f = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(8);
        this.f20840g = u9Var2;
        float f10 = i10;
        u9Var.f29139a = f10;
        float f11 = i11;
        u9Var.f29140b = f11;
        u9Var2.f29139a = f10;
        u9Var2.f29140b = f11;
        u9Var.b();
        u9Var2.b();
        int i12 = org.telegram.ui.ActionBar.j6.f20123qg;
        u9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
        u9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = mr.f27123g.getInterpolation(this.d);
        return e2.c.w(1.0f, interpolation, 1.0f, ((this.f20836a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f20837b = f11;
        this.f20838c = (f11 - this.f20836a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f20839f.d.setColor(i10);
    }

    public final void e(View view, boolean z4) {
        if (this.e != z4) {
            view.invalidate();
        }
        this.e = z4;
    }

    public final void f() {
        float f10 = this.f20837b;
        float f11 = this.f20836a;
        if (f10 != f11) {
            float f12 = this.f20838c;
            float f13 = (16.0f * f12) + f11;
            this.f20836a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f20836a = f10;
                }
            } else if (f13 < f10) {
                this.f20836a = f10;
            }
        }
        boolean z4 = this.e;
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
