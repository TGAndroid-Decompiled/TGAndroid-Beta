package org.telegram.ui.Components;
public final class oh extends org.telegram.ui.ActionBar.i1 {
    public final ph f36613x;

    public oh(ph phVar, ph phVar2) {
        super(phVar2);
        this.f36613x = phVar;
    }

    @Override
    public final boolean b() {
        gy gyVar;
        ci ciVar = this.f36613x.f36935k0;
        if ((!ciVar.I || ciVar.f32644r2) && ciVar.f32637p3) {
            uh uhVar = ciVar.f32660v2;
            if (uhVar == ciVar.f32608g2 || uhVar == ciVar.f32611h2 || ciVar.a1().m()) {
                uh uhVar2 = ciVar.f32660v2;
                an anVar = ciVar.f32608g2;
                if (uhVar2 != anVar || ((gyVar = anVar.E) != null && gyVar.getVisibility() == 0)) {
                    uh uhVar3 = ciVar.f32660v2;
                    an anVar2 = ciVar.f32611h2;
                    if (uhVar3 == anVar2) {
                        gy gyVar2 = anVar2.E;
                        if (gyVar2 != null && gyVar2.getVisibility() == 0) {
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
    public final void e(float f10, float f11, boolean z9) {
        float f12;
        ph phVar = this.f36613x;
        ci ciVar = phVar.f36935k0;
        ciVar.f32616i4 = f10;
        float f13 = ciVar.f32593a4;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (ciVar.f32660v2 == ciVar.f32640q2 && !z9) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            ciVar.f32616i4 = com.google.android.recaptcha.internal.a.z(f13, ciVar.f32596b4, f12, f10);
        }
        ciVar.U2.setTranslationY(ciVar.f32616i4);
        ciVar.X2.setTranslationY(ciVar.f32616i4);
        org.telegram.ui.ActionBar.r0 r0Var = ciVar.f32595b3;
        if (r0Var != null) {
            r0Var.setTranslationY(ciVar.f32616i4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = ciVar.Z2;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(ciVar.X2.getTranslationY());
        }
        fi.m3 m3Var = ciVar.f32592a3;
        if (m3Var != null) {
            m3Var.setTranslationY(ciVar.X2.getTranslationY());
        }
        ciVar.f32598c3.setTranslationY(ciVar.f32616i4);
        ciVar.P1(0);
        if (ciVar.f32660v2 != ciVar.f32640q2) {
            f14 = ciVar.f32616i4;
        }
        ciVar.E0 = f14;
        ciVar.f28675c.invalidate();
        phVar.invalidate();
        ciVar.A2.invalidate();
        ciVar.J1();
        uh uhVar = ciVar.f32660v2;
        if (uhVar != null) {
            uhVar.n(ciVar.f32616i4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        ci ciVar = this.f36613x.f36935k0;
        ciVar.M1(ciVar.f32660v2, 0);
        ciVar.Z3 = ciVar.Y3[0];
        ciVar.f32660v2.y();
        if ((ciVar.f32660v2 instanceof hi.c4) && !ciVar.A3) {
            if (ciVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < ciVar.f32656u2.size(); i10++) {
                ((hi.c4) ciVar.f32656u2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z9) {
        int i10;
        ph phVar = this.f36613x;
        ci ciVar = phVar.f36935k0;
        int i11 = ciVar.Z3;
        if (i11 > 0 && i11 != (i10 = ciVar.Y3[0]) && (z9 || ciVar.f32660v2 == ciVar.f32640q2)) {
            ciVar.f32593a4 = i11;
            ciVar.f32596b4 = i10;
        } else {
            ciVar.f32593a4 = -1.0f;
        }
        phVar.invalidate();
        ch chVar = ciVar.f32657u3;
        if ((ciVar.f32660v2 instanceof hi.c4) && !ciVar.A3) {
            if (z9) {
                chVar.setVisibility(8);
            } else {
                chVar.setVisibility(0);
            }
        }
        ciVar.f32660v2.z(i7, z9);
    }
}
