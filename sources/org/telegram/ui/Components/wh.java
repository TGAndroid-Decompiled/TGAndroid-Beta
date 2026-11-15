package org.telegram.ui.Components;
public final class wh extends org.telegram.ui.ActionBar.i1 {
    public final xh f41342x;

    public wh(xh xhVar, xh xhVar2) {
        super(xhVar2);
        this.f41342x = xhVar;
    }

    @Override
    public final boolean b() {
        ly lyVar;
        ki kiVar = this.f41342x.f41700l0;
        if ((!kiVar.J || kiVar.f36493s2) && kiVar.f36486q3) {
            ci ciVar = kiVar.f36509w2;
            if (ciVar == kiVar.f36456h2 || ciVar == kiVar.f36459i2 || kiVar.a1().m()) {
                ci ciVar2 = kiVar.f36509w2;
                jn jnVar = kiVar.f36456h2;
                if (ciVar2 != jnVar || ((lyVar = jnVar.F) != null && lyVar.getVisibility() == 0)) {
                    ci ciVar3 = kiVar.f36509w2;
                    jn jnVar2 = kiVar.f36459i2;
                    if (ciVar3 == jnVar2) {
                        ly lyVar2 = jnVar2.F;
                        if (lyVar2 != null && lyVar2.getVisibility() == 0) {
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
    public final void e(float f10, float f11, boolean z10) {
        float f12;
        xh xhVar = this.f41342x;
        ki kiVar = xhVar.f41700l0;
        kiVar.f36463j4 = f10;
        float f13 = kiVar.f36441b4;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (kiVar.f36509w2 == kiVar.f36489r2 && !z10) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            kiVar.f36463j4 = com.google.android.gms.internal.vision.e2.z(f13, kiVar.f36444c4, f12, f10);
        }
        kiVar.V2.setTranslationY(kiVar.f36463j4);
        kiVar.Y2.setTranslationY(kiVar.f36463j4);
        org.telegram.ui.ActionBar.q0 q0Var = kiVar.f36443c3;
        if (q0Var != null) {
            q0Var.setTranslationY(kiVar.f36463j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = kiVar.f36437a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(kiVar.Y2.getTranslationY());
        }
        hi.l3 l3Var = kiVar.f36440b3;
        if (l3Var != null) {
            l3Var.setTranslationY(kiVar.Y2.getTranslationY());
        }
        kiVar.f36445d3.setTranslationY(kiVar.f36463j4);
        kiVar.P1(0);
        if (kiVar.f36509w2 != kiVar.f36489r2) {
            f14 = kiVar.f36463j4;
        }
        kiVar.F0 = f14;
        kiVar.f29685c.invalidate();
        xhVar.invalidate();
        kiVar.B2.invalidate();
        kiVar.J1();
        ci ciVar = kiVar.f36509w2;
        if (ciVar != null) {
            ciVar.n(kiVar.f36463j4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        ki kiVar = this.f41342x.f41700l0;
        kiVar.M1(kiVar.f36509w2, 0);
        kiVar.f36438a4 = kiVar.Z3[0];
        kiVar.f36509w2.y();
        if ((kiVar.f36509w2 instanceof ki.y3) && !kiVar.B3) {
            if (kiVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < kiVar.f36505v2.size(); i10++) {
                ((ki.y3) kiVar.f36505v2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        xh xhVar = this.f41342x;
        ki kiVar = xhVar.f41700l0;
        int i11 = kiVar.f36438a4;
        if (i11 > 0 && i11 != (i10 = kiVar.Z3[0]) && (z10 || kiVar.f36509w2 == kiVar.f36489r2)) {
            kiVar.f36441b4 = i11;
            kiVar.f36444c4 = i10;
        } else {
            kiVar.f36441b4 = -1.0f;
        }
        xhVar.invalidate();
        kh khVar = kiVar.f36506v3;
        if ((kiVar.f36509w2 instanceof ki.y3) && !kiVar.B3) {
            if (z10) {
                khVar.setVisibility(8);
            } else {
                khVar.setVisibility(0);
            }
        }
        kiVar.f36509w2.z(i7, z10);
    }
}
