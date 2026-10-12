package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.es;
public final class c4 {
    public float f21015a;
    public float f21016b;
    public float f21017c;
    public boolean e;
    public final org.telegram.ui.Components.ea f21018f;
    public final org.telegram.ui.Components.ea f21019g;
    public boolean h;
    public int f21020i;
    public float d = 0.0f;
    public float f21021j = 0.0f;

    public c4(int i10, int i11) {
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(6);
        this.f21018f = eaVar;
        org.telegram.ui.Components.ea eaVar2 = new org.telegram.ui.Components.ea(8);
        this.f21019g = eaVar2;
        float f7 = i10;
        eaVar.f24634a = f7;
        float f10 = i11;
        eaVar.f24635b = f10;
        eaVar2.f24634a = f7;
        eaVar2.f24635b = f10;
        eaVar.b();
        eaVar2.b();
        int i12 = org.telegram.ui.ActionBar.g6.f20148qg;
        eaVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 38));
        eaVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 38));
    }

    public final void a(android.graphics.Canvas r9, float r10, float r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(android.graphics.Canvas, float, float, android.view.View):void");
    }

    public final float b() {
        float interpolation = es.f24772g.getInterpolation(this.d);
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, interpolation, 1.0f, ((this.f21015a * 0.2f) + 0.9f) * interpolation);
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
        this.f21016b = f10;
        this.f21017c = (f10 - this.f21015a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f21018f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.e != z10) {
            view.invalidate();
        }
        this.e = z10;
    }

    public final void f() {
        float f7 = this.f21016b;
        float f10 = this.f21015a;
        if (f7 != f10) {
            float f11 = this.f21017c;
            float f12 = (16.0f * f11) + f10;
            this.f21015a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f21015a = f7;
                }
            } else if (f12 < f7) {
                this.f21015a = f7;
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
