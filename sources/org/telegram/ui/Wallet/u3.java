package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class u3 extends z41 {
    public static final int f35269b = 0;

    static {
        z41.h(new z41());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof t3) {
            wallettransaction3 = ((t3) wallettransaction).f35231a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof t3) {
            wallettransaction4 = ((t3) wallettransaction2).f35231a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !k0.i0(wallettransaction, wallettransaction2) && !k0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((w3) view).g((TL_wallet.walletTransaction) a51Var.G, (v3) a51Var.H, z10);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        Object obj = a51Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = a51Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new w3(i10, context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        Object obj = a51Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = a51Var2.G;
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
