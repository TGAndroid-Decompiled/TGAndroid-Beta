package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mf0 implements Runnable {
    public final int f34939a;
    public final zf0 f34940b;

    public mf0(zf0 zf0Var, int i10) {
        this.f34939a = i10;
        this.f34940b = zf0Var;
    }

    @Override
    public final void run() {
        hs[] hsVarArr;
        View view;
        int i10 = this.f34939a;
        int i11 = 0;
        zf0 zf0Var = this.f34940b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.kj0 kj0Var = zf0Var.G;
                fs fsVar = zf0Var.f39289f;
                int i12 = zf0Var.f39290f0;
                if (i12 != 3 && (hsVarArr = fsVar.f32906f) != null) {
                    for (int length = hsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fsVar.f32906f[length].length() != 0) {
                            fsVar.f32906f[length].requestFocus();
                            hs hsVar = fsVar.f32906f[length];
                            hsVar.setSelection(hsVar.length());
                            xg0.T0(zf0Var.f39305s0, fsVar.f32906f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.hj0 hj0Var = zf0Var.f39281a;
                if (hj0Var != null) {
                    hj0Var.start();
                }
                if (i12 == 15) {
                    kj0Var.getAnimatedDrawable().N(0, false, false);
                    kj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 6));
                return;
            case 2:
                fe0 fe0Var = zf0Var.f39306w;
                zf0Var.f39301q0 = false;
                while (true) {
                    hs[] hsVarArr2 = zf0Var.f39289f.f32906f;
                    if (i11 < hsVarArr2.length) {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f39290f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f39308y;
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
                org.telegram.ui.Components.kj0 kj0Var2 = zf0Var.f39304s;
                kj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.hj0 hj0Var2 = zf0Var.O;
                hj0Var2.N(0, false, false);
                hj0Var2.K(1);
                kj0Var2.setAnimation(hj0Var2);
                kj0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f39305s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.a2.j(new StringBuilder("+"), zf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.hj0 hj0Var3 = zf0Var.P;
                hj0Var3.f23671u0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.kj0 kj0Var3 = zf0Var.f39304s;
                kj0Var3.setAutoRepeat(false);
                hj0Var3.N(0, false, false);
                kj0Var3.setAnimation(hj0Var3);
                kj0Var3.d();
                return;
            case 7:
                zf0Var.postDelayed(new mf0(zf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 10));
                return;
            case 9:
                fs fsVar2 = zf0Var.f39289f;
                fsVar2.e = false;
                fsVar2.f32906f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr3 = fsVar2.f32906f;
                    if (i11 < hsVarArr3.length) {
                        hsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.kj0 kj0Var4 = zf0Var.f39304s;
                kj0Var4.setAutoRepeat(false);
                kj0Var4.setAnimation(zf0Var.f39281a);
                return;
        }
    }
}
