package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e41 extends org.telegram.ui.Components.vl0 {
    public final Context f33247c;

    public e41(Context context) {
        this.f33247c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            if (pi.e.f41345b.a()) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        boolean a2 = pi.e.f41345b.a();
        int i11 = c1Var.f42949f;
        View view = c1Var.f42946a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            m4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 != 1 && !a2) {
                z10 = false;
            } else {
                z10 = true;
            }
            w8Var.setEnabled(z10);
            if (i10 == 1) {
                w8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), a2, false);
            } else {
                w8Var.f(LocaleController.getString(R.string.RoundVideoCompositionEnabled), pi.e.f41348g.a(), false);
            }
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            eaVar.setEnabled(a2);
            if (i10 == 2) {
                eaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.o(((ki.p0) pi.e.f41346c.a()).f13801a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string4 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                ki.l0 l0Var = (ki.l0) pi.e.d.a();
                if (l0Var == ki.l0.f13784a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (l0Var == ki.l0.f13785b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                eaVar.c(string4, string2, false, true);
            } else if (i10 == 4) {
                eaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.o(((ki.m0) pi.e.e.a()).f13791a, " FPS", new StringBuilder()), false, true);
            } else {
                eaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), f41.U(pi.e.f41347f.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            e9Var.setText(string);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ea eaVar;
        Context context = this.f33247c;
        if (i10 == 0) {
            eaVar = new org.telegram.ui.Cells.m4(context);
        } else if (i10 == 1) {
            eaVar = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ea eaVar2 = new org.telegram.ui.Cells.ea(context);
            eaVar2.setCanDisable(true);
            eaVar = eaVar2;
        } else {
            eaVar = new org.telegram.ui.Cells.e9(context);
        }
        eaVar.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(eaVar);
    }
}
