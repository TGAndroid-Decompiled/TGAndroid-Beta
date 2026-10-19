package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.bs;
public final class b4 {
    public float f22037a;
    public float f22038b;
    public float f22039c;
    public boolean e;
    public final org.telegram.ui.Components.ba f22040f;
    public final org.telegram.ui.Components.ba f22041g;
    public boolean h;
    public int f22042i;
    public float d = 0.0f;
    public float f22043j = 0.0f;

    public b4(int i10, int i11) {
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(6);
        this.f22040f = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(8);
        this.f22041g = baVar2;
        float f7 = i10;
        baVar.f24854a = f7;
        float f10 = i11;
        baVar.f24855b = f10;
        baVar2.f24854a = f7;
        baVar2.f24855b = f10;
        baVar.b();
        baVar2.b();
        int i12 = org.telegram.ui.ActionBar.h6.f21234qg;
        baVar.d.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 38));
        baVar2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = bs.f25013g.getInterpolation(this.d);
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, interpolation, 1.0f, ((this.f22037a * 0.2f) + 0.9f) * interpolation);
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
        this.f22038b = f10;
        this.f22039c = (f10 - this.f22037a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f22040f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f22038b;
        float f10 = this.f22037a;
        if (f7 != f10) {
            float f11 = this.f22039c;
            float f12 = (16.0f * f11) + f10;
            this.f22037a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f22037a = f7;
                }
            } else if (f12 < f7) {
                this.f22037a = f7;
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
