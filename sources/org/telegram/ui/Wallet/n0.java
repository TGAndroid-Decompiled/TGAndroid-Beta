package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ns0;
public final class n0 {
    public static final long[] f35103j = {500, 1000, 3000, 5000, 10000};
    public final int f35104a;
    public final String f35105b;
    public final ns0 f35106c;
    public boolean d;
    public int f35107e;
    public int f35108f;
    public int f35109g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f35070b;

        {
            this.f35070b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35070b;
                    if (n0Var.d) {
                        n0Var.f35107e++;
                        if (n0Var.f35109g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35104a).cancelRequest(n0Var.f35109g, true);
                            n0Var.f35109g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35070b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35107e + 1;
                        n0Var2.f35107e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35105b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35109g = ConnectionsManager.getInstance(n0Var2.f35104a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f35110i = new Runnable(this) {
        public final n0 f35070b;

        {
            this.f35070b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35070b;
                    if (n0Var.d) {
                        n0Var.f35107e++;
                        if (n0Var.f35109g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35104a).cancelRequest(n0Var.f35109g, true);
                            n0Var.f35109g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35070b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35107e + 1;
                        n0Var2.f35107e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35105b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35109g = ConnectionsManager.getInstance(n0Var2.f35104a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, ns0 ns0Var) {
        this.f35104a = i10;
        this.f35105b = str;
        this.f35106c = ns0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35108f;
        long j3 = f35103j[i10];
        if (i10 < 4) {
            this.f35108f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35110i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35107e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35110i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35109g >= 0) {
            ConnectionsManager.getInstance(this.f35104a).cancelRequest(this.f35109g, true);
            this.f35109g = -1;
        }
    }
}
