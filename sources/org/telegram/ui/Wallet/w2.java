package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class w2 extends l61 {
    public static final int f33545a = 0;

    static {
        l61.setup(new l61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof v2) {
            wallettransaction3 = ((v2) wallettransaction).f33499a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof v2) {
            wallettransaction4 = ((v2) wallettransaction2).f33499a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !k0.d0(wallettransaction, wallettransaction2) && !k0.d0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((y2) view).h((TL_wallet.walletTransaction) m61Var.G, (x2) m61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        Object obj = m61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = m61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y2(context, i10, c6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        Object obj = m61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = m61Var2.G;
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
