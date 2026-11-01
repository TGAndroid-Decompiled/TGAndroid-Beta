package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class u3 extends a51 {
    public static final int f35275b = 0;

    static {
        a51.h(new a51());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof t3) {
            wallettransaction3 = ((t3) wallettransaction).f35233a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof t3) {
            wallettransaction4 = ((t3) wallettransaction2).f35233a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !k0.i0(wallettransaction, wallettransaction2) && !k0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((w3) view).g((TL_wallet.walletTransaction) b51Var.G, (v3) b51Var.H, z10);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        Object obj = b51Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b51Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new w3(i10, context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        Object obj = b51Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b51Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return i((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
