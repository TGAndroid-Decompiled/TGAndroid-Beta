package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.is;
public final class c4 {
    public float f21902a;
    public float f21903b;
    public float f21904c;
    public boolean f21905e;
    public final org.telegram.ui.Components.da f21906f;
    public final org.telegram.ui.Components.da f21907g;
    public boolean h;
    public int f21908i;
    public float d = 0.0f;
    public float f21909j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(6);
        this.f21906f = daVar;
        org.telegram.ui.Components.da daVar2 = new org.telegram.ui.Components.da(8);
        this.f21907g = daVar2;
        float f7 = i10;
        daVar.f25498a = f7;
        float f10 = i11;
        daVar.f25499b = f10;
        daVar2.f25498a = f7;
        daVar2.f25499b = f10;
        daVar.b();
        daVar2.b();
        int i12 = org.telegram.ui.ActionBar.h6.f21035qg;
        daVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 38));
        daVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = is.f27452g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.y(1.0f, interpolation, 1.0f, ((this.f21902a * 0.2f) + 0.9f) * interpolation);
    }

    public final void c(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f21905e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f21903b = f10;
        this.f21904c = (f10 - this.f21902a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f21906f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.f21905e != z10) {
            view.invalidate();
        }
        this.f21905e = z10;
    }

    public final void f() {
        float f7 = this.f21903b;
        float f10 = this.f21902a;
        if (f7 != f10) {
            float f11 = this.f21904c;
            float f12 = (16.0f * f11) + f10;
            this.f21902a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f21902a = f7;
                }
            } else if (f12 < f7) {
                this.f21902a = f7;
            }
        }
        boolean z10 = this.f21905e;
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
