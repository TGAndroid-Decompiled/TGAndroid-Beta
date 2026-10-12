package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.y51;
public final class y3 extends l91 {
    public final c5 f35541a;

    public y3(c5 c5Var) {
        this.f35541a = c5Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        p71 p71Var = (p71) view;
        boolean canScrollVertically = p71Var.canScrollVertically(-1);
        p71Var.W2.N(false);
        p71Var.a0();
        if (!canScrollVertically) {
            p71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        c5 c5Var = this.f35541a;
        p71[] p71VarArr = c5Var.f34565p0;
        p71 p71Var = p71VarArr[i10];
        if (p71Var != null) {
            return p71Var;
        }
        p71 p71Var2 = new p71(c5Var, new org.telegram.ui.Components.o(this, i10, 2), new k3(c5Var), new k3(c5Var));
        p71Var2.setFocusableInTouchMode(false);
        p71Var2.setClipChildren(false);
        p71Var2.setClipToPadding(false);
        p71Var2.p1();
        p71Var2.W2.f26675r = false;
        p71Var2.j(new y51(this, i10));
        p71VarArr[i10] = p71Var2;
        return p71Var2;
    }

    @Override
    public final int e() {
        if (this.f35541a.f34556g0) {
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
