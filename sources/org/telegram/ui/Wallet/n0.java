package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.zg1;
public final class n0 {
    public static final long[] f36978j = {500, 1000, 3000, 5000, 10000};
    public final int f36979a;
    public final String f36980b;
    public final zg1 f36981c;
    public boolean d;
    public int e;
    public int f36982f;
    public int f36983g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f36877b;

        {
            this.f36877b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36877b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f36983g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f36979a).cancelRequest(n0Var.f36983g, true);
                            n0Var.f36983g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36877b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f36980b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f36983g = ConnectionsManager.getInstance(n0Var2.f36979a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f36984i = new Runnable(this) {
        public final n0 f36877b;

        {
            this.f36877b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f36877b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f36983g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f36979a).cancelRequest(n0Var.f36983g, true);
                            n0Var.f36983g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f36877b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f36980b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f36983g = ConnectionsManager.getInstance(n0Var2.f36979a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, zg1 zg1Var) {
        this.f36979a = i10;
        this.f36980b = str;
        this.f36981c = zg1Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f36982f;
        long j10 = f36978j[i10];
        if (i10 < 4) {
            this.f36982f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f36984i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f36984i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f36983g >= 0) {
            ConnectionsManager.getInstance(this.f36979a).cancelRequest(this.f36983g, true);
            this.f36983g = -1;
        }
    }
}
