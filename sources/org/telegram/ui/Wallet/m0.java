package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ls0;
public final class m0 {
    public static final long[] f35270j = {500, 1000, 3000, 5000, 10000};
    public final int f35271a;
    public final String f35272b;
    public final ls0 f35273c;
    public boolean d;
    public int f35274e;
    public int f35275f;
    public int f35276g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f35229b;

        {
            this.f35229b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35229b;
                    if (m0Var.d) {
                        m0Var.f35274e++;
                        if (m0Var.f35276g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35271a).cancelRequest(m0Var.f35276g, true);
                            m0Var.f35276g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35229b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35274e + 1;
                        m0Var2.f35274e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35272b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35276g = ConnectionsManager.getInstance(m0Var2.f35271a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f35277i = new Runnable(this) {
        public final m0 f35229b;

        {
            this.f35229b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35229b;
                    if (m0Var.d) {
                        m0Var.f35274e++;
                        if (m0Var.f35276g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35271a).cancelRequest(m0Var.f35276g, true);
                            m0Var.f35276g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35229b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35274e + 1;
                        m0Var2.f35274e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35272b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35276g = ConnectionsManager.getInstance(m0Var2.f35271a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, ls0 ls0Var) {
        this.f35271a = i10;
        this.f35272b = str;
        this.f35273c = ls0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35275f;
        long j3 = f35270j[i10];
        if (i10 < 4) {
            this.f35275f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35277i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35274e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35277i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35276g >= 0) {
            ConnectionsManager.getInstance(this.f35271a).cancelRequest(this.f35276g, true);
            this.f35276g = -1;
        }
    }
}
