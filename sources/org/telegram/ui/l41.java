package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l41 extends org.telegram.ui.Components.rm0 {
    public final Context f39512c;

    public l41(Context context) {
        this.f39512c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        if (b10 != 1) {
            qi.a aVar = qi.e.f46812b;
            aVar.a();
            if (aVar.d) {
                if (b10 != 2 && b10 != 3 && b10 != 4 && b10 != 5 && b10 != 8) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return 7;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != 7) {
            if (i10 == 1 || i10 == 8) {
                return 1;
            }
            if (i10 != 6 && i10 != 9) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        qi.a aVar = qi.e.f46812b;
        aVar.a();
        boolean z11 = aVar.d;
        int i11 = d1Var.f47752f;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) d1Var.f47748a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            m4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) d1Var.f47748a;
            if (i10 != 1 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            w8Var.setEnabled(z10);
            if (i10 == 1) {
                w8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z11, false);
                return;
            }
            String string4 = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            qi.a aVar2 = qi.e.f46816g;
            aVar2.a();
            w8Var.f(string4, aVar2.d, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47748a;
            caVar.setEnabled(z11);
            if (i10 == 2) {
                caVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.o(((ki.r0) qi.e.f46813c.a()).f15104a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                ki.n0 n0Var = (ki.n0) qi.e.d.a();
                if (n0Var == ki.n0.f15061a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (n0Var == ki.n0.f15062b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                caVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                caVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.o(((ki.o0) qi.e.f46814e.a()).f15068a, " FPS", new StringBuilder()), false, true);
            } else {
                caVar.c(LocaleController.getString(R.string.RoundVideoBitrate), m41.U(qi.e.f46815f.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) d1Var.f47748a;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            e9Var.setText(string);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ca caVar;
        Context context = this.f39512c;
        if (i10 == 0) {
            caVar = new org.telegram.ui.Cells.m4(context);
        } else if (i10 == 1) {
            caVar = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
            caVar2.setCanDisable(true);
            caVar = caVar2;
        } else {
            caVar = new org.telegram.ui.Cells.e9(context);
        }
        caVar.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(caVar);
    }
}
