package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class u3 extends v31 {
    public static final int f43201b = 0;

    static {
        v31.h(new v31());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof t3) {
            wallettransaction3 = ((t3) wallettransaction).f43158a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof t3) {
            wallettransaction4 = ((t3) wallettransaction2).f43158a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !n0.i0(wallettransaction, wallettransaction2) && !n0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((w3) view).g((TL_wallet.walletTransaction) w31Var.G, (v3) w31Var.H, z9);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        Object obj = w31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = w31Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w3(i7, context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        Object obj = w31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = w31Var2.G;
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
