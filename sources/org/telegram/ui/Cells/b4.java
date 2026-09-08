package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.pr;
public final class b4 {
    public float f21668a;
    public float f21669b;
    public float f21670c;
    public boolean f21671e;
    public final org.telegram.ui.Components.ca f21672f;
    public final org.telegram.ui.Components.ca f21673g;
    public boolean h;
    public int f21674i;
    public float d = 0.0f;
    public float f21675j = 0.0f;

    public b4(int i10, int i11) {
        org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(6);
        this.f21672f = caVar;
        org.telegram.ui.Components.ca caVar2 = new org.telegram.ui.Components.ca(8);
        this.f21673g = caVar2;
        float f7 = i10;
        caVar.f24953a = f7;
        float f10 = i11;
        caVar.f24954b = f10;
        caVar2.f24953a = f7;
        caVar2.f24954b = f10;
        caVar.b();
        caVar2.b();
        int i12 = org.telegram.ui.ActionBar.j6.f20934qg;
        caVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
        caVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = pr.f29494g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f21668a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f21671e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f21669b = f10;
        this.f21670c = (f10 - this.f21668a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f21672f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.f21671e != z10) {
            view.invalidate();
        }
        this.f21671e = z10;
    }

    public final void f() {
        float f7 = this.f21669b;
        float f10 = this.f21668a;
        if (f7 != f10) {
            float f11 = this.f21670c;
            float f12 = (16.0f * f11) + f10;
            this.f21668a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f21668a = f7;
                }
            } else if (f12 < f7) {
                this.f21668a = f7;
            }
        }
        boolean z10 = this.f21671e;
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
