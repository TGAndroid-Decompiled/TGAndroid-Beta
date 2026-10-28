package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class d3 extends t61 {
    public static final int f36482a = 0;

    static {
        t61.setup(new t61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof c3) {
            wallettransaction3 = ((c3) wallettransaction).f36450a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof c3) {
            wallettransaction4 = ((c3) wallettransaction2).f36450a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.i0(wallettransaction, wallettransaction2) && !l0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((f3) view).g((TL_wallet.walletTransaction) u61Var.G, (e3) u61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        Object obj = u61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = u61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new f3(context, i10, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        Object obj = u61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = u61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return a((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return true;
    }
}
