package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gf0 implements Runnable {
    public final int f33930a;
    public final tf0 f33931b;

    public gf0(tf0 tf0Var, int i10) {
        this.f33930a = i10;
        this.f33931b = tf0Var;
    }

    @Override
    public final void run() {
        as[] asVarArr;
        View view;
        int i10 = this.f33930a;
        int i11 = 0;
        tf0 tf0Var = this.f33931b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = tf0Var.G;
                yr yrVar = tf0Var.f38082f;
                int i12 = tf0Var.f38083f0;
                if (i12 != 3 && (asVarArr = yrVar.f40237f) != null) {
                    for (int length = asVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yrVar.f40237f[length].length() != 0) {
                            yrVar.f40237f[length].requestFocus();
                            as asVar = yrVar.f40237f[length];
                            asVar.setSelection(asVar.length());
                            qg0.T0(tf0Var.f38098s0, yrVar.f40237f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = tf0Var.f38074a;
                if (kj0Var != null) {
                    kj0Var.start();
                }
                if (i12 == 15) {
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 6));
                return;
            case 2:
                zd0 zd0Var = tf0Var.f38099w;
                tf0Var.f38094q0 = false;
                while (true) {
                    as[] asVarArr2 = tf0Var.f38082f.f40237f;
                    if (i11 < asVarArr2.length) {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (tf0Var.f38083f0 == 15) {
                            view = tf0Var.F;
                        } else {
                            view = tf0Var.f38101y;
                        }
                        if (zd0Var.getCurrentView() != view) {
                            zd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.nj0 nj0Var2 = tf0Var.f38097s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = tf0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                return;
            case 5:
                try {
                    tf0Var.f38098s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18663a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ok.h(new StringBuilder("+"), tf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new pf0(tf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = tf0Var.P;
                kj0Var3.f25740t0 = new gf0(tf0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = tf0Var.f38097s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                return;
            case 7:
                tf0Var.postDelayed(new gf0(tf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 10));
                return;
            case 9:
                yr yrVar2 = tf0Var.f38082f;
                yrVar2.e = false;
                yrVar2.f40237f[0].requestFocus();
                while (true) {
                    as[] asVarArr3 = yrVar2.f40237f;
                    if (i11 < asVarArr3.length) {
                        asVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = tf0Var.f38097s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(tf0Var.f38074a);
                return;
        }
    }
}
