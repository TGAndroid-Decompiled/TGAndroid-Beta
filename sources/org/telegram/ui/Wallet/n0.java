package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ql0;
public final class n0 {
    public static final long[] f34887j = {500, 1000, 3000, 5000, 10000};
    public final int f34888a;
    public final String f34889b;
    public final ql0 f34890c;
    public boolean d;
    public int e;
    public int f34891f;
    public int f34892g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f34794b;

        {
            this.f34794b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f34794b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f34892g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f34888a).cancelRequest(n0Var.f34892g, true);
                            n0Var.f34892g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f34794b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f34889b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f34892g = ConnectionsManager.getInstance(n0Var2.f34888a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f34893i = new Runnable(this) {
        public final n0 f34794b;

        {
            this.f34794b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f34794b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f34892g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f34888a).cancelRequest(n0Var.f34892g, true);
                            n0Var.f34892g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f34794b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f34889b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f34892g = ConnectionsManager.getInstance(n0Var2.f34888a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, ql0 ql0Var) {
        this.f34888a = i10;
        this.f34889b = str;
        this.f34890c = ql0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34891f;
        long j10 = f34887j[i10];
        if (i10 < 4) {
            this.f34891f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34893i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34893i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34892g >= 0) {
            ConnectionsManager.getInstance(this.f34888a).cancelRequest(this.f34892g, true);
            this.f34892g = -1;
        }
    }
}
