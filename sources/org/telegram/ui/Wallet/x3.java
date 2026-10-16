package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.q51;
public final class x3 extends d91 {
    public final a5 f33583a;

    public x3(a5 a5Var) {
        this.f33583a = a5Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        i71 i71Var = (i71) view;
        boolean canScrollVertically = i71Var.canScrollVertically(-1);
        i71Var.W2.N(false);
        i71Var.a0();
        if (!canScrollVertically) {
            i71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        a5 a5Var = this.f33583a;
        i71[] i71VarArr = a5Var.f32652p0;
        i71 i71Var = i71VarArr[i10];
        if (i71Var != null) {
            return i71Var;
        }
        i71 i71Var2 = new i71(a5Var, new org.telegram.ui.Components.o(this, i10, 2), new j3(a5Var), new j3(a5Var));
        i71Var2.setFocusableInTouchMode(false);
        i71Var2.setClipChildren(false);
        i71Var2.setClipToPadding(false);
        i71Var2.p1();
        i71Var2.W2.f23145r = false;
        i71Var2.j(new q51(this, i10));
        i71VarArr[i10] = i71Var2;
        return i71Var2;
    }

    @Override
    public final int e() {
        if (this.f33583a.f32643g0) {
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
