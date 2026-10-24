package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.p51;
public final class i4 extends d91 {
    public final Context f34601a;
    public final o5 f34602b;

    public i4(o5 o5Var, Context context) {
        this.f34602b = o5Var;
        this.f34601a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        o5.T0((i71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        o5 o5Var = this.f34602b;
        i71[] i71VarArr = o5Var.f34952q0;
        i71 i71Var = i71VarArr[i10];
        if (i71Var == null) {
            i11 = ((org.telegram.ui.ActionBar.o2) o5Var).currentAccount;
            i12 = ((org.telegram.ui.ActionBar.o2) o5Var).classGuid;
            org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
            r3 r3Var = new r3(o5Var);
            r3 r3Var2 = new r3(o5Var);
            g6Var = ((org.telegram.ui.ActionBar.o2) o5Var).resourceProvider;
            if (i10 == 1) {
                i13 = 3;
            } else {
                i13 = -1;
            }
            i71 i71Var2 = new i71(this.f34601a, i11, i12, false, oVar, r3Var, r3Var2, g6Var, i13, 1);
            if (i10 == 1) {
                i71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            i71Var2.setFocusableInTouchMode(false);
            i71Var2.setClipChildren(false);
            i71Var2.setClipToPadding(false);
            if (i10 == 0) {
                i71Var2.t1();
            } else {
                i71Var2.setSelectorType(9);
                i71Var2.setSelectorDrawableColor(0);
            }
            i71Var2.Z2.f24646r = false;
            i71Var2.j(new p51(this, i10));
            i71VarArr[i10] = i71Var2;
            return i71Var2;
        }
        return i71Var;
    }

    @Override
    public final int e() {
        if (this.f34602b.f34939e0) {
            return 2;
        }
        return 1;
    }

    @Override
    public final CharSequence g(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = R.string.WalletTransactions;
        } else {
            i11 = R.string.WalletCollectibles;
        }
        return LocaleController.getString(i11);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
