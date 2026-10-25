package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.zg1;
public final class n0 {
    public static final long[] f36975j = {500, 1000, 3000, 5000, 10000};
    public final int f36976a;
    public final String f36977b;
    public final zg1 f36978c;
    public boolean d;
    public int e;
    public int f36979f;
    public int f36980g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f36874b;

        {
            this.f36874b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36874b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f36980g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f36976a).cancelRequest(n0Var.f36980g, true);
                            n0Var.f36980g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36874b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f36977b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f36980g = ConnectionsManager.getInstance(n0Var2.f36976a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f36981i = new Runnable(this) {
        public final n0 f36874b;

        {
            this.f36874b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36874b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f36980g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f36976a).cancelRequest(n0Var.f36980g, true);
                            n0Var.f36980g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36874b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f36977b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f36980g = ConnectionsManager.getInstance(n0Var2.f36976a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, zg1 zg1Var) {
        this.f36976a = i10;
        this.f36977b = str;
        this.f36978c = zg1Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f36979f;
        long j10 = f36975j[i10];
        if (i10 < 4) {
            this.f36979f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f36981i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f36981i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f36980g >= 0) {
            ConnectionsManager.getInstance(this.f36976a).cancelRequest(this.f36980g, true);
            this.f36980g = -1;
        }
    }
}
