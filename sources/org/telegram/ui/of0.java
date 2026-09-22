package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class of0 implements Runnable {
    public final int f36317a;
    public final bg0 f36318b;

    public of0(bg0 bg0Var, int i10) {
        this.f36317a = i10;
        this.f36318b = bg0Var;
    }

    @Override
    public final void run() {
        gs[] gsVarArr;
        View view;
        int i10 = this.f36317a;
        int i11 = 0;
        bg0 bg0Var = this.f36318b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = bg0Var.G;
                ds dsVar = bg0Var.f32438f;
                int i12 = bg0Var.f32439f0;
                if (i12 != 3 && (gsVarArr = dsVar.f33145f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f33145f[length].length() != 0) {
                            dsVar.f33145f[length].requestFocus();
                            gs gsVar = dsVar.f33145f[length];
                            gsVar.setSelection(gsVar.length());
                            yg0.T0(bg0Var.f32454s0, dsVar.f33145f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = bg0Var.f32430a;
                if (kj0Var != null) {
                    kj0Var.start();
                }
                if (i12 == 15) {
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 6));
                return;
            case 2:
                he0 he0Var = bg0Var.f32455w;
                bg0Var.f32450q0 = false;
                while (true) {
                    gs[] gsVarArr2 = bg0Var.f32438f.f33145f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (bg0Var.f32439f0 == 15) {
                            view = bg0Var.F;
                        } else {
                            view = bg0Var.f32457y;
                        }
                        if (he0Var.getCurrentView() != view) {
                            he0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.nj0 nj0Var2 = bg0Var.f32453s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = bg0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                return;
            case 5:
                try {
                    bg0Var.f32454s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.rk.h(new StringBuilder("+"), bg0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new xf0(bg0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = bg0Var.P;
                kj0Var3.f25735t0 = new of0(bg0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = bg0Var.f32453s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                return;
            case 7:
                bg0Var.postDelayed(new of0(bg0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 10));
                return;
            case 9:
                ds dsVar2 = bg0Var.f32438f;
                dsVar2.e = false;
                dsVar2.f33145f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = dsVar2.f33145f;
                    if (i11 < gsVarArr3.length) {
                        gsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = bg0Var.f32453s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(bg0Var.f32430a);
                return;
        }
    }
}
