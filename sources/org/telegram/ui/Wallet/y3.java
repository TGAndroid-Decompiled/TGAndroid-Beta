package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.v51;
public final class y3 extends h91 {
    public final c5 f35731a;

    public y3(c5 c5Var) {
        this.f35731a = c5Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        m71 m71Var = (m71) view;
        boolean canScrollVertically = m71Var.canScrollVertically(-1);
        m71Var.W2.N(false);
        m71Var.a0();
        if (!canScrollVertically) {
            m71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        c5 c5Var = this.f35731a;
        m71[] m71VarArr = c5Var.f34756p0;
        m71 m71Var = m71VarArr[i10];
        if (m71Var != null) {
            return m71Var;
        }
        m71 m71Var2 = new m71(c5Var, new org.telegram.ui.Components.o(this, i10, 2), new k3(c5Var), new k3(c5Var));
        m71Var2.setFocusableInTouchMode(false);
        m71Var2.setClipChildren(false);
        m71Var2.setClipToPadding(false);
        m71Var2.p1();
        m71Var2.W2.f25890r = false;
        m71Var2.j(new v51(this, i10));
        m71VarArr[i10] = m71Var2;
        return m71Var2;
    }

    @Override
    public final int e() {
        if (this.f35731a.f34747g0) {
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
