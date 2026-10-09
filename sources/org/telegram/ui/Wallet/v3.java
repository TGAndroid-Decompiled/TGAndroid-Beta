package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.t51;
public final class v3 extends f91 {
    public final z4 f35551a;

    public v3(z4 z4Var) {
        this.f35551a = z4Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        k71 k71Var = (k71) view;
        boolean canScrollVertically = k71Var.canScrollVertically(-1);
        k71Var.W2.N(false);
        k71Var.a0();
        if (!canScrollVertically) {
            k71Var.V2.h1(0, 0);
        }
    }

    @Override
    public final View d(int i10) {
        z4 z4Var = this.f35551a;
        k71[] k71VarArr = z4Var.f35730p0;
        k71 k71Var = k71VarArr[i10];
        if (k71Var != null) {
            return k71Var;
        }
        k71 k71Var2 = new k71(z4Var, new org.telegram.ui.Components.o(this, i10, 2), new h3(z4Var), new h3(z4Var));
        k71Var2.setFocusableInTouchMode(false);
        k71Var2.setClipChildren(false);
        k71Var2.setClipToPadding(false);
        k71Var2.p1();
        k71Var2.W2.f25280r = false;
        k71Var2.j(new t51(this, i10));
        k71VarArr[i10] = k71Var2;
        return k71Var2;
    }

    @Override
    public final int e() {
        if (this.f35551a.f35721g0) {
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
