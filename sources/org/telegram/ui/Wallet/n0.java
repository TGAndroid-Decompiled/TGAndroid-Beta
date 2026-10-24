package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.pl0;
public final class n0 {
    public static final long[] f34889j = {500, 1000, 3000, 5000, 10000};
    public final int f34890a;
    public final String f34891b;
    public final pl0 f34892c;
    public boolean d;
    public int e;
    public int f34893f;
    public int f34894g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f34796b;

        {
            this.f34796b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f34796b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f34894g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f34890a).cancelRequest(n0Var.f34894g, true);
                            n0Var.f34894g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f34796b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f34891b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f34894g = ConnectionsManager.getInstance(n0Var2.f34890a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f34895i = new Runnable(this) {
        public final n0 f34796b;

        {
            this.f34796b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f34796b;
                    if (n0Var.d) {
                        n0Var.e++;
                        if (n0Var.f34894g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f34890a).cancelRequest(n0Var.f34894g, true);
                            n0Var.f34894g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f34796b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.e + 1;
                        n0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f34891b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f34894g = ConnectionsManager.getInstance(n0Var2.f34890a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, pl0 pl0Var) {
        this.f34890a = i10;
        this.f34891b = str;
        this.f34892c = pl0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34893f;
        long j10 = f34889j[i10];
        if (i10 < 4) {
            this.f34893f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34895i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34895i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34894g >= 0) {
            ConnectionsManager.getInstance(this.f34890a).cancelRequest(this.f34894g, true);
            this.f34894g = -1;
        }
    }
}
