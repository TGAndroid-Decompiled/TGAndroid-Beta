package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ef0 implements Runnable {
    public final int f34008a;
    public final rf0 f34009b;

    public ef0(rf0 rf0Var, int i10) {
        this.f34008a = i10;
        this.f34009b = rf0Var;
    }

    @Override
    public final void run() {
        bs[] bsVarArr;
        View view;
        int i10 = this.f34008a;
        int i11 = 0;
        rf0 rf0Var = this.f34009b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.jj0 jj0Var = rf0Var.D;
                yr yrVar = rf0Var.f38023f;
                int i12 = rf0Var.f38020c0;
                if (i12 != 3 && (bsVarArr = yrVar.f40565f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yrVar.f40565f[length].length() != 0) {
                            yrVar.f40565f[length].requestFocus();
                            bs bsVar = yrVar.f40565f[length];
                            bsVar.setSelection(bsVar.length());
                            ng0.T0(rf0Var.f38034p0, yrVar.f40565f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.gj0 gj0Var = rf0Var.f38015a;
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
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 6));
                return;
            case 2:
                xd0 xd0Var = rf0Var.f38037w;
                rf0Var.f38032n0 = false;
                while (true) {
                    bs[] bsVarArr2 = rf0Var.f38023f.f40565f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (rf0Var.f38020c0 == 15) {
                            view = rf0Var.C;
                        } else {
                            view = rf0Var.f38039y;
                        }
                        if (xd0Var.getCurrentView() != view) {
                            xd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.jj0 jj0Var2 = rf0Var.f38036s;
                jj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.gj0 gj0Var2 = rf0Var.L;
                gj0Var2.L(0, false, false);
                gj0Var2.I(1);
                jj0Var2.setAnimation(gj0Var2);
                jj0Var2.d();
                return;
            case 5:
                try {
                    rf0Var.f38034p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), rf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new nf0(rf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.gj0 gj0Var3 = rf0Var.M;
                gj0Var3.f25168r0 = new ef0(rf0Var, 8);
                org.telegram.ui.Components.jj0 jj0Var3 = rf0Var.f38036s;
                jj0Var3.setAutoRepeat(false);
                gj0Var3.L(0, false, false);
                jj0Var3.setAnimation(gj0Var3);
                jj0Var3.d();
                return;
            case 7:
                rf0Var.postDelayed(new ef0(rf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 10));
                return;
            case 9:
                yr yrVar2 = rf0Var.f38023f;
                yrVar2.e = false;
                yrVar2.f40565f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = yrVar2.f40565f;
                    if (i11 < bsVarArr3.length) {
                        bsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.jj0 jj0Var4 = rf0Var.f38036s;
                jj0Var4.setAutoRepeat(false);
                jj0Var4.setAnimation(rf0Var.f38015a);
                return;
        }
    }
}
