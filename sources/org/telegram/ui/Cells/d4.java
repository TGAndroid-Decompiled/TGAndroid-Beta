package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.qr;
public final class d4 {
    public float f20121a;
    public float f20122b;
    public float f20123c;
    public boolean e;
    public final org.telegram.ui.Components.aa f20124f;
    public final org.telegram.ui.Components.aa f20125g;
    public boolean h;
    public int f20126i;
    public float d = 0.0f;
    public float f20127j = 0.0f;

    public d4(int i10, int i11) {
        org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(6);
        this.f20124f = aaVar;
        org.telegram.ui.Components.aa aaVar2 = new org.telegram.ui.Components.aa(8);
        this.f20125g = aaVar2;
        float f7 = i10;
        aaVar.f22595a = f7;
        float f10 = i11;
        aaVar.f22596b = f10;
        aaVar2.f22595a = f7;
        aaVar2.f22596b = f10;
        aaVar.b();
        aaVar2.b();
        int i12 = org.telegram.ui.ActionBar.j6.f19342qg;
        aaVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
        aaVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = qr.f27643g.getInterpolation(this.d);
        return com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, 1.0f, ((this.f20121a * 0.2f) + 0.9f) * interpolation);
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
        this.f20122b = f10;
        this.f20123c = (f10 - this.f20121a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f20124f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f20122b;
        float f10 = this.f20121a;
        if (f7 != f10) {
            float f11 = this.f20123c;
            float f12 = (16.0f * f11) + f10;
            this.f20121a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f20121a = f7;
                }
            } else if (f12 < f7) {
                this.f20121a = f7;
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
