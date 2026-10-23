package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class d3 extends l61 {
    public static final int f34401a = 0;

    static {
        l61.setup(new l61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof c3) {
            wallettransaction3 = ((c3) wallettransaction).f34360a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof c3) {
            wallettransaction4 = ((c3) wallettransaction2).f34360a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.f0(wallettransaction, wallettransaction2) && !l0.f0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((f3) view).g((TL_wallet.walletTransaction) m61Var.G, (e3) m61Var.H, z10);
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f3(context, i10, g6Var);
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
