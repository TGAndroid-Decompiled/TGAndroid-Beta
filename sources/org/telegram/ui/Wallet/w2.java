package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class w2 extends p61 {
    public static final int f35659a = 0;

    static {
        p61.setup(new p61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof v2) {
            wallettransaction3 = ((v2) wallettransaction).f35628a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof v2) {
            wallettransaction4 = ((v2) wallettransaction2).f35628a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !k0.d0(wallettransaction, wallettransaction2) && !k0.d0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((y2) view).h((TL_wallet.walletTransaction) q61Var.G, (x2) q61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        Object obj = q61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = q61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y2(context, i10, e6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        Object obj = q61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = q61Var2.G;
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
