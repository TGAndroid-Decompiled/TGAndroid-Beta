package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ai extends org.telegram.ui.ActionBar.r1 {
    public final bi f23376x;

    public ai(bi biVar, bi biVar2) {
        super(biVar2);
        this.f23376x = biVar;
    }

    @Override
    public final boolean b() {
        kz kzVar;
        li liVar = this.f23376x.f23697y0;
        if (!liVar.isDismissed() && liVar.f26725p1) {
            di diVar = liVar.f26744v0;
            if (diVar == liVar.f26707j0 || diVar == liVar.f26710k0 || liVar.m1().m()) {
                di diVar2 = liVar.f26744v0;
                pn pnVar = liVar.f26707j0;
                if (diVar2 != pnVar || ((kzVar = pnVar.B) != null && kzVar.getVisibility() == 0)) {
                    di diVar3 = liVar.f26744v0;
                    pn pnVar2 = liVar.f26710k0;
                    if (diVar3 == pnVar2) {
                        kz kzVar2 = pnVar2.B;
                        if (kzVar2 != null && kzVar2.getVisibility() == 0) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z4) {
        bi biVar = this.f23376x;
        li liVar = biVar.f23697y0;
        liVar.f26706i2 = f10;
        float f12 = liVar.a2;
        if (f12 > 0.0f) {
            liVar.f26706i2 = e2.c.w(1.0f, f11, f12 - liVar.f26683b2, f10);
        }
        liVar.U0.setTranslationY(liVar.f26706i2);
        liVar.X0.setTranslationY(liVar.f26706i2);
        org.telegram.ui.ActionBar.w0 w0Var = liVar.f26682b1;
        if (w0Var != null) {
            w0Var.setTranslationY(liVar.f26706i2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = liVar.Z0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(liVar.X0.getTranslationY());
        }
        ph.f3 f3Var = liVar.f26679a1;
        if (f3Var != null) {
            f3Var.setTranslationY(liVar.X0.getTranslationY());
        }
        liVar.f26686c1.setTranslationY(liVar.f26706i2);
        liVar.a2(0);
        liVar.setCurrentPanTranslationY(liVar.f26706i2);
        biVar.invalidate();
        liVar.A0.invalidate();
        liVar.U1();
        di diVar = liVar.f26744v0;
        if (diVar != null) {
            diVar.k(liVar.f26706i2);
        }
    }

    @Override
    public final void f() {
        boolean z4;
        int i10;
        li liVar = this.f23376x.f23697y0;
        liVar.X1(liVar.f26744v0, 0);
        liVar.Z1 = liVar.Y1[0];
        liVar.f26744v0.v();
        if ((liVar.f26744v0 instanceof rh.n3) && !liVar.A1) {
            z4 = ((org.telegram.ui.ActionBar.g3) liVar).keyboardVisible;
            if (z4) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < liVar.f26741u0.size(); i11++) {
                ((rh.n3) liVar.f26741u0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        int i11;
        bi biVar = this.f23376x;
        li liVar = biVar.f23697y0;
        int i12 = liVar.Z1;
        if (i12 > 0 && i12 != (i11 = liVar.Y1[0]) && z4) {
            liVar.a2 = i12;
            liVar.f26683b2 = i11;
        } else {
            liVar.a2 = -1.0f;
        }
        biVar.invalidate();
        mh mhVar = liVar.f26742u1;
        if ((liVar.f26744v0 instanceof rh.n3) && !liVar.A1) {
            if (z4) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        liVar.f26744v0.w(i10, z4);
    }
}
