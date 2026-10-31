package org.telegram.ui.Components;
public final class nh extends org.telegram.ui.ActionBar.m1 {
    public final ph f28791x;

    public nh(ph phVar, ph phVar2) {
        super(phVar2);
        this.f28791x = phVar;
    }

    @Override
    public final boolean b() {
        vy vyVar;
        bi biVar = this.f28791x.f29362k0;
        if ((!biVar.I || biVar.f24705o2) && biVar.f24698m3) {
            uh uhVar = biVar.f24721s2;
            if (uhVar == biVar.f24667d2 || uhVar == biVar.f24670e2 || biVar.Z0().m()) {
                uh uhVar2 = biVar.f24721s2;
                jn jnVar = biVar.f24667d2;
                if (uhVar2 != jnVar || ((vyVar = jnVar.E) != null && vyVar.getVisibility() == 0)) {
                    uh uhVar3 = biVar.f24721s2;
                    jn jnVar2 = biVar.f24670e2;
                    if (uhVar3 == jnVar2) {
                        vy vyVar2 = jnVar2.E;
                        if (vyVar2 != null && vyVar2.getVisibility() == 0) {
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
    public final void e(float f7, float f10, boolean z10) {
        float f11;
        ph phVar = this.f28791x;
        bi biVar = phVar.f29362k0;
        biVar.f24675f4 = f7;
        float f12 = biVar.X3;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (biVar.f24721s2 == biVar.f24701n2 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            biVar.f24675f4 = c3.i0.z(f12, biVar.Y3, f11, f7);
        }
        biVar.R2.setTranslationY(biVar.f24675f4);
        biVar.U2.setTranslationY(biVar.f24675f4);
        org.telegram.ui.ActionBar.t0 t0Var = biVar.Y2;
        if (t0Var != null) {
            t0Var.setTranslationY(biVar.f24675f4);
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = biVar.W2;
        if (t0Var2 != null) {
            t0Var2.setTranslationY(biVar.U2.getTranslationY());
        }
        vh.p2 p2Var = biVar.X2;
        if (p2Var != null) {
            p2Var.setTranslationY(biVar.U2.getTranslationY());
        }
        biVar.Z2.setTranslationY(biVar.f24675f4);
        biVar.O1(0);
        if (biVar.f24721s2 != biVar.f24701n2) {
            f13 = biVar.f24675f4;
        }
        biVar.E0 = f13;
        biVar.f21589c.invalidate();
        phVar.invalidate();
        biVar.f24741x2.invalidate();
        biVar.I1();
        uh uhVar = biVar.f24721s2;
        if (uhVar != null) {
            uhVar.m(biVar.f24675f4, f10);
        }
    }

    @Override
    public final void f() {
        int i10;
        bi biVar = this.f28791x.f29362k0;
        biVar.L1(biVar.f24721s2, 0);
        biVar.W3 = biVar.V3[0];
        biVar.f24721s2.y();
        if ((biVar.f24721s2 instanceof xh.i3) && !biVar.f24742x3) {
            if (biVar.d) {
                i10 = org.telegram.messenger.i0.L(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < biVar.f24717r2.size(); i11++) {
                ((xh.i3) biVar.f24717r2.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ph phVar = this.f28791x;
        bi biVar = phVar.f29362k0;
        int i12 = biVar.W3;
        if (i12 > 0 && i12 != (i11 = biVar.V3[0]) && (z10 || biVar.f24721s2 == biVar.f24701n2)) {
            biVar.X3 = i12;
            biVar.Y3 = i11;
        } else {
            biVar.X3 = -1.0f;
        }
        phVar.invalidate();
        ah ahVar = biVar.f24718r3;
        if ((biVar.f24721s2 instanceof xh.i3) && !biVar.f24742x3) {
            if (z10) {
                ahVar.setVisibility(8);
            } else {
                ahVar.setVisibility(0);
            }
        }
        biVar.f24721s2.z(i10, z10);
    }
}
