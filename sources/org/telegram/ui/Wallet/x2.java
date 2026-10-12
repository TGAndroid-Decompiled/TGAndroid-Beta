package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class x2 extends t61 {
    public static final int f35501a = 0;

    static {
        t61.setup(new t61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof w2) {
            wallettransaction3 = ((w2) wallettransaction).f35470a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof w2) {
            wallettransaction4 = ((w2) wallettransaction2).f35470a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.d0(wallettransaction, wallettransaction2) && !l0.d0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        ((z2) view).h((TL_wallet.walletTransaction) u61Var.G, (y2) u61Var.H, z10);
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
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new z2(context, i10, c6Var);
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
