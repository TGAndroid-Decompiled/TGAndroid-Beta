package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class e3 extends f61 {
    public static final int f34142a = 0;

    static {
        f61.setup(new f61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof d3) {
            wallettransaction3 = ((d3) wallettransaction).f34093a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof d3) {
            wallettransaction4 = ((d3) wallettransaction2).f34093a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !m0.f0(wallettransaction, wallettransaction2) && !m0.f0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((g3) view).h((TL_wallet.walletTransaction) g61Var.G, (f3) g61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        Object obj = g61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = g61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g3(context, i10, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        Object obj = g61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = g61Var2.G;
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
