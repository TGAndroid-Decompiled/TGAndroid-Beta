package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p51;
public final class w3 extends c91 {
    public final z4 f33794a;

    public w3(z4 z4Var) {
        this.f33794a = z4Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        h71 h71Var = (h71) view;
        boolean canScrollVertically = h71Var.canScrollVertically(-1);
        h71Var.W2.N(false);
        h71Var.a0();
        if (!canScrollVertically) {
            h71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        z4 z4Var = this.f33794a;
        h71[] h71VarArr = z4Var.f33935p0;
        h71 h71Var = h71VarArr[i10];
        if (h71Var != null) {
            return h71Var;
        }
        h71 h71Var2 = new h71(z4Var, new org.telegram.ui.Components.o(this, i10, 2), new i3(z4Var), new i3(z4Var));
        h71Var2.setFocusableInTouchMode(false);
        h71Var2.setClipChildren(false);
        h71Var2.setClipToPadding(false);
        h71Var2.p1();
        h71Var2.W2.f31780r = false;
        h71Var2.j(new p51(this, i10));
        h71VarArr[i10] = h71Var2;
        return h71Var2;
    }

    @Override
    public final int e() {
        if (this.f33794a.f33926g0) {
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
