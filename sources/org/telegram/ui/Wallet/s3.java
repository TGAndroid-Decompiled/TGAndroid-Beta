package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class s3 extends x31 {
    public static final int f43087b = 0;

    static {
        x31.h(new x31());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof r3) {
            wallettransaction3 = ((r3) wallettransaction).f43045a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof r3) {
            wallettransaction4 = ((r3) wallettransaction2).f43045a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !l0.i0(wallettransaction, wallettransaction2) && !l0.i0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((u3) view).g((TL_wallet.walletTransaction) y31Var.G, (t3) y31Var.H, z9);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        Object obj = y31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = y31Var2.G;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new u3(i7, context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        Object obj = y31Var.G;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = y31Var2.G;
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
