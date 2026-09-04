package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mf0 implements Runnable {
    public final int f38697a;
    public final zf0 f38698b;

    public mf0(zf0 zf0Var, int i10) {
        this.f38697a = i10;
        this.f38698b = zf0Var;
    }

    @Override
    public final void run() {
        gs[] gsVarArr;
        View view;
        int i10 = this.f38697a;
        int i11 = 0;
        zf0 zf0Var = this.f38698b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.aj0 aj0Var = zf0Var.G;
                es esVar = zf0Var.f43405f;
                int i12 = zf0Var.f43406f0;
                if (i12 != 3 && (gsVarArr = esVar.f36163f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || esVar.f36163f[length].length() != 0) {
                            esVar.f36163f[length].requestFocus();
                            gs gsVar = esVar.f36163f[length];
                            gsVar.setSelection(gsVar.length());
                            wg0.T0(zf0Var.f43421s0, esVar.f36163f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xi0 xi0Var = zf0Var.f43396a;
                if (xi0Var != null) {
                    xi0Var.start();
                }
                if (i12 == 15) {
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 6));
                return;
            case 2:
                fe0 fe0Var = zf0Var.f43422w;
                zf0Var.f43417q0 = false;
                while (true) {
                    gs[] gsVarArr2 = zf0Var.f43405f.f36163f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f43406f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f43424y;
                        }
                        if (fe0Var.getCurrentView() != view) {
                            fe0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.aj0 aj0Var2 = zf0Var.f43420s;
                aj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xi0 xi0Var2 = zf0Var.O;
                xi0Var2.L(0, false, false);
                xi0Var2.I(1);
                aj0Var2.setAnimation(xi0Var2);
                aj0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f43421s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.w1.j(new StringBuilder("+"), zf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.xi0 xi0Var3 = zf0Var.P;
                xi0Var3.f32577u0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.aj0 aj0Var3 = zf0Var.f43420s;
                aj0Var3.setAutoRepeat(false);
                xi0Var3.L(0, false, false);
                aj0Var3.setAnimation(xi0Var3);
                aj0Var3.d();
                return;
            case 7:
                zf0Var.postDelayed(new mf0(zf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 10));
                return;
            case 9:
                es esVar2 = zf0Var.f43405f;
                esVar2.f36162e = false;
                esVar2.f36163f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = esVar2.f36163f;
                    if (i11 < gsVarArr3.length) {
                        gsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.aj0 aj0Var4 = zf0Var.f43420s;
                aj0Var4.setAutoRepeat(false);
                aj0Var4.setAnimation(zf0Var.f43396a);
                return;
        }
    }
}
