package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qf0 implements Runnable {
    public final int f39149a;
    public final dg0 f39150b;

    public qf0(dg0 dg0Var, int i10) {
        this.f39149a = i10;
        this.f39150b = dg0Var;
    }

    @Override
    public final void run() {
        ks[] ksVarArr;
        View view;
        int i10 = this.f39149a;
        int i11 = 0;
        dg0 dg0Var = this.f39150b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = dg0Var.G;
                hs hsVar = dg0Var.f34994f;
                int i12 = dg0Var.f34995f0;
                if (i12 != 3 && (ksVarArr = hsVar.f36645f) != null) {
                    for (int length = ksVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || hsVar.f36645f[length].length() != 0) {
                            hsVar.f36645f[length].requestFocus();
                            ks ksVar = hsVar.f36645f[length];
                            ksVar.setSelection(ksVar.length());
                            ah0.T0(dg0Var.f35010s0, hsVar.f36645f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = dg0Var.f34986a;
                if (yj0Var != null) {
                    yj0Var.start();
                }
                if (i12 == 15) {
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 6));
                return;
            case 2:
                ie0 ie0Var = dg0Var.f35011w;
                dg0Var.f35006q0 = false;
                while (true) {
                    ks[] ksVarArr2 = dg0Var.f34994f.f36645f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (dg0Var.f34995f0 == 15) {
                            view = dg0Var.F;
                        } else {
                            view = dg0Var.f35013y;
                        }
                        if (ie0Var.getCurrentView() != view) {
                            ie0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = dg0Var.f35009s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = dg0Var.O;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                return;
            case 5:
                try {
                    dg0Var.f35010s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.sk.g(new StringBuilder("+"), dg0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new zf0(dg0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = dg0Var.P;
                yj0Var3.f31309t0 = new qf0(dg0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = dg0Var.f35009s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                return;
            case 7:
                dg0Var.postDelayed(new qf0(dg0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 10));
                return;
            case 9:
                hs hsVar2 = dg0Var.f34994f;
                hsVar2.e = false;
                hsVar2.f36645f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = hsVar2.f36645f;
                    if (i11 < ksVarArr3.length) {
                        ksVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = dg0Var.f35009s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(dg0Var.f34986a);
                return;
        }
    }
}
