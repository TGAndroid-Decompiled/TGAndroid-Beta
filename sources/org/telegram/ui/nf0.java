package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nf0 implements Runnable {
    public final int f35928a;
    public final ag0 f35929b;

    public nf0(ag0 ag0Var, int i10) {
        this.f35928a = i10;
        this.f35929b = ag0Var;
    }

    @Override
    public final void run() {
        gs[] gsVarArr;
        View view;
        int i10 = this.f35928a;
        int i11 = 0;
        ag0 ag0Var = this.f35929b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.lj0 lj0Var = ag0Var.G;
                ds dsVar = ag0Var.f32038f;
                int i12 = ag0Var.f32039f0;
                if (i12 != 3 && (gsVarArr = dsVar.f33074f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f33074f[length].length() != 0) {
                            dsVar.f33074f[length].requestFocus();
                            gs gsVar = dsVar.f33074f[length];
                            gsVar.setSelection(gsVar.length());
                            xg0.T0(ag0Var.f32054s0, dsVar.f33074f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ij0 ij0Var = ag0Var.f32030a;
                if (ij0Var != null) {
                    ij0Var.start();
                }
                if (i12 == 15) {
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 6));
                return;
            case 2:
                ge0 ge0Var = ag0Var.f32055w;
                ag0Var.f32050q0 = false;
                while (true) {
                    gs[] gsVarArr2 = ag0Var.f32038f.f33074f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (ag0Var.f32039f0 == 15) {
                            view = ag0Var.F;
                        } else {
                            view = ag0Var.f32057y;
                        }
                        if (ge0Var.getCurrentView() != view) {
                            ge0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.lj0 lj0Var2 = ag0Var.f32053s;
                lj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ij0 ij0Var2 = ag0Var.O;
                ij0Var2.N(0, false, false);
                ij0Var2.K(1);
                lj0Var2.setAnimation(ij0Var2);
                lj0Var2.d();
                return;
            case 5:
                try {
                    ag0Var.f32054s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.wh.g(new StringBuilder("+"), ag0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new wf0(ag0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.ij0 ij0Var3 = ag0Var.P;
                ij0Var3.f24996t0 = new nf0(ag0Var, 8);
                org.telegram.ui.Components.lj0 lj0Var3 = ag0Var.f32053s;
                lj0Var3.setAutoRepeat(false);
                ij0Var3.N(0, false, false);
                lj0Var3.setAnimation(ij0Var3);
                lj0Var3.d();
                return;
            case 7:
                ag0Var.postDelayed(new nf0(ag0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 10));
                return;
            case 9:
                ds dsVar2 = ag0Var.f32038f;
                dsVar2.e = false;
                dsVar2.f33074f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = dsVar2.f33074f;
                    if (i11 < gsVarArr3.length) {
                        gsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.lj0 lj0Var4 = ag0Var.f32053s;
                lj0Var4.setAutoRepeat(false);
                lj0Var4.setAnimation(ag0Var.f32030a);
                return;
        }
    }
}
