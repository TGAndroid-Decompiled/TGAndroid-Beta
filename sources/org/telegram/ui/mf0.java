package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mf0 implements Runnable {
    public final int f35737a;
    public final zf0 f35738b;

    public mf0(zf0 zf0Var, int i10) {
        this.f35737a = i10;
        this.f35738b = zf0Var;
    }

    @Override
    public final void run() {
        gs[] gsVarArr;
        View view;
        int i10 = this.f35737a;
        int i11 = 0;
        zf0 zf0Var = this.f35738b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.aj0 aj0Var = zf0Var.G;
                ds dsVar = zf0Var.f40175f;
                int i12 = zf0Var.f40176f0;
                if (i12 != 3 && (gsVarArr = dsVar.f33081f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f33081f[length].length() != 0) {
                            dsVar.f33081f[length].requestFocus();
                            gs gsVar = dsVar.f33081f[length];
                            gsVar.setSelection(gsVar.length());
                            wg0.T0(zf0Var.f40191s0, dsVar.f33081f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xi0 xi0Var = zf0Var.f40167a;
                if (xi0Var != null) {
                    xi0Var.start();
                }
                if (i12 == 15) {
                    aj0Var.getAnimatedDrawable().N(0, false, false);
                    aj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 6));
                return;
            case 2:
                fe0 fe0Var = zf0Var.f40192w;
                zf0Var.f40187q0 = false;
                while (true) {
                    gs[] gsVarArr2 = zf0Var.f40175f.f33081f;
                    if (i11 < gsVarArr2.length) {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (zf0Var.f40176f0 == 15) {
                            view = zf0Var.F;
                        } else {
                            view = zf0Var.f40194y;
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
                org.telegram.ui.Components.aj0 aj0Var2 = zf0Var.f40190s;
                aj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xi0 xi0Var2 = zf0Var.O;
                xi0Var2.N(0, false, false);
                xi0Var2.K(1);
                aj0Var2.setAnimation(xi0Var2);
                aj0Var2.d();
                return;
            case 5:
                try {
                    zf0Var.f40191s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.vl.h(new StringBuilder("+"), zf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.xi0 xi0Var3 = zf0Var.P;
                xi0Var3.f29967t0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.aj0 aj0Var3 = zf0Var.f40190s;
                aj0Var3.setAutoRepeat(false);
                xi0Var3.N(0, false, false);
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
                ds dsVar2 = zf0Var.f40175f;
                dsVar2.e = false;
                dsVar2.f33081f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = dsVar2.f33081f;
                    if (i11 < gsVarArr3.length) {
                        gsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.aj0 aj0Var4 = zf0Var.f40190s;
                aj0Var4.setAutoRepeat(false);
                aj0Var4.setAnimation(zf0Var.f40167a);
                return;
        }
    }
}
