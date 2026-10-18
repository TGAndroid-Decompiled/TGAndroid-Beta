package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class d3 extends e61 {
    public static final int f34083a = 0;

    static {
        e61.setup(new e61());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof c3) {
            wallettransaction3 = ((c3) wallettransaction).f34043a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof c3) {
            wallettransaction4 = ((c3) wallettransaction2).f34043a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !m0.f0(wallettransaction, wallettransaction2) && !m0.f0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((f3) view).h((TL_wallet.walletTransaction) f61Var.G, (e3) f61Var.H, z10);
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        Object obj = f61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = f61Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f3(context, i10, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        Object obj = f61Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = f61Var2.G;
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
