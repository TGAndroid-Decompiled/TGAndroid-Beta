package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends org.telegram.ui.ActionBar.o1 {
    public final pq0 f29123x;

    public oq0(pq0 pq0Var, pq0 pq0Var2) {
        super(pq0Var2);
        this.f29123x = pq0Var;
    }

    @Override
    public final boolean b() {
        fr0 fr0Var = this.f29123x.H0;
        if (!fr0Var.isDismissed() && fr0Var.Z) {
            return !fr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        fr0 fr0Var = this.f29123x.H0;
        jq0 jq0Var = fr0Var.d;
        if (jq0Var == null || !jq0Var.m()) {
            int i10 = fr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        fr0Var.f26387s0 = false;
        int i11 = fr0Var.f26383q0;
        fr0Var.f26385r0 = i11;
        fr0Var.G.setTopGlowOffset(i11);
        fr0Var.f26365b.setTranslationY(fr0Var.f26383q0);
        fr0Var.R.setTranslationY(fr0Var.f26383q0);
        fr0Var.G.setTranslationY(0.0f);
        fr0Var.H.setTranslationY(0.0f);
        fr0Var.a1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        pq0 pq0Var = this.f29123x;
        fr0 fr0Var = pq0Var.H0;
        int i12 = fr0Var.f26385r0;
        int i13 = fr0Var.f26383q0;
        if (i12 != i13) {
            pq0Var.B0 = i12;
            pq0Var.C0 = i13;
            fr0Var.f26387s0 = true;
            fr0Var.f26383q0 = i12;
        } else {
            pq0Var.B0 = -1;
        }
        int i14 = pq0Var.f29362z0;
        int i15 = pq0Var.A0;
        if (i14 != i15) {
            pq0Var.D0 = 0;
            pq0Var.E0 = 0;
            fr0Var.f26387s0 = true;
            if (!z10) {
                pq0Var.E0 = 0 - (i14 - i15);
            } else {
                pq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = pq0Var.B0;
            } else {
                i11 = pq0Var.C0;
            }
            fr0Var.f26383q0 = i11;
        } else {
            pq0Var.D0 = -1;
        }
        fr0Var.G.setTopGlowOffset((int) (fr0Var.f26389u0 + fr0Var.f26383q0));
        fr0Var.f26365b.setTranslationY(fr0Var.f26389u0 + fr0Var.f26383q0);
        fr0Var.R.setTranslationY(fr0Var.f26389u0 + fr0Var.f26383q0);
        pq0Var.invalidate();
    }
}
