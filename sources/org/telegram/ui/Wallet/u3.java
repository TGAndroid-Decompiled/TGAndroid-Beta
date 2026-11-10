package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class u3 extends w31 {
    public static final int f43219b = 0;

    static {
        w31.h(new w31());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof t3) {
            wallettransaction3 = ((t3) wallettransaction).f43181a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof t3) {
            wallettransaction4 = ((t3) wallettransaction2).f43181a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.i0(wallettransaction, wallettransaction2) && !l0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((w3) view).g((TL_wallet.walletTransaction) x31Var.G, (v3) x31Var.H, z9);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = x31Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w3(i7, context, h6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = x31Var2.G;
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
