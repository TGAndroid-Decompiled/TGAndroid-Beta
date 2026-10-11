package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.u51;
public final class y3 extends g91 {
    public final c5 f35765a;

    public y3(c5 c5Var) {
        this.f35765a = c5Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        l71 l71Var = (l71) view;
        boolean canScrollVertically = l71Var.canScrollVertically(-1);
        l71Var.W2.N(false);
        l71Var.a0();
        if (!canScrollVertically) {
            l71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        c5 c5Var = this.f35765a;
        l71[] l71VarArr = c5Var.f34790p0;
        l71 l71Var = l71VarArr[i10];
        if (l71Var != null) {
            return l71Var;
        }
        l71 l71Var2 = new l71(c5Var, new org.telegram.ui.Components.o(this, i10, 2), new k3(c5Var), new k3(c5Var));
        l71Var2.setFocusableInTouchMode(false);
        l71Var2.setClipChildren(false);
        l71Var2.setClipToPadding(false);
        l71Var2.p1();
        l71Var2.W2.f25649r = false;
        l71Var2.j(new u51(this, i10));
        l71VarArr[i10] = l71Var2;
        return l71Var2;
    }

    @Override
    public final int e() {
        if (this.f35765a.f34781g0) {
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
