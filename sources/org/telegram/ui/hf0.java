package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hf0 implements Runnable {
    public final int f33843a;
    public final uf0 f33844b;

    public hf0(uf0 uf0Var, int i10) {
        this.f33843a = i10;
        this.f33844b = uf0Var;
    }

    @Override
    public final void run() {
        bs[] bsVarArr;
        View view;
        int i10 = this.f33843a;
        int i11 = 0;
        uf0 uf0Var = this.f33844b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bj0 bj0Var = uf0Var.G;
                zr zrVar = uf0Var.f38077f;
                int i12 = uf0Var.f38078f0;
                if (i12 != 3 && (bsVarArr = zrVar.f40230f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f40230f[length].length() != 0) {
                            zrVar.f40230f[length].requestFocus();
                            bs bsVar = zrVar.f40230f[length];
                            bsVar.setSelection(bsVar.length());
                            rg0.T0(uf0Var.f38093s0, zrVar.f40230f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yi0 yi0Var = uf0Var.f38069a;
                if (yi0Var != null) {
                    yi0Var.start();
                }
                if (i12 == 15) {
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 6));
                return;
            case 2:
                ae0 ae0Var = uf0Var.f38094w;
                uf0Var.f38089q0 = false;
                while (true) {
                    bs[] bsVarArr2 = uf0Var.f38077f.f40230f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (uf0Var.f38078f0 == 15) {
                            view = uf0Var.F;
                        } else {
                            view = uf0Var.f38096y;
                        }
                        if (ae0Var.getCurrentView() != view) {
                            ae0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.bj0 bj0Var2 = uf0Var.f38092s;
                bj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yi0 yi0Var2 = uf0Var.O;
                yi0Var2.N(0, false, false);
                yi0Var2.K(1);
                bj0Var2.setAnimation(yi0Var2);
                bj0Var2.d();
                return;
            case 5:
                try {
                    uf0Var.f38093s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ul.h(new StringBuilder("+"), uf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new qf0(uf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.yi0 yi0Var3 = uf0Var.P;
                yi0Var3.f30282t0 = new hf0(uf0Var, 8);
                org.telegram.ui.Components.bj0 bj0Var3 = uf0Var.f38092s;
                bj0Var3.setAutoRepeat(false);
                yi0Var3.N(0, false, false);
                bj0Var3.setAnimation(yi0Var3);
                bj0Var3.d();
                return;
            case 7:
                uf0Var.postDelayed(new hf0(uf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 10));
                return;
            case 9:
                zr zrVar2 = uf0Var.f38077f;
                zrVar2.e = false;
                zrVar2.f40230f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f40230f;
                    if (i11 < bsVarArr3.length) {
                        bsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bj0 bj0Var4 = uf0Var.f38092s;
                bj0Var4.setAutoRepeat(false);
                bj0Var4.setAnimation(uf0Var.f38069a);
                return;
        }
    }
}
