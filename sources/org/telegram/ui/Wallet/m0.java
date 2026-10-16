package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bs0;
public final class m0 {
    public static final long[] f33180j = {500, 1000, 3000, 5000, 10000};
    public final int f33181a;
    public final String f33182b;
    public final bs0 f33183c;
    public boolean d;
    public int e;
    public int f33184f;
    public int f33185g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f33149b;

        {
            this.f33149b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f33149b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f33185g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f33181a).cancelRequest(m0Var.f33185g, true);
                            m0Var.f33185g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f33149b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f33182b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f33185g = ConnectionsManager.getInstance(m0Var2.f33181a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f33186i = new Runnable(this) {
        public final m0 f33149b;

        {
            this.f33149b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f33149b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f33185g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f33181a).cancelRequest(m0Var.f33185g, true);
                            m0Var.f33185g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f33149b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f33182b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f33185g = ConnectionsManager.getInstance(m0Var2.f33181a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, bs0 bs0Var) {
        this.f33181a = i10;
        this.f33182b = str;
        this.f33183c = bs0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f33184f;
        long j10 = f33180j[i10];
        if (i10 < 4) {
            this.f33184f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f33186i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f33186i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f33185g >= 0) {
            ConnectionsManager.getInstance(this.f33181a).cancelRequest(this.f33185g, true);
            this.f33185g = -1;
        }
    }
}
