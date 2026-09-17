package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class of0 implements Runnable {
    public final int f36332a;
    public final bg0 f36333b;

    public of0(bg0 bg0Var, int i10) {
        this.f36332a = i10;
        this.f36333b = bg0Var;
    }

    @Override
    public final void run() {
        is[] isVarArr;
        View view;
        int i10 = this.f36332a;
        int i11 = 0;
        bg0 bg0Var = this.f36333b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bj0 bj0Var = bg0Var.G;
                fs fsVar = bg0Var.f32137f;
                int i12 = bg0Var.f32138f0;
                if (i12 != 3 && (isVarArr = fsVar.f33749f) != null) {
                    for (int length = isVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fsVar.f33749f[length].length() != 0) {
                            fsVar.f33749f[length].requestFocus();
                            is isVar = fsVar.f33749f[length];
                            isVar.setSelection(isVar.length());
                            yg0.T0(bg0Var.f32153s0, fsVar.f33749f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yi0 yi0Var = bg0Var.f32129a;
                if (yi0Var != null) {
                    yi0Var.start();
                }
                if (i12 == 15) {
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 6));
                return;
            case 2:
                he0 he0Var = bg0Var.f32154w;
                bg0Var.f32149q0 = false;
                while (true) {
                    is[] isVarArr2 = bg0Var.f32137f.f33749f;
                    if (i11 < isVarArr2.length) {
                        isVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (bg0Var.f32138f0 == 15) {
                            view = bg0Var.F;
                        } else {
                            view = bg0Var.f32156y;
                        }
                        if (he0Var.getCurrentView() != view) {
                            he0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.bj0 bj0Var2 = bg0Var.f32152s;
                bj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yi0 yi0Var2 = bg0Var.O;
                yi0Var2.N(0, false, false);
                yi0Var2.K(1);
                bj0Var2.setAnimation(yi0Var2);
                bj0Var2.d();
                return;
            case 5:
                try {
                    bg0Var.f32153s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.w1.j(new StringBuilder("+"), bg0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new xf0(bg0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.yi0 yi0Var3 = bg0Var.P;
                yi0Var3.f30244u0 = new of0(bg0Var, 8);
                org.telegram.ui.Components.bj0 bj0Var3 = bg0Var.f32152s;
                bj0Var3.setAutoRepeat(false);
                yi0Var3.N(0, false, false);
                bj0Var3.setAnimation(yi0Var3);
                bj0Var3.d();
                return;
            case 7:
                bg0Var.postDelayed(new of0(bg0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 10));
                return;
            case 9:
                fs fsVar2 = bg0Var.f32137f;
                fsVar2.e = false;
                fsVar2.f33749f[0].requestFocus();
                while (true) {
                    is[] isVarArr3 = fsVar2.f33749f;
                    if (i11 < isVarArr3.length) {
                        isVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bj0 bj0Var4 = bg0Var.f32152s;
                bj0Var4.setAutoRepeat(false);
                bj0Var4.setAnimation(bg0Var.f32129a);
                return;
        }
    }
}
