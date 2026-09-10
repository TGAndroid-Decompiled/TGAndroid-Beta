package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cq0 extends org.telegram.ui.ActionBar.r1 {
    public final dq0 f22214x;

    public cq0(dq0 dq0Var, dq0 dq0Var2) {
        super(dq0Var2);
        this.f22214x = dq0Var;
    }

    @Override
    public final boolean b() {
        sq0 sq0Var = this.f22214x.H0;
        if (!sq0Var.isDismissed() && sq0Var.Y) {
            return !sq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        sq0 sq0Var = this.f22214x.H0;
        wp0 wp0Var = sq0Var.d;
        if (wp0Var == null || !wp0Var.m()) {
            int i10 = sq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        sq0Var.f27187r0 = false;
        int i11 = sq0Var.f27184p0;
        sq0Var.f27185q0 = i11;
        sq0Var.F.setTopGlowOffset(i11);
        sq0Var.f27167b.setTranslationY(sq0Var.f27184p0);
        sq0Var.Q.setTranslationY(sq0Var.f27184p0);
        sq0Var.F.setTranslationY(0.0f);
        sq0Var.G.setTranslationY(0.0f);
        sq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        dq0 dq0Var = this.f22214x;
        sq0 sq0Var = dq0Var.H0;
        int i12 = sq0Var.f27185q0;
        int i13 = sq0Var.f27184p0;
        if (i12 != i13) {
            dq0Var.B0 = i12;
            dq0Var.C0 = i13;
            sq0Var.f27187r0 = true;
            sq0Var.f27184p0 = i12;
        } else {
            dq0Var.B0 = -1;
        }
        int i14 = dq0Var.f22459z0;
        int i15 = dq0Var.A0;
        if (i14 != i15) {
            dq0Var.D0 = 0;
            dq0Var.E0 = 0;
            sq0Var.f27187r0 = true;
            if (!z10) {
                dq0Var.E0 = 0 - (i14 - i15);
            } else {
                dq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = dq0Var.B0;
            } else {
                i11 = dq0Var.C0;
            }
            sq0Var.f27184p0 = i11;
        } else {
            dq0Var.D0 = -1;
        }
        sq0Var.F.setTopGlowOffset((int) (sq0Var.f27190t0 + sq0Var.f27184p0));
        sq0Var.f27167b.setTranslationY(sq0Var.f27190t0 + sq0Var.f27184p0);
        sq0Var.Q.setTranslationY(sq0Var.f27190t0 + sq0Var.f27184p0);
        dq0Var.invalidate();
    }
}
