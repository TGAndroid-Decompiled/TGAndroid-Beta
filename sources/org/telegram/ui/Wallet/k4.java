package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.w81;
public final class k4 extends w81 {
    public final Context f34425a;
    public final o5 f34426b;

    public k4(o5 o5Var, Context context) {
        this.f34426b = o5Var;
        this.f34425a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        o5.S0((c71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i13;
        o5 o5Var = this.f34426b;
        c71[] c71VarArr = o5Var.f34662q0;
        c71 c71Var = c71VarArr[i10];
        if (c71Var == null) {
            i11 = ((org.telegram.ui.ActionBar.n2) o5Var).currentAccount;
            i12 = ((org.telegram.ui.ActionBar.n2) o5Var).classGuid;
            org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
            s3 s3Var = new s3(o5Var);
            s3 s3Var2 = new s3(o5Var);
            d6Var = ((org.telegram.ui.ActionBar.n2) o5Var).resourceProvider;
            if (i10 == 1) {
                i13 = 3;
            } else {
                i13 = -1;
            }
            c71 c71Var2 = new c71(this.f34425a, i11, i12, false, oVar, s3Var, s3Var2, d6Var, i13, 1);
            if (i10 == 1) {
                c71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            c71Var2.setFocusableInTouchMode(false);
            c71Var2.setClipChildren(false);
            c71Var2.setClipToPadding(false);
            if (i10 == 0) {
                c71Var2.p1();
            } else {
                c71Var2.setSelectorType(9);
                c71Var2.setSelectorDrawableColor(0);
            }
            c71Var2.W2.f30864r = false;
            c71Var2.j(new l51(this, i10));
            c71VarArr[i10] = c71Var2;
            return c71Var2;
        }
        return c71Var;
    }

    @Override
    public final int e() {
        if (this.f34426b.f34649e0) {
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
