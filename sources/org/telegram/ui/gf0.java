package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gf0 implements Runnable {
    public final int f34440a;
    public final tf0 f34441b;

    public gf0(tf0 tf0Var, int i10) {
        this.f34440a = i10;
        this.f34441b = tf0Var;
    }

    @Override
    public final void run() {
        ds[] dsVarArr;
        View view;
        int i10 = this.f34440a;
        int i11 = 0;
        tf0 tf0Var = this.f34441b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.jj0 jj0Var = tf0Var.D;
                as asVar = tf0Var.f38492f;
                int i12 = tf0Var.f38489c0;
                if (i12 != 3 && (dsVarArr = asVar.f32635f) != null) {
                    for (int length = dsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || asVar.f32635f[length].length() != 0) {
                            asVar.f32635f[length].requestFocus();
                            ds dsVar = asVar.f32635f[length];
                            dsVar.setSelection(dsVar.length());
                            pg0.T0(tf0Var.f38503p0, asVar.f32635f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.gj0 gj0Var = tf0Var.f38484a;
                if (gj0Var != null) {
                    gj0Var.start();
                }
                if (i12 == 15) {
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 6));
                return;
            case 2:
                zd0 zd0Var = tf0Var.f38506w;
                tf0Var.f38501n0 = false;
                while (true) {
                    ds[] dsVarArr2 = tf0Var.f38492f.f32635f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (tf0Var.f38489c0 == 15) {
                            view = tf0Var.C;
                        } else {
                            view = tf0Var.f38508y;
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
                org.telegram.ui.Components.jj0 jj0Var2 = tf0Var.f38505s;
                jj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.gj0 gj0Var2 = tf0Var.L;
                gj0Var2.L(0, false, false);
                gj0Var2.I(1);
                jj0Var2.setAnimation(gj0Var2);
                jj0Var2.d();
                return;
            case 5:
                try {
                    tf0Var.f38503p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), tf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new pf0(tf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.gj0 gj0Var3 = tf0Var.M;
                gj0Var3.f25174r0 = new gf0(tf0Var, 8);
                org.telegram.ui.Components.jj0 jj0Var3 = tf0Var.f38505s;
                jj0Var3.setAutoRepeat(false);
                gj0Var3.L(0, false, false);
                jj0Var3.setAnimation(gj0Var3);
                jj0Var3.d();
                return;
            case 7:
                tf0Var.postDelayed(new gf0(tf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 10));
                return;
            case 9:
                as asVar2 = tf0Var.f38492f;
                asVar2.e = false;
                asVar2.f32635f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = asVar2.f32635f;
                    if (i11 < dsVarArr3.length) {
                        dsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.jj0 jj0Var4 = tf0Var.f38505s;
                jj0Var4.setAutoRepeat(false);
                jj0Var4.setAnimation(tf0Var.f38484a);
                return;
        }
    }
}
