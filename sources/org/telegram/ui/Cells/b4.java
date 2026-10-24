package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zr;
public final class b4 {
    public float f22132a;
    public float f22133b;
    public float f22134c;
    public boolean e;
    public final org.telegram.ui.Components.z9 f22135f;
    public final org.telegram.ui.Components.z9 f22136g;
    public boolean h;
    public int f22137i;
    public float d = 0.0f;
    public float f22138j = 0.0f;

    public b4(int i10, int i11) {
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(6);
        this.f22135f = z9Var;
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(8);
        this.f22136g = z9Var2;
        float f7 = i10;
        z9Var.f33181a = f7;
        float f10 = i11;
        z9Var.f33182b = f10;
        z9Var2.f33181a = f7;
        z9Var2.f33182b = f10;
        z9Var.b();
        z9Var2.b();
        int i12 = org.telegram.ui.ActionBar.k6.f21431qg;
        z9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 38));
        z9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = zr.f33338g.getInterpolation(this.d);
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, interpolation, 1.0f, ((this.f22132a * 0.2f) + 0.9f) * interpolation);
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
        this.f22133b = f10;
        this.f22134c = (f10 - this.f22132a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f22135f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f22133b;
        float f10 = this.f22132a;
        if (f7 != f10) {
            float f11 = this.f22134c;
            float f12 = (16.0f * f11) + f10;
            this.f22132a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f22132a = f7;
                }
            } else if (f12 < f7) {
                this.f22132a = f7;
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
