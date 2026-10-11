package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kf0 implements Runnable {
    public final int f39359a;
    public final yf0 f39360b;

    public kf0(yf0 yf0Var, int i10) {
        this.f39359a = i10;
        this.f39360b = yf0Var;
    }

    @Override
    public final void run() {
        ds[] dsVarArr;
        View view;
        int i10 = this.f39359a;
        int i11 = 0;
        yf0 yf0Var = this.f39360b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.gk0 gk0Var = yf0Var.G;
                bs bsVar = yf0Var.f44400f;
                int i12 = yf0Var.f44401f0;
                if (i12 != 3 && (dsVarArr = bsVar.f36484f) != null) {
                    for (int length = dsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || bsVar.f36484f[length].length() != 0) {
                            bsVar.f36484f[length].requestFocus();
                            ds dsVar = bsVar.f36484f[length];
                            dsVar.setSelection(dsVar.length());
                            vg0.T0(yf0Var.f44416s0, bsVar.f36484f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.dk0 dk0Var = yf0Var.f44391a;
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
                AndroidUtilities.runOnUIThread(new kf0(yf0Var, 6));
                return;
            case 2:
                de0 de0Var = yf0Var.f44417w;
                yf0Var.f44412q0 = false;
                while (true) {
                    ds[] dsVarArr2 = yf0Var.f44400f.f36484f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (yf0Var.f44401f0 == 15) {
                            view = yf0Var.F;
                        } else {
                            view = yf0Var.f44419y;
                        }
                        if (de0Var.getCurrentView() != view) {
                            de0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new kf0(yf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.gk0 gk0Var2 = yf0Var.f44415s;
                gk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.dk0 dk0Var2 = yf0Var.O;
                dk0Var2.N(0, false, false);
                dk0Var2.K(1);
                gk0Var2.setAnimation(dk0Var2);
                gk0Var2.d();
                return;
            case 5:
                try {
                    yf0Var.f44416s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ai.g(new StringBuilder("+"), yf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new tf0(yf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.dk0 dk0Var3 = yf0Var.P;
                dk0Var3.f25829t0 = new kf0(yf0Var, 8);
                org.telegram.ui.Components.gk0 gk0Var3 = yf0Var.f44415s;
                gk0Var3.setAutoRepeat(false);
                dk0Var3.N(0, false, false);
                gk0Var3.setAnimation(dk0Var3);
                gk0Var3.d();
                return;
            case 7:
                yf0Var.postDelayed(new kf0(yf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new kf0(yf0Var, 10));
                return;
            case 9:
                bs bsVar2 = yf0Var.f44400f;
                bsVar2.f36483e = false;
                bsVar2.f36484f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = bsVar2.f36484f;
                    if (i11 < dsVarArr3.length) {
                        dsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.gk0 gk0Var4 = yf0Var.f44415s;
                gk0Var4.setAutoRepeat(false);
                gk0Var4.setAnimation(yf0Var.f44391a);
                return;
        }
    }
}
