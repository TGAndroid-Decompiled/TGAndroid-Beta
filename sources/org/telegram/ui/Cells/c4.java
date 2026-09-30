package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.tr;
public final class c4 {
    public float f20104a;
    public float f20105b;
    public float f20106c;
    public boolean e;
    public final org.telegram.ui.Components.ca f20107f;
    public final org.telegram.ui.Components.ca f20108g;
    public boolean h;
    public int f20109i;
    public float d = 0.0f;
    public float f20110j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(6);
        this.f20107f = caVar;
        org.telegram.ui.Components.ca caVar2 = new org.telegram.ui.Components.ca(8);
        this.f20108g = caVar2;
        float f7 = i10;
        caVar.f23220a = f7;
        float f10 = i11;
        caVar.f23221b = f10;
        caVar2.f23220a = f7;
        caVar2.f23221b = f10;
        caVar.b();
        caVar2.b();
        int i12 = org.telegram.ui.ActionBar.h6.f19324qg;
        caVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i12, false), 38));
        caVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = tr.f28637g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f20104a * 0.2f) + 0.9f) * interpolation);
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
        this.f20105b = f10;
        this.f20106c = (f10 - this.f20104a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f20107f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f20105b;
        float f10 = this.f20104a;
        if (f7 != f10) {
            float f11 = this.f20106c;
            float f12 = (16.0f * f11) + f10;
            this.f20104a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f20104a = f7;
                }
            } else if (f12 < f7) {
                this.f20104a = f7;
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
