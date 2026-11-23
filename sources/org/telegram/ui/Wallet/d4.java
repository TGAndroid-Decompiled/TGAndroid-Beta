package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class d4 extends n41 {
    public static final int f44043b = 0;

    static {
        n41.h(new n41());
    }

    public static o41 i(TL_wallet.walletTransaction wallettransaction, e4 e4Var) {
        String a10;
        o41 K = o41.K(d4.class);
        c4 c4Var = new c4(wallettransaction);
        c4Var.set(wallettransaction);
        c4Var.f28661id = wallettransaction.f28661id;
        c4Var.random_id = wallettransaction.random_id;
        c4Var.gasless = wallettransaction.gasless;
        c4Var.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        c4Var.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        c4Var.nft = wallettransaction.nft;
        K.H = c4Var;
        K.I = e4Var;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (walletTransactionPeer == null) {
            a10 = null;
        } else {
            a10 = e4Var.a(walletTransactionPeer.address);
        }
        K.f38058m = a10;
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof c4) {
            wallettransaction3 = ((c4) wallettransaction).f44003a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof c4) {
            wallettransaction4 = ((c4) wallettransaction2).f44003a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !u0.t0(wallettransaction, wallettransaction2) && !u0.t0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((f4) view).h((TL_wallet.walletTransaction) o41Var.H, (e4) o41Var.I, z10);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        Object obj = o41Var.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = o41Var2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new f4(i7, context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        Object obj = o41Var.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = o41Var2.H;
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
