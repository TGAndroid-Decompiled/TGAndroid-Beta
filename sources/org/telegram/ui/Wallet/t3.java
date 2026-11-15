package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class t3 extends a41 {
    public static final int f44512b = 0;

    static {
        a41.h(new a41());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof s3) {
            wallettransaction3 = ((s3) wallettransaction).f44480a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof s3) {
            wallettransaction4 = ((s3) wallettransaction2).f44480a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.i0(wallettransaction, wallettransaction2) && !l0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((v3) view).g((TL_wallet.walletTransaction) b41Var.G, (u3) b41Var.H, z10);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        Object obj = b41Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b41Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new v3(i7, context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        Object obj = b41Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b41Var2.G;
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
