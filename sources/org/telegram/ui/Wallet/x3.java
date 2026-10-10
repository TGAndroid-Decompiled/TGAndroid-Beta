package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.u51;
public final class x3 extends g91 {
    public final b5 f35701a;

    public x3(b5 b5Var) {
        this.f35701a = b5Var;
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
        b5 b5Var = this.f35701a;
        l71[] l71VarArr = b5Var.f34725p0;
        l71 l71Var = l71VarArr[i10];
        if (l71Var != null) {
            return l71Var;
        }
        l71 l71Var2 = new l71(b5Var, new org.telegram.ui.Components.o(this, i10, 2), new j3(b5Var), new j3(b5Var));
        l71Var2.setFocusableInTouchMode(false);
        l71Var2.setClipChildren(false);
        l71Var2.setClipToPadding(false);
        l71Var2.p1();
        l71Var2.W2.f25587r = false;
        l71Var2.j(new u51(this, i10));
        l71VarArr[i10] = l71Var2;
        return l71Var2;
    }

    @Override
    public final int e() {
        if (this.f35701a.f34716g0) {
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
