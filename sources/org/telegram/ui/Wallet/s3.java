package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class s3 extends q31 {
    public static final int f43150b = 0;

    static {
        q31.h(new q31());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof r3) {
            wallettransaction3 = ((r3) wallettransaction).f43119a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof r3) {
            wallettransaction4 = ((r3) wallettransaction2).f43119a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !k0.i0(wallettransaction, wallettransaction2) && !k0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((u3) view).g((TL_wallet.walletTransaction) r31Var.G, (t3) r31Var.H, z10);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = r31Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u3(i3, context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = r31Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return i((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
