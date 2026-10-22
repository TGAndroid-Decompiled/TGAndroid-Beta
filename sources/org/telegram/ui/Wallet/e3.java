package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class e3 extends g61 {
    public static final int f34152a = 0;

    static {
        g61.setup(new g61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof d3) {
            wallettransaction3 = ((d3) wallettransaction).f34103a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof d3) {
            wallettransaction4 = ((d3) wallettransaction2).f34103a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !m0.f0(wallettransaction, wallettransaction2) && !m0.f0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((g3) view).h((TL_wallet.walletTransaction) h61Var.G, (f3) h61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        Object obj = h61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = h61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g3(context, i10, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        Object obj = h61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = h61Var2.G;
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
