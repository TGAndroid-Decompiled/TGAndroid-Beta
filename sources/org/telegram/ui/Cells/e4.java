package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wq;
public final class e4 {
    public float f29069a;
    public float f29070b;
    public float f29071c;
    public boolean f29072e;
    public final org.telegram.ui.Components.q9 f29073f;
    public final org.telegram.ui.Components.q9 f29074g;
    public boolean h;
    public int f29075i;
    public float d = 0.0f;
    public float f29076j = 0.0f;

    public e4(int i7, int i10) {
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(6);
        this.f29073f = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(8);
        this.f29074g = q9Var2;
        float f10 = i7;
        q9Var.f37178a = f10;
        float f11 = i10;
        q9Var.f37179b = f11;
        q9Var2.f37178a = f10;
        q9Var2.f37179b = f11;
        q9Var.b();
        q9Var2.b();
        int i11 = org.telegram.ui.ActionBar.m6.f27919eh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = wq.f40047g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, ((this.f29069a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f29072e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f29070b = f11;
        this.f29071c = (f11 - this.f29069a) / 200.0f;
    }

    public final void d(int i7) {
        this.h = true;
        this.f29073f.d.setColor(i7);
    }

    public final void e(View view, boolean z9) {
        if (this.f29072e != z9) {
            view.invalidate();
        }
        this.f29072e = z9;
    }

    public final void f() {
        float f10 = this.f29070b;
        float f11 = this.f29069a;
        if (f10 != f11) {
            float f12 = this.f29071c;
            float f13 = (16.0f * f12) + f11;
            this.f29069a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f29069a = f10;
                }
            } else if (f13 < f10) {
                this.f29069a = f10;
            }
        }
        boolean z9 = this.f29072e;
        if (z9) {
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
        if (!z9) {
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
