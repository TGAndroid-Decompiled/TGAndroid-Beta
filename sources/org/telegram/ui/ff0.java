package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ff0 implements Runnable {
    public final int f36791a;
    public final sf0 f36792b;

    public ff0(sf0 sf0Var, int i10) {
        this.f36791a = i10;
        this.f36792b = sf0Var;
    }

    @Override
    public final void run() {
        cs[] csVarArr;
        View view;
        int i10 = this.f36791a;
        int i11 = 0;
        sf0 sf0Var = this.f36792b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.kj0 kj0Var = sf0Var.D;
                zr zrVar = sf0Var.f41170f;
                int i12 = sf0Var.f41166c0;
                if (i12 != 3 && (csVarArr = zrVar.f44011f) != null) {
                    for (int length = csVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f44011f[length].length() != 0) {
                            zrVar.f44011f[length].requestFocus();
                            cs csVar = zrVar.f44011f[length];
                            csVar.setSelection(csVar.length());
                            og0.T0(sf0Var.f41181p0, zrVar.f44011f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.hj0 hj0Var = sf0Var.f41161a;
                if (hj0Var != null) {
                    hj0Var.start();
                }
                if (i12 == 15) {
                    kj0Var.getAnimatedDrawable().L(0, false, false);
                    kj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 6));
                return;
            case 2:
                yd0 yd0Var = sf0Var.f41184w;
                sf0Var.f41179n0 = false;
                while (true) {
                    cs[] csVarArr2 = sf0Var.f41170f.f44011f;
                    if (i11 < csVarArr2.length) {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (sf0Var.f41166c0 == 15) {
                            view = sf0Var.C;
                        } else {
                            view = sf0Var.f41186y;
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
                org.telegram.ui.Components.kj0 kj0Var2 = sf0Var.f41183s;
                kj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.hj0 hj0Var2 = sf0Var.L;
                hj0Var2.L(0, false, false);
                hj0Var2.I(1);
                kj0Var2.setAnimation(hj0Var2);
                kj0Var2.d();
                return;
            case 5:
                try {
                    sf0Var.f41181p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), sf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new of0(sf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.hj0 hj0Var3 = sf0Var.M;
                hj0Var3.f27540r0 = new ff0(sf0Var, 8);
                org.telegram.ui.Components.kj0 kj0Var3 = sf0Var.f41183s;
                kj0Var3.setAutoRepeat(false);
                hj0Var3.L(0, false, false);
                kj0Var3.setAnimation(hj0Var3);
                kj0Var3.d();
                return;
            case 7:
                sf0Var.postDelayed(new ff0(sf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 10));
                return;
            case 9:
                zr zrVar2 = sf0Var.f41170f;
                zrVar2.f44010e = false;
                zrVar2.f44011f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = zrVar2.f44011f;
                    if (i11 < csVarArr3.length) {
                        csVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.kj0 kj0Var4 = sf0Var.f41183s;
                kj0Var4.setAutoRepeat(false);
                kj0Var4.setAnimation(sf0Var.f41161a);
                return;
        }
    }
}
