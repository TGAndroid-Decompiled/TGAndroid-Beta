package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xq;
public final class e4 {
    public float f29050a;
    public float f29051b;
    public float f29052c;
    public boolean f29053e;
    public final org.telegram.ui.Components.r9 f29054f;
    public final org.telegram.ui.Components.r9 f29055g;
    public boolean h;
    public int f29056i;
    public float d = 0.0f;
    public float f29057j = 0.0f;

    public e4(int i7, int i10) {
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(6);
        this.f29054f = r9Var;
        org.telegram.ui.Components.r9 r9Var2 = new org.telegram.ui.Components.r9(8);
        this.f29055g = r9Var2;
        float f10 = i7;
        r9Var.f37592a = f10;
        float f11 = i10;
        r9Var.f37593b = f11;
        r9Var2.f37592a = f10;
        r9Var2.f37593b = f11;
        r9Var.b();
        r9Var2.b();
        int i11 = org.telegram.ui.ActionBar.k6.f27877eh;
        r9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 38));
        r9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = xq.f40330g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, ((this.f29050a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f29053e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f29051b = f11;
        this.f29052c = (f11 - this.f29050a) / 200.0f;
    }

    public final void d(int i7) {
        this.h = true;
        this.f29054f.d.setColor(i7);
    }

    public final void e(View view, boolean z9) {
        if (this.f29053e != z9) {
            view.invalidate();
        }
        this.f29053e = z9;
    }

    public final void f() {
        float f10 = this.f29051b;
        float f11 = this.f29050a;
        if (f10 != f11) {
            float f12 = this.f29052c;
            float f13 = (16.0f * f12) + f11;
            this.f29050a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f29050a = f10;
                }
            } else if (f13 < f10) {
                this.f29050a = f10;
            }
        }
        boolean z9 = this.f29053e;
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
