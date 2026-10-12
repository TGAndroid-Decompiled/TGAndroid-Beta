package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mf0 implements Runnable {
    public final int f40031a;
    public final zf0 f40032b;

    public mf0(zf0 zf0Var, int i10) {
        this.f40031a = i10;
        this.f40032b = zf0Var;
    }

    @Override
    public final void run() {
        hs[] hsVarArr;
        View view;
        int i10 = this.f40031a;
        int i11 = 0;
        zf0 zf0Var = this.f40032b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ik0 ik0Var = zf0Var.G;
                fs fsVar = zf0Var.f44817f;
                int i12 = zf0Var.f44818f0;
                if (i12 != 3 && (hsVarArr = fsVar.f37837f) != null) {
                    for (int length = hsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fsVar.f37837f[length].length() != 0) {
                            fsVar.f37837f[length].requestFocus();
                            hs hsVar = fsVar.f37837f[length];
                            hsVar.setSelection(hsVar.length());
                            xg0.T0(zf0Var.f44833s0, fsVar.f37837f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.fk0 fk0Var = zf0Var.f44808a;
                if (fk0Var != null) {
                    fk0Var.start();
                }
                if (i12 == 15) {
                    ik0Var.getAnimatedDrawable().N(0, false, false);
                    ik0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 6));
                return;
            case 2:
                fe0 fe0Var = zf0Var.f44834w;
                zf0Var.f44829q0 = false;
                while (true) {
                    hs[] hsVarArr2 = zf0Var.f44817f.f37837f;
                    if (i11 < hsVarArr2.length) {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f44818f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f44836y;
                        }
                        if (fe0Var.getCurrentView() != view) {
                            fe0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ik0 ik0Var2 = zf0Var.f44832s;
                ik0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.fk0 fk0Var2 = zf0Var.O;
                fk0Var2.N(0, false, false);
                fk0Var2.K(1);
                ik0Var2.setAnimation(fk0Var2);
                ik0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f44833s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.am.g(new StringBuilder("+"), zf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.fk0 fk0Var3 = zf0Var.P;
                fk0Var3.f26126t0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.ik0 ik0Var3 = zf0Var.f44832s;
                ik0Var3.setAutoRepeat(false);
                fk0Var3.N(0, false, false);
                ik0Var3.setAnimation(fk0Var3);
                ik0Var3.d();
                return;
            case 7:
                zf0Var.postDelayed(new mf0(zf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 10));
                return;
            case 9:
                fs fsVar2 = zf0Var.f44817f;
                fsVar2.f37836e = false;
                fsVar2.f37837f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr3 = fsVar2.f37837f;
                    if (i11 < hsVarArr3.length) {
                        hsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ik0 ik0Var4 = zf0Var.f44832s;
                ik0Var4.setAutoRepeat(false);
                ik0Var4.setAnimation(zf0Var.f44808a);
                return;
        }
    }
}
