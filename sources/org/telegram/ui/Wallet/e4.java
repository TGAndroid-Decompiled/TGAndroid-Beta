package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class e4 extends m41 {
    public static final int f44204b = 0;

    static {
        m41.h(new m41());
    }

    public static n41 i(TL_wallet.walletTransaction wallettransaction, f4 f4Var) {
        String a10;
        n41 K = n41.K(e4.class);
        d4 d4Var = new d4(wallettransaction);
        d4Var.set(wallettransaction);
        d4Var.f28755id = wallettransaction.f28755id;
        d4Var.random_id = wallettransaction.random_id;
        d4Var.gasless = wallettransaction.gasless;
        d4Var.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        d4Var.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        d4Var.nft = wallettransaction.nft;
        K.H = d4Var;
        K.I = f4Var;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (walletTransactionPeer == null) {
            a10 = null;
        } else {
            a10 = f4Var.a(walletTransactionPeer.address);
        }
        K.f37655m = a10;
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof d4) {
            wallettransaction3 = ((d4) wallettransaction).f44164a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof d4) {
            wallettransaction4 = ((d4) wallettransaction2).f44164a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !v0.t0(wallettransaction, wallettransaction2) && !v0.t0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((g4) view).h((TL_wallet.walletTransaction) n41Var.H, (f4) n41Var.I, z10);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        Object obj = n41Var.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = n41Var2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new g4(i7, context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        Object obj = n41Var.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = n41Var2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return j((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
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
