package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h31 extends org.telegram.ui.Components.mm0 {
    public final Context f39763c;
    public final i31 d;

    public h31(i31 i31Var, Context context) {
        this.d = i31Var;
        this.f39763c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        if (b10 != 1) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            if (org.telegram.ui.Components.u60.d(i10)) {
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
        int i11;
        String string;
        String string2;
        boolean z10;
        String string3;
        i11 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
        boolean d = org.telegram.ui.Components.u60.d(i11);
        int i12 = e1Var.f47776f;
        if (i12 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) e1Var.f47773a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            q4Var.setText(string3);
        } else if (i12 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.f47773a;
            if (i10 != 1 && !d) {
                z10 = false;
            } else {
                z10 = true;
            }
            a9Var.setEnabled(z10);
            if (i10 == 1) {
                a9Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), d, false);
                return;
            }
            String string4 = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            wi.a aVar = wi.e.f51339i;
            aVar.a();
            a9Var.f(string4, aVar.d, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47773a;
            gaVar.setEnabled(d);
            if (i10 == 2) {
                gaVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((vi.s0) wi.e.e.a()).f50624a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                vi.o0 o0Var = (vi.o0) wi.e.f51337f.a();
                if (o0Var == vi.o0.f50562a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (o0Var == vi.o0.f50563b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                gaVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                gaVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((vi.p0) wi.e.f51338g.a()).f50571a, " FPS", new StringBuilder()), false, true);
            } else {
                gaVar.c(LocaleController.getString(R.string.RoundVideoBitrate), i31.Y(wi.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) e1Var.f47773a;
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
        Context context = this.f39763c;
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
