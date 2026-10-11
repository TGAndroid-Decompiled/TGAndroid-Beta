package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class x2 extends q61 {
    public static final int f35689a = 0;

    static {
        q61.setup(new q61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof w2) {
            wallettransaction3 = ((w2) wallettransaction).f35658a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof w2) {
            wallettransaction4 = ((w2) wallettransaction2).f35658a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.d0(wallettransaction, wallettransaction2) && !l0.d0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ((z2) view).h((TL_wallet.walletTransaction) r61Var.G, (y2) r61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        Object obj = r61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = r61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z2(context, i10, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        Object obj = r61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = r61Var2.G;
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
