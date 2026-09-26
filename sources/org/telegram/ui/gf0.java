package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gf0 implements Runnable {
    public final int f33928a;
    public final tf0 f33929b;

    public gf0(tf0 tf0Var, int i10) {
        this.f33928a = i10;
        this.f33929b = tf0Var;
    }

    @Override
    public final void run() {
        as[] asVarArr;
        View view;
        int i10 = this.f33928a;
        int i11 = 0;
        tf0 tf0Var = this.f33929b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.mj0 mj0Var = tf0Var.G;
                yr yrVar = tf0Var.f38081f;
                int i12 = tf0Var.f38082f0;
                if (i12 != 3 && (asVarArr = yrVar.f40236f) != null) {
                    for (int length = asVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yrVar.f40236f[length].length() != 0) {
                            yrVar.f40236f[length].requestFocus();
                            as asVar = yrVar.f40236f[length];
                            asVar.setSelection(asVar.length());
                            qg0.T0(tf0Var.f38097s0, yrVar.f40236f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.jj0 jj0Var = tf0Var.f38073a;
                if (jj0Var != null) {
                    jj0Var.start();
                }
                if (i12 == 15) {
                    mj0Var.getAnimatedDrawable().N(0, false, false);
                    mj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 6));
                return;
            case 2:
                zd0 zd0Var = tf0Var.f38098w;
                tf0Var.f38093q0 = false;
                while (true) {
                    as[] asVarArr2 = tf0Var.f38081f.f40236f;
                    if (i11 < asVarArr2.length) {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (tf0Var.f38082f0 == 15) {
                            view = tf0Var.F;
                        } else {
                            view = tf0Var.f38100y;
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
                org.telegram.ui.Components.mj0 mj0Var2 = tf0Var.f38096s;
                mj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.jj0 jj0Var2 = tf0Var.O;
                jj0Var2.N(0, false, false);
                jj0Var2.K(1);
                mj0Var2.setAnimation(jj0Var2);
                mj0Var2.d();
                return;
            case 5:
                try {
                    tf0Var.f38097s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ok.h(new StringBuilder("+"), tf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new pf0(tf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.jj0 jj0Var3 = tf0Var.P;
                jj0Var3.f25446t0 = new gf0(tf0Var, 8);
                org.telegram.ui.Components.mj0 mj0Var3 = tf0Var.f38096s;
                mj0Var3.setAutoRepeat(false);
                jj0Var3.N(0, false, false);
                mj0Var3.setAnimation(jj0Var3);
                mj0Var3.d();
                return;
            case 7:
                tf0Var.postDelayed(new gf0(tf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 10));
                return;
            case 9:
                yr yrVar2 = tf0Var.f38081f;
                yrVar2.e = false;
                yrVar2.f40236f[0].requestFocus();
                while (true) {
                    as[] asVarArr3 = yrVar2.f40236f;
                    if (i11 < asVarArr3.length) {
                        asVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.mj0 mj0Var4 = tf0Var.f38096s;
                mj0Var4.setAutoRepeat(false);
                mj0Var4.setAnimation(tf0Var.f38073a);
                return;
        }
    }
}
