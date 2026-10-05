package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e41 extends org.telegram.ui.Components.yl0 {
    public final Context f35946c;

    public e41(Context context) {
        this.f35946c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            ri.a aVar = ri.e.f46458b;
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        ri.a aVar = ri.e.f46458b;
        aVar.a();
        boolean z11 = aVar.d;
        int i11 = c1Var.f46542f;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) c1Var.f46538a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            m4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.f46538a;
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
            ri.a aVar2 = ri.e.f46462g;
            aVar2.a();
            w8Var.f(string4, aVar2.d, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f46538a;
            eaVar.setEnabled(z11);
            if (i10 == 2) {
                eaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.o(((ki.q0) ri.e.f46459c.a()).f15032a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                ki.m0 m0Var = (ki.m0) ri.e.d.a();
                if (m0Var == ki.m0.f14989a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (m0Var == ki.m0.f14990b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                eaVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                eaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.o(((ki.n0) ri.e.f46460e.a()).f14996a, " FPS", new StringBuilder()), false, true);
            } else {
                eaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), f41.S(ri.e.f46461f.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) c1Var.f46538a;
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
        Context context = this.f35946c;
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
