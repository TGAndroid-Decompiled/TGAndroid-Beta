package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bh1;
public final class n0 {
    public static final long[] f37002j = {500, 1000, 3000, 5000, 10000};
    public final int f37003a;
    public final String f37004b;
    public final bh1 f37005c;
    public boolean d;
    public int e;
    public int f37006f;
    public int f37007g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f36882b;

        {
            this.f36882b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36882b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f37007g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f37003a).cancelRequest(n0Var.f37007g, true);
                            n0Var.f37007g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36882b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f37004b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f37007g = ConnectionsManager.getInstance(n0Var2.f37003a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f37008i = new Runnable(this) {
        public final n0 f36882b;

        {
            this.f36882b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36882b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f37007g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f37003a).cancelRequest(n0Var.f37007g, true);
                            n0Var.f37007g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36882b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f37004b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f37007g = ConnectionsManager.getInstance(n0Var2.f37003a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, bh1 bh1Var) {
        this.f37003a = i10;
        this.f37004b = str;
        this.f37005c = bh1Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f37006f;
        long j10 = f37002j[i10];
        if (i10 < 4) {
            this.f37006f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f37008i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f37008i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f37007g >= 0) {
            ConnectionsManager.getInstance(this.f37003a).cancelRequest(this.f37007g, true);
            this.f37007g = -1;
        }
    }
}
