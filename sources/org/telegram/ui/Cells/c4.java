package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.qr;
public final class c4 {
    public float f19847a;
    public float f19848b;
    public float f19849c;
    public boolean e;
    public final org.telegram.ui.Components.z9 f19850f;
    public final org.telegram.ui.Components.z9 f19851g;
    public boolean h;
    public int f19852i;
    public float d = 0.0f;
    public float f19853j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(6);
        this.f19850f = z9Var;
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(8);
        this.f19851g = z9Var2;
        float f7 = i10;
        z9Var.f30501a = f7;
        float f10 = i11;
        z9Var.f30502b = f10;
        z9Var2.f30501a = f7;
        z9Var2.f30502b = f10;
        z9Var.b();
        z9Var2.b();
        int i12 = org.telegram.ui.ActionBar.i6.f19080qg;
        z9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 38));
        z9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = qr.f27421g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f19847a * 0.2f) + 0.9f) * interpolation);
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
        this.f19848b = f10;
        this.f19849c = (f10 - this.f19847a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f19850f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f19848b;
        float f10 = this.f19847a;
        if (f7 != f10) {
            float f11 = this.f19849c;
            float f12 = (16.0f * f11) + f10;
            this.f19847a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f19847a = f7;
                }
            } else if (f12 < f7) {
                this.f19847a = f7;
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
