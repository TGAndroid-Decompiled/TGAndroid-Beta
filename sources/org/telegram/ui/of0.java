package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class of0 implements Runnable {
    public final int f36299a;
    public final bg0 f36300b;

    public of0(bg0 bg0Var, int i10) {
        this.f36299a = i10;
        this.f36300b = bg0Var;
    }

    @Override
    public final void run() {
        gs[] gsVarArr;
        View view;
        int i10 = this.f36299a;
        int i11 = 0;
        bg0 bg0Var = this.f36300b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.kj0 kj0Var = bg0Var.G;
                ds dsVar = bg0Var.f32420f;
                int i12 = bg0Var.f32421f0;
                if (i12 != 3 && (gsVarArr = dsVar.f33125f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f33125f[length].length() != 0) {
                            dsVar.f33125f[length].requestFocus();
                            gs gsVar = dsVar.f33125f[length];
                            gsVar.setSelection(gsVar.length());
                            yg0.T0(bg0Var.f32436s0, dsVar.f33125f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.hj0 hj0Var = bg0Var.f32412a;
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
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 6));
                return;
            case 2:
                he0 he0Var = bg0Var.f32437w;
                bg0Var.f32432q0 = false;
                while (true) {
                    gs[] gsVarArr2 = bg0Var.f32420f.f33125f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (bg0Var.f32421f0 == 15) {
                            view = bg0Var.F;
                        } else {
                            view = bg0Var.f32439y;
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
                org.telegram.ui.Components.kj0 kj0Var2 = bg0Var.f32435s;
                kj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.hj0 hj0Var2 = bg0Var.O;
                hj0Var2.N(0, false, false);
                hj0Var2.K(1);
                kj0Var2.setAnimation(hj0Var2);
                kj0Var2.d();
                return;
            case 5:
                try {
                    bg0Var.f32436s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.rk.h(new StringBuilder("+"), bg0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new xf0(bg0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.hj0 hj0Var3 = bg0Var.P;
                hj0Var3.f24702t0 = new of0(bg0Var, 8);
                org.telegram.ui.Components.kj0 kj0Var3 = bg0Var.f32435s;
                kj0Var3.setAutoRepeat(false);
                hj0Var3.N(0, false, false);
                kj0Var3.setAnimation(hj0Var3);
                kj0Var3.d();
                return;
            case 7:
                bg0Var.postDelayed(new of0(bg0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 10));
                return;
            case 9:
                ds dsVar2 = bg0Var.f32420f;
                dsVar2.e = false;
                dsVar2.f33125f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = dsVar2.f33125f;
                    if (i11 < gsVarArr3.length) {
                        gsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.kj0 kj0Var4 = bg0Var.f32435s;
                kj0Var4.setAutoRepeat(false);
                kj0Var4.setAnimation(bg0Var.f32412a);
                return;
        }
    }
}
