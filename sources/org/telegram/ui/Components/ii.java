package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ii extends org.telegram.ui.ActionBar.q1 {
    public final ji f25136x;

    public ii(ji jiVar, ji jiVar2) {
        super(jiVar2);
        this.f25136x = jiVar;
    }

    @Override
    public final boolean b() {
        mz mzVar;
        wi wiVar = this.f25136x.B0;
        if (!wiVar.isDismissed() && wiVar.f30003s1) {
            oi oiVar = wiVar.f30023y0;
            if (oiVar == wiVar.m0 || oiVar == wiVar.f29985n0 || wiVar.k1().m()) {
                oi oiVar2 = wiVar.f30023y0;
                wn wnVar = wiVar.m0;
                if (oiVar2 != wnVar || ((mzVar = wnVar.E) != null && mzVar.getVisibility() == 0)) {
                    oi oiVar3 = wiVar.f30023y0;
                    wn wnVar2 = wiVar.f29985n0;
                    if (oiVar3 == wnVar2) {
                        mz mzVar2 = wnVar2.E;
                        if (mzVar2 != null && mzVar2.getVisibility() == 0) {
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
        ji jiVar = this.f25136x;
        wi wiVar = jiVar.B0;
        wiVar.f29981l2 = f7;
        float f11 = wiVar.f29957d2;
        if (f11 > 0.0f) {
            wiVar.f29981l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - wiVar.f29960e2, f7);
        }
        wiVar.X0.setTranslationY(wiVar.f29981l2);
        wiVar.f29946a1.setTranslationY(wiVar.f29981l2);
        org.telegram.ui.ActionBar.w0 w0Var = wiVar.f29959e1;
        if (w0Var != null) {
            w0Var.setTranslationY(wiVar.f29981l2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = wiVar.f29953c1;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(wiVar.f29946a1.getTranslationY());
        }
        ci.e4 e4Var = wiVar.f29956d1;
        if (e4Var != null) {
            e4Var.setTranslationY(wiVar.f29946a1.getTranslationY());
        }
        wiVar.f29963f1.setTranslationY(wiVar.f29981l2);
        wiVar.X1(0);
        wiVar.setCurrentPanTranslationY(wiVar.f29981l2);
        jiVar.invalidate();
        wiVar.D0.invalidate();
        wiVar.R1();
        oi oiVar = wiVar.f30023y0;
        if (oiVar != null) {
            oiVar.k(wiVar.f29981l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        wi wiVar = this.f25136x.B0;
        wiVar.U1(wiVar.f30023y0, 0);
        wiVar.f29954c2 = wiVar.f29950b2[0];
        wiVar.f30023y0.v();
        if ((wiVar.f30023y0 instanceof ei.q4) && !wiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.g3) wiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < wiVar.f30019x0.size(); i11++) {
                ((ei.q4) wiVar.f30019x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ji jiVar = this.f25136x;
        wi wiVar = jiVar.B0;
        int i12 = wiVar.f29954c2;
        if (i12 > 0 && i12 != (i11 = wiVar.f29950b2[0]) && z10) {
            wiVar.f29957d2 = i12;
            wiVar.f29960e2 = i11;
        } else {
            wiVar.f29957d2 = -1.0f;
        }
        jiVar.invalidate();
        vh vhVar = wiVar.f30020x1;
        if ((wiVar.f30023y0 instanceof ei.q4) && !wiVar.D1) {
            if (z10) {
                vhVar.setVisibility(8);
            } else {
                vhVar.setVisibility(0);
            }
        }
        wiVar.f30023y0.w(i10, z10);
    }
}
