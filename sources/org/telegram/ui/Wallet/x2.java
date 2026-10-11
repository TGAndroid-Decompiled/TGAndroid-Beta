package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class x2 extends p61 {
    public static final int f35723a = 0;

    static {
        p61.setup(new p61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof w2) {
            wallettransaction3 = ((w2) wallettransaction).f35692a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof w2) {
            wallettransaction4 = ((w2) wallettransaction2).f35692a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.d0(wallettransaction, wallettransaction2) && !l0.d0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((z2) view).h((TL_wallet.walletTransaction) q61Var.G, (y2) q61Var.H, z10);
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
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z2(context, i10, d6Var);
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
