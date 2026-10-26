package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f31 extends org.telegram.ui.Components.lm0 {
    public final Context f39250c;

    public f31(Context context) {
        this.f39250c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        if (b10 != 1) {
            wi.a aVar = wi.e.d;
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
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        wi.a aVar = wi.e.d;
        aVar.a();
        boolean z11 = aVar.d;
        int i11 = e1Var.f47741f;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) e1Var.f47738a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            q4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.f47738a;
            if (i10 != 1 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            a9Var.setEnabled(z10);
            if (i10 == 1) {
                a9Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z11, false);
                return;
            }
            String string4 = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            wi.a aVar2 = wi.e.f51281i;
            aVar2.a();
            a9Var.f(string4, aVar2.d, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47738a;
            gaVar.setEnabled(z11);
            if (i10 == 2) {
                gaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((vi.q0) wi.e.e.a()).f50533a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                vi.m0 m0Var = (vi.m0) wi.e.f51279f.a();
                if (m0Var == vi.m0.f50511a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (m0Var == vi.m0.f50512b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                gaVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                gaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((vi.n0) wi.e.f51280g.a()).f50519a, " FPS", new StringBuilder()), false, true);
            } else {
                gaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), g31.V(wi.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) e1Var.f47738a;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            i9Var.setText(string);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ga gaVar;
        Context context = this.f39250c;
        if (i10 == 0) {
            gaVar = new org.telegram.ui.Cells.q4(context);
        } else if (i10 == 1) {
            gaVar = new org.telegram.ui.Cells.a9(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
            gaVar2.setCanDisable(true);
            gaVar = gaVar2;
        } else {
            gaVar = new org.telegram.ui.Cells.i9(context);
        }
        gaVar.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(gaVar);
    }
}
