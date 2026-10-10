package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lf0 implements Runnable {
    public final int f39609a;
    public final zf0 f39610b;

    public lf0(zf0 zf0Var, int i10) {
        this.f39609a = i10;
        this.f39610b = zf0Var;
    }

    @Override
    public final void run() {
        es[] esVarArr;
        View view;
        int i10 = this.f39609a;
        int i11 = 0;
        zf0 zf0Var = this.f39610b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.gk0 gk0Var = zf0Var.G;
                cs csVar = zf0Var.f44640f;
                int i12 = zf0Var.f44641f0;
                if (i12 != 3 && (esVarArr = csVar.f36778f) != null) {
                    for (int length = esVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || csVar.f36778f[length].length() != 0) {
                            csVar.f36778f[length].requestFocus();
                            es esVar = csVar.f36778f[length];
                            esVar.setSelection(esVar.length());
                            wg0.T0(zf0Var.f44656s0, csVar.f36778f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.dk0 dk0Var = zf0Var.f44631a;
                if (dk0Var != null) {
                    dk0Var.start();
                }
                if (i12 == 15) {
                    gk0Var.getAnimatedDrawable().N(0, false, false);
                    gk0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 6));
                return;
            case 2:
                ee0 ee0Var = zf0Var.f44657w;
                zf0Var.f44652q0 = false;
                while (true) {
                    es[] esVarArr2 = zf0Var.f44640f.f36778f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f44641f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f44659y;
                        }
                        if (ee0Var.getCurrentView() != view) {
                            ee0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.gk0 gk0Var2 = zf0Var.f44655s;
                gk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.dk0 dk0Var2 = zf0Var.O;
                dk0Var2.N(0, false, false);
                dk0Var2.K(1);
                gk0Var2.setAnimation(dk0Var2);
                gk0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f44656s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.bi.g(new StringBuilder("+"), zf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.dk0 dk0Var3 = zf0Var.P;
                dk0Var3.f25751t0 = new lf0(zf0Var, 8);
                org.telegram.ui.Components.gk0 gk0Var3 = zf0Var.f44655s;
                gk0Var3.setAutoRepeat(false);
                dk0Var3.N(0, false, false);
                gk0Var3.setAnimation(dk0Var3);
                gk0Var3.d();
                return;
            case 7:
                zf0Var.postDelayed(new lf0(zf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 10));
                return;
            case 9:
                cs csVar2 = zf0Var.f44640f;
                csVar2.f36777e = false;
                csVar2.f36778f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = csVar2.f36778f;
                    if (i11 < esVarArr3.length) {
                        esVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.gk0 gk0Var4 = zf0Var.f44655s;
                gk0Var4.setAutoRepeat(false);
                gk0Var4.setAnimation(zf0Var.f44631a);
                return;
        }
    }
}
