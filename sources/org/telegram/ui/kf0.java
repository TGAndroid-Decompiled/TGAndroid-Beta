package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kf0 implements Runnable {
    public final int f39325a;
    public final yf0 f39326b;

    public kf0(yf0 yf0Var, int i10) {
        this.f39325a = i10;
        this.f39326b = yf0Var;
    }

    @Override
    public final void run() {
        ds[] dsVarArr;
        View view;
        int i10 = this.f39325a;
        int i11 = 0;
        yf0 yf0Var = this.f39326b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.hk0 hk0Var = yf0Var.G;
                bs bsVar = yf0Var.f44366f;
                int i12 = yf0Var.f44367f0;
                if (i12 != 3 && (dsVarArr = bsVar.f36450f) != null) {
                    for (int length = dsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || bsVar.f36450f[length].length() != 0) {
                            bsVar.f36450f[length].requestFocus();
                            ds dsVar = bsVar.f36450f[length];
                            dsVar.setSelection(dsVar.length());
                            vg0.T0(yf0Var.f44382s0, bsVar.f36450f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ek0 ek0Var = yf0Var.f44357a;
                if (ek0Var != null) {
                    ek0Var.start();
                }
                if (i12 == 15) {
                    hk0Var.getAnimatedDrawable().N(0, false, false);
                    hk0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kf0(yf0Var, 6));
                return;
            case 2:
                de0 de0Var = yf0Var.f44383w;
                yf0Var.f44378q0 = false;
                while (true) {
                    ds[] dsVarArr2 = yf0Var.f44366f.f36450f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (yf0Var.f44367f0 == 15) {
                            view = yf0Var.F;
                        } else {
                            view = yf0Var.f44385y;
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
                org.telegram.ui.Components.hk0 hk0Var2 = yf0Var.f44381s;
                hk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ek0 ek0Var2 = yf0Var.O;
                ek0Var2.N(0, false, false);
                ek0Var2.K(1);
                hk0Var2.setAnimation(ek0Var2);
                hk0Var2.d();
                return;
            case 5:
                try {
                    yf0Var.f44382s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ai.g(new StringBuilder("+"), yf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new tf0(yf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.ek0 ek0Var3 = yf0Var.P;
                ek0Var3.f26062t0 = new kf0(yf0Var, 8);
                org.telegram.ui.Components.hk0 hk0Var3 = yf0Var.f44381s;
                hk0Var3.setAutoRepeat(false);
                ek0Var3.N(0, false, false);
                hk0Var3.setAnimation(ek0Var3);
                hk0Var3.d();
                return;
            case 7:
                yf0Var.postDelayed(new kf0(yf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new kf0(yf0Var, 10));
                return;
            case 9:
                bs bsVar2 = yf0Var.f44366f;
                bsVar2.f36449e = false;
                bsVar2.f36450f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = bsVar2.f36450f;
                    if (i11 < dsVarArr3.length) {
                        dsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.hk0 hk0Var4 = yf0Var.f44381s;
                hk0Var4.setAutoRepeat(false);
                hk0Var4.setAnimation(yf0Var.f44357a);
                return;
        }
    }
}
