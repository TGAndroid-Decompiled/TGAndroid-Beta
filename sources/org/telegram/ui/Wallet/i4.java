package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.q51;
public final class i4 extends d91 {
    public final Context f34599a;
    public final o5 f34600b;

    public i4(o5 o5Var, Context context) {
        this.f34600b = o5Var;
        this.f34599a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        o5.T0((j71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        o5 o5Var = this.f34600b;
        j71[] j71VarArr = o5Var.f34950q0;
        j71 j71Var = j71VarArr[i10];
        if (j71Var == null) {
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
            j71 j71Var2 = new j71(this.f34599a, i11, i12, false, oVar, r3Var, r3Var2, g6Var, i13, 1);
            if (i10 == 1) {
                j71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            j71Var2.setFocusableInTouchMode(false);
            j71Var2.setClipChildren(false);
            j71Var2.setClipToPadding(false);
            if (i10 == 0) {
                j71Var2.t1();
            } else {
                j71Var2.setSelectorType(9);
                j71Var2.setSelectorDrawableColor(0);
            }
            j71Var2.Z2.f24972r = false;
            j71Var2.j(new q51(this, i10));
            j71VarArr[i10] = j71Var2;
            return j71Var2;
        }
        return j71Var;
    }

    @Override
    public final int e() {
        if (this.f34600b.f34937e0) {
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
