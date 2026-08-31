package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ff0 implements Runnable {
    public final int f36870a;
    public final sf0 f36871b;

    public ff0(sf0 sf0Var, int i10) {
        this.f36870a = i10;
        this.f36871b = sf0Var;
    }

    @Override
    public final void run() {
        cs[] csVarArr;
        View view;
        int i10 = this.f36870a;
        int i11 = 0;
        sf0 sf0Var = this.f36871b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.lj0 lj0Var = sf0Var.D;
                zr zrVar = sf0Var.f41260f;
                int i12 = sf0Var.f41256c0;
                if (i12 != 3 && (csVarArr = zrVar.f43982f) != null) {
                    for (int length = csVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f43982f[length].length() != 0) {
                            zrVar.f43982f[length].requestFocus();
                            cs csVar = zrVar.f43982f[length];
                            csVar.setSelection(csVar.length());
                            og0.T0(sf0Var.f41271p0, zrVar.f43982f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ij0 ij0Var = sf0Var.f41251a;
                if (ij0Var != null) {
                    ij0Var.start();
                }
                if (i12 == 15) {
                    lj0Var.getAnimatedDrawable().L(0, false, false);
                    lj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 6));
                return;
            case 2:
                yd0 yd0Var = sf0Var.f41274w;
                sf0Var.f41269n0 = false;
                while (true) {
                    cs[] csVarArr2 = sf0Var.f41260f.f43982f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (sf0Var.f41256c0 == 15) {
                            view = sf0Var.C;
                        } else {
                            view = sf0Var.f41276y;
                        }
                        if (yd0Var.getCurrentView() != view) {
                            yd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.lj0 lj0Var2 = sf0Var.f41273s;
                lj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ij0 ij0Var2 = sf0Var.L;
                ij0Var2.L(0, false, false);
                ij0Var2.I(1);
                lj0Var2.setAnimation(ij0Var2);
                lj0Var2.d();
                return;
            case 5:
                try {
                    sf0Var.f41271p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), sf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new of0(sf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.ij0 ij0Var3 = sf0Var.M;
                ij0Var3.f27833r0 = new ff0(sf0Var, 8);
                org.telegram.ui.Components.lj0 lj0Var3 = sf0Var.f41273s;
                lj0Var3.setAutoRepeat(false);
                ij0Var3.L(0, false, false);
                lj0Var3.setAnimation(ij0Var3);
                lj0Var3.d();
                return;
            case 7:
                sf0Var.postDelayed(new ff0(sf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 10));
                return;
            case 9:
                zr zrVar2 = sf0Var.f41260f;
                zrVar2.f43981e = false;
                zrVar2.f43982f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = zrVar2.f43982f;
                    if (i11 < csVarArr3.length) {
                        csVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.lj0 lj0Var4 = sf0Var.f41273s;
                lj0Var4.setAutoRepeat(false);
                lj0Var4.setAnimation(sf0Var.f41251a);
                return;
        }
    }
}
