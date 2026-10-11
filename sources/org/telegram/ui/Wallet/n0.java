package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.js0;
public final class n0 {
    public static final long[] f35334j = {500, 1000, 3000, 5000, 10000};
    public final int f35335a;
    public final String f35336b;
    public final js0 f35337c;
    public boolean d;
    public int f35338e;
    public int f35339f;
    public int f35340g = -1;
    public final m0 h = new Runnable(this) {
        public final n0 f35293b;

        {
            this.f35293b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35293b;
                    if (n0Var.d) {
                        n0Var.f35338e++;
                        if (n0Var.f35340g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35335a).cancelRequest(n0Var.f35340g, true);
                            n0Var.f35340g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35293b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35338e + 1;
                        n0Var2.f35338e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35336b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35340g = ConnectionsManager.getInstance(n0Var2.f35335a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final m0 f35341i = new Runnable(this) {
        public final n0 f35293b;

        {
            this.f35293b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    n0 n0Var = this.f35293b;
                    if (n0Var.d) {
                        n0Var.f35338e++;
                        if (n0Var.f35340g >= 0) {
                            ConnectionsManager.getInstance(n0Var.f35335a).cancelRequest(n0Var.f35340g, true);
                            n0Var.f35340g = -1;
                        }
                        n0Var.a();
                        return;
                    }
                    return;
                default:
                    n0 n0Var2 = this.f35293b;
                    if (n0Var2.d) {
                        int i10 = n0Var2.f35338e + 1;
                        n0Var2.f35338e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(n0Var2.f35336b);
                        AndroidUtilities.runOnUIThread(n0Var2.h, 30000L);
                        n0Var2.f35340g = ConnectionsManager.getInstance(n0Var2.f35335a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(n0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public n0(int i10, String str, js0 js0Var) {
        this.f35335a = i10;
        this.f35336b = str;
        this.f35337c = js0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35339f;
        long j3 = f35334j[i10];
        if (i10 < 4) {
            this.f35339f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35341i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35338e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35341i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35340g >= 0) {
            ConnectionsManager.getInstance(this.f35335a).cancelRequest(this.f35340g, true);
            this.f35340g = -1;
        }
    }
}
