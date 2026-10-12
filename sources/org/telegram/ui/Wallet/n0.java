package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ns0;
public final class n0 {
    public static final long[] f35101j = {500, 1000, 3000, 5000, 10000};
    public final int f35102a;
    public final String f35103b;
    public final ns0 f35104c;
    public boolean d;
    public int f35105e;
    public int f35106f;
    public int f35107g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f35068b;

        {
            this.f35068b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35068b;
                    if (n0Var.d) {
                        n0Var.f35105e++;
                        if (n0Var.f35107g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35102a).cancelRequest(n0Var.f35107g, true);
                            n0Var.f35107g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35068b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35105e + 1;
                        n0Var2.f35105e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35103b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35107g = ConnectionsManager.getInstance(n0Var2.f35102a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f35108i = new Runnable(this) {
        public final n0 f35068b;

        {
            this.f35068b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35068b;
                    if (n0Var.d) {
                        n0Var.f35105e++;
                        if (n0Var.f35107g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35102a).cancelRequest(n0Var.f35107g, true);
                            n0Var.f35107g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35068b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35105e + 1;
                        n0Var2.f35105e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35103b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35107g = ConnectionsManager.getInstance(n0Var2.f35102a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, ns0 ns0Var) {
        this.f35102a = i10;
        this.f35103b = str;
        this.f35104c = ns0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35106f;
        long j3 = f35101j[i10];
        if (i10 < 4) {
            this.f35106f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35108i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35105e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35108i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35107g >= 0) {
            ConnectionsManager.getInstance(this.f35102a).cancelRequest(this.f35107g, true);
            this.f35107g = -1;
        }
    }
}
