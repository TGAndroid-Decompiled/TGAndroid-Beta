package org.telegram.ui.Components;
public final class ei extends org.telegram.ui.ActionBar.j1 {
    public final fi f34709x;

    public ei(fi fiVar, fi fiVar2) {
        super(fiVar2);
        this.f34709x = fiVar;
    }

    @Override
    public final boolean b() {
        ry ryVar;
        si siVar = this.f34709x.f35104l0;
        if ((!siVar.J || siVar.f39716s2) && siVar.f39709q3) {
            ki kiVar = siVar.f39732w2;
            if (kiVar == siVar.f39679h2 || kiVar == siVar.f39682i2 || siVar.b1().m()) {
                ki kiVar2 = siVar.f39732w2;
                rn rnVar = siVar.f39679h2;
                if (kiVar2 != rnVar || ((ryVar = rnVar.F) != null && ryVar.getVisibility() == 0)) {
                    ki kiVar3 = siVar.f39732w2;
                    rn rnVar2 = siVar.f39682i2;
                    if (kiVar3 == rnVar2) {
                        ry ryVar2 = rnVar2.F;
                        if (ryVar2 != null && ryVar2.getVisibility() == 0) {
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
        fi fiVar = this.f34709x;
        si siVar = fiVar.f35104l0;
        siVar.f39686j4 = f10;
        float f13 = siVar.f39664b4;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (siVar.f39732w2 == siVar.f39712r2 && !z10) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            siVar.f39686j4 = com.google.android.gms.internal.vision.e2.z(f13, siVar.f39667c4, f12, f10);
        }
        siVar.V2.setTranslationY(siVar.f39686j4);
        siVar.Y2.setTranslationY(siVar.f39686j4);
        org.telegram.ui.ActionBar.r0 r0Var = siVar.f39666c3;
        if (r0Var != null) {
            r0Var.setTranslationY(siVar.f39686j4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = siVar.f39660a3;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(siVar.Y2.getTranslationY());
        }
        hi.m3 m3Var = siVar.f39663b3;
        if (m3Var != null) {
            m3Var.setTranslationY(siVar.Y2.getTranslationY());
        }
        siVar.f39668d3.setTranslationY(siVar.f39686j4);
        siVar.Q1(0);
        if (siVar.f39732w2 != siVar.f39712r2) {
            f14 = siVar.f39686j4;
        }
        siVar.F0 = f14;
        siVar.f30195c.invalidate();
        fiVar.invalidate();
        siVar.B2.invalidate();
        siVar.K1();
        ki kiVar = siVar.f39732w2;
        if (kiVar != null) {
            kiVar.n(siVar.f39686j4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        si siVar = this.f34709x.f35104l0;
        siVar.N1(siVar.f39732w2, 0);
        siVar.f39661a4 = siVar.Z3[0];
        siVar.f39732w2.y();
        if ((siVar.f39732w2 instanceof ki.t3) && !siVar.B3) {
            if (siVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < siVar.f39728v2.size(); i10++) {
                ((ki.t3) siVar.f39728v2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        fi fiVar = this.f34709x;
        si siVar = fiVar.f35104l0;
        int i11 = siVar.f39661a4;
        if (i11 > 0 && i11 != (i10 = siVar.Z3[0]) && (z10 || siVar.f39732w2 == siVar.f39712r2)) {
            siVar.f39664b4 = i11;
            siVar.f39667c4 = i10;
        } else {
            siVar.f39664b4 = -1.0f;
        }
        fiVar.invalidate();
        sh shVar = siVar.f39729v3;
        if ((siVar.f39732w2 instanceof ki.t3) && !siVar.B3) {
            if (z10) {
                shVar.setVisibility(8);
            } else {
                shVar.setVisibility(0);
            }
        }
        siVar.f39732w2.z(i7, z10);
    }
}
