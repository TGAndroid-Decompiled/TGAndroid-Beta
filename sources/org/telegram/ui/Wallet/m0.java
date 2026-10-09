package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ls0;
public final class m0 {
    public static final long[] f35218j = {500, 1000, 3000, 5000, 10000};
    public final int f35219a;
    public final String f35220b;
    public final ls0 f35221c;
    public boolean d;
    public int f35222e;
    public int f35223f;
    public int f35224g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f35181b;

        {
            this.f35181b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35181b;
                    if (m0Var.d) {
                        m0Var.f35222e++;
                        if (m0Var.f35224g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35219a).cancelRequest(m0Var.f35224g, true);
                            m0Var.f35224g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35181b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35222e + 1;
                        m0Var2.f35222e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35220b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35224g = ConnectionsManager.getInstance(m0Var2.f35219a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f35225i = new Runnable(this) {
        public final m0 f35181b;

        {
            this.f35181b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35181b;
                    if (m0Var.d) {
                        m0Var.f35222e++;
                        if (m0Var.f35224g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35219a).cancelRequest(m0Var.f35224g, true);
                            m0Var.f35224g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35181b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35222e + 1;
                        m0Var2.f35222e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35220b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35224g = ConnectionsManager.getInstance(m0Var2.f35219a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, ls0 ls0Var) {
        this.f35219a = i10;
        this.f35220b = str;
        this.f35221c = ls0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35223f;
        long j3 = f35218j[i10];
        if (i10 < 4) {
            this.f35223f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35225i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35222e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35225i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35224g >= 0) {
            ConnectionsManager.getInstance(this.f35219a).cancelRequest(this.f35224g, true);
            this.f35224g = -1;
        }
    }
}
