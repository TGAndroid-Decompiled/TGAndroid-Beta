package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.js0;
public final class n0 {
    public static final long[] f35300j = {500, 1000, 3000, 5000, 10000};
    public final int f35301a;
    public final String f35302b;
    public final js0 f35303c;
    public boolean d;
    public int f35304e;
    public int f35305f;
    public int f35306g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f35259b;

        {
            this.f35259b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35259b;
                    if (n0Var.d) {
                        n0Var.f35304e++;
                        if (n0Var.f35306g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35301a).cancelRequest(n0Var.f35306g, true);
                            n0Var.f35306g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35259b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35304e + 1;
                        n0Var2.f35304e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35302b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35306g = ConnectionsManager.getInstance(n0Var2.f35301a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f35307i = new Runnable(this) {
        public final n0 f35259b;

        {
            this.f35259b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35259b;
                    if (n0Var.d) {
                        n0Var.f35304e++;
                        if (n0Var.f35306g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35301a).cancelRequest(n0Var.f35306g, true);
                            n0Var.f35306g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35259b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35304e + 1;
                        n0Var2.f35304e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35302b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35306g = ConnectionsManager.getInstance(n0Var2.f35301a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, js0 js0Var) {
        this.f35301a = i10;
        this.f35302b = str;
        this.f35303c = js0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35305f;
        long j3 = f35300j[i10];
        if (i10 < 4) {
            this.f35305f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35307i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35304e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35307i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35306g >= 0) {
            ConnectionsManager.getInstance(this.f35301a).cancelRequest(this.f35306g, true);
            this.f35306g = -1;
        }
    }
}
