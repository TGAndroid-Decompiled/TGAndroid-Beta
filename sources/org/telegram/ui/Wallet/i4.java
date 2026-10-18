package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.u81;
public final class i4 extends u81 {
    public final Context f34329a;
    public final m5 f34330b;

    public i4(m5 m5Var, Context context) {
        this.f34330b = m5Var;
        this.f34329a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        m5.R0((a71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i13;
        m5 m5Var = this.f34330b;
        a71[] a71VarArr = m5Var.f34588s0;
        a71 a71Var = a71VarArr[i10];
        if (a71Var == null) {
            i11 = ((org.telegram.ui.ActionBar.n2) m5Var).currentAccount;
            i12 = ((org.telegram.ui.ActionBar.n2) m5Var).classGuid;
            org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
            q3 q3Var = new q3(m5Var);
            q3 q3Var2 = new q3(m5Var);
            d6Var = ((org.telegram.ui.ActionBar.n2) m5Var).resourceProvider;
            if (i10 == 1) {
                i13 = 3;
            } else {
                i13 = -1;
            }
            a71 a71Var2 = new a71(this.f34329a, i11, i12, false, oVar, q3Var, q3Var2, d6Var, i13, 1);
            if (i10 == 1) {
                a71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            a71Var2.setFocusableInTouchMode(false);
            a71Var2.setClipChildren(false);
            a71Var2.setClipToPadding(false);
            if (i10 == 0) {
                a71Var2.p1();
            } else {
                a71Var2.setSelectorType(9);
                a71Var2.setSelectorDrawableColor(0);
            }
            a71Var2.W2.f30207r = false;
            a71Var2.j(new j51(this, i10));
            a71VarArr[i10] = a71Var2;
            return a71Var2;
        }
        return a71Var;
    }

    @Override
    public final int e() {
        if (this.f34330b.f34574g0) {
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
