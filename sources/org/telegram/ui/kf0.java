package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kf0 implements Runnable {
    public final int f37966a;
    public final xf0 f37967b;

    public kf0(xf0 xf0Var, int i10) {
        this.f37966a = i10;
        this.f37967b = xf0Var;
    }

    @Override
    public final void run() {
        es[] esVarArr;
        View view;
        int i10 = this.f37966a;
        int i11 = 0;
        xf0 xf0Var = this.f37967b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = xf0Var.G;
                cs csVar = xf0Var.f42858f;
                int i12 = xf0Var.f42859f0;
                if (i12 != 3 && (esVarArr = csVar.f35543f) != null) {
                    for (int length = esVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || csVar.f35543f[length].length() != 0) {
                            csVar.f35543f[length].requestFocus();
                            es esVar = csVar.f35543f[length];
                            esVar.setSelection(esVar.length());
                            ug0.T0(xf0Var.f42874s0, csVar.f35543f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = xf0Var.f42849a;
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
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 6));
                return;
            case 2:
                de0 de0Var = xf0Var.f42875w;
                xf0Var.f42870q0 = false;
                while (true) {
                    es[] esVarArr2 = xf0Var.f42858f.f35543f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (xf0Var.f42859f0 == 15) {
                            view = xf0Var.F;
                        } else {
                            view = xf0Var.f42877y;
                        }
                        if (de0Var.getCurrentView() != view) {
                            de0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.nj0 nj0Var2 = xf0Var.f42873s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = xf0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                return;
            case 5:
                try {
                    xf0Var.f42874s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ok.h(new StringBuilder("+"), xf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new tf0(xf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = xf0Var.P;
                kj0Var3.f28143t0 = new kf0(xf0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = xf0Var.f42873s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                return;
            case 7:
                xf0Var.postDelayed(new kf0(xf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 10));
                return;
            case 9:
                cs csVar2 = xf0Var.f42858f;
                csVar2.f35542e = false;
                csVar2.f35543f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = csVar2.f35543f;
                    if (i11 < esVarArr3.length) {
                        esVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = xf0Var.f42873s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(xf0Var.f42849a);
                return;
        }
    }
}
