package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lf0 implements Runnable {
    public final int f39565a;
    public final zf0 f39566b;

    public lf0(zf0 zf0Var, int i10) {
        this.f39565a = i10;
        this.f39566b = zf0Var;
    }

    @Override
    public final void run() {
        es[] esVarArr;
        View view;
        int i10 = this.f39565a;
        int i11 = 0;
        zf0 zf0Var = this.f39566b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.fk0 fk0Var = zf0Var.G;
                cs csVar = zf0Var.f44596f;
                int i12 = zf0Var.f44597f0;
                if (i12 != 3 && (esVarArr = csVar.f36734f) != null) {
                    for (int length = esVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || csVar.f36734f[length].length() != 0) {
                            csVar.f36734f[length].requestFocus();
                            es esVar = csVar.f36734f[length];
                            esVar.setSelection(esVar.length());
                            wg0.T0(zf0Var.f44612s0, csVar.f36734f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ck0 ck0Var = zf0Var.f44587a;
                if (ck0Var != null) {
                    ck0Var.start();
                }
                if (i12 == 15) {
                    fk0Var.getAnimatedDrawable().N(0, false, false);
                    fk0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 6));
                return;
            case 2:
                ee0 ee0Var = zf0Var.f44613w;
                zf0Var.f44608q0 = false;
                while (true) {
                    es[] esVarArr2 = zf0Var.f44596f.f36734f;
                    if (i11 < esVarArr2.length) {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f44597f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f44615y;
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
                org.telegram.ui.Components.fk0 fk0Var2 = zf0Var.f44611s;
                fk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ck0 ck0Var2 = zf0Var.O;
                ck0Var2.N(0, false, false);
                ck0Var2.K(1);
                fk0Var2.setAnimation(ck0Var2);
                fk0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f44612s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.bi.g(new StringBuilder("+"), zf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.ck0 ck0Var3 = zf0Var.P;
                ck0Var3.f25420t0 = new lf0(zf0Var, 8);
                org.telegram.ui.Components.fk0 fk0Var3 = zf0Var.f44611s;
                fk0Var3.setAutoRepeat(false);
                ck0Var3.N(0, false, false);
                fk0Var3.setAnimation(ck0Var3);
                fk0Var3.d();
                return;
            case 7:
                zf0Var.postDelayed(new lf0(zf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 10));
                return;
            case 9:
                cs csVar2 = zf0Var.f44596f;
                csVar2.f36733e = false;
                csVar2.f36734f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = csVar2.f36734f;
                    if (i11 < esVarArr3.length) {
                        esVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.fk0 fk0Var4 = zf0Var.f44611s;
                fk0Var4.setAutoRepeat(false);
                fk0Var4.setAnimation(zf0Var.f44587a);
                return;
        }
    }
}
