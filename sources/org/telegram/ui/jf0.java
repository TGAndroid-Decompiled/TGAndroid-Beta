package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jf0 implements Runnable {
    public final int f34731a;
    public final wf0 f34732b;

    public jf0(wf0 wf0Var, int i10) {
        this.f34731a = i10;
        this.f34732b = wf0Var;
    }

    @Override
    public final void run() {
        ds[] dsVarArr;
        View view;
        int i10 = this.f34731a;
        int i11 = 0;
        wf0 wf0Var = this.f34732b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = wf0Var.G;
                bs bsVar = wf0Var.f39266f;
                int i12 = wf0Var.f39267f0;
                if (i12 != 3 && (dsVarArr = bsVar.f32431f) != null) {
                    for (int length = dsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || bsVar.f32431f[length].length() != 0) {
                            bsVar.f32431f[length].requestFocus();
                            ds dsVar = bsVar.f32431f[length];
                            dsVar.setSelection(dsVar.length());
                            tg0.T0(wf0Var.f39282s0, bsVar.f32431f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = wf0Var.f39258a;
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
                AndroidUtilities.runOnUIThread(new jf0(wf0Var, 6));
                return;
            case 2:
                ce0 ce0Var = wf0Var.f39283w;
                wf0Var.f39278q0 = false;
                while (true) {
                    ds[] dsVarArr2 = wf0Var.f39266f.f32431f;
                    if (i11 < dsVarArr2.length) {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (wf0Var.f39267f0 == 15) {
                            view = wf0Var.F;
                        } else {
                            view = wf0Var.f39285y;
                        }
                        if (ce0Var.getCurrentView() != view) {
                            ce0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new jf0(wf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.nj0 nj0Var2 = wf0Var.f39281s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = wf0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                return;
            case 5:
                try {
                    wf0Var.f39282s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.qk.h(new StringBuilder("+"), wf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new sf0(wf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = wf0Var.P;
                kj0Var3.f25770t0 = new jf0(wf0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = wf0Var.f39281s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                return;
            case 7:
                wf0Var.postDelayed(new jf0(wf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jf0(wf0Var, 10));
                return;
            case 9:
                bs bsVar2 = wf0Var.f39266f;
                bsVar2.e = false;
                bsVar2.f32431f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = bsVar2.f32431f;
                    if (i11 < dsVarArr3.length) {
                        dsVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = wf0Var.f39281s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(wf0Var.f39258a);
                return;
        }
    }
}
