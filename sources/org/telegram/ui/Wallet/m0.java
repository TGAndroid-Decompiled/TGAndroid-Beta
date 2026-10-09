package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ls0;
public final class m0 {
    public static final long[] f35202j = {500, 1000, 3000, 5000, 10000};
    public final int f35203a;
    public final String f35204b;
    public final ls0 f35205c;
    public boolean d;
    public int f35206e;
    public int f35207f;
    public int f35208g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f35155b;

        {
            this.f35155b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35155b;
                    if (m0Var.d) {
                        m0Var.f35206e++;
                        if (m0Var.f35208g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35203a).cancelRequest(m0Var.f35208g, true);
                            m0Var.f35208g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35155b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35206e + 1;
                        m0Var2.f35206e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35204b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35208g = ConnectionsManager.getInstance(m0Var2.f35203a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f35209i = new Runnable(this) {
        public final m0 f35155b;

        {
            this.f35155b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f35155b;
                    if (m0Var.d) {
                        m0Var.f35206e++;
                        if (m0Var.f35208g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f35203a).cancelRequest(m0Var.f35208g, true);
                            m0Var.f35208g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f35155b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.f35206e + 1;
                        m0Var2.f35206e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f35204b);
                        AndroidUtilities.runOnUIThread(m0Var2.h, 30000L);
                        m0Var2.f35208g = ConnectionsManager.getInstance(m0Var2.f35203a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, ls0 ls0Var) {
        this.f35203a = i10;
        this.f35204b = str;
        this.f35205c = ls0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f35207f;
        long j3 = f35202j[i10];
        if (i10 < 4) {
            this.f35207f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f35209i, j3);
    }

    public final void b() {
        this.d = false;
        this.f35206e++;
        AndroidUtilities.cancelRunOnUIThread(this.f35209i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f35208g >= 0) {
            ConnectionsManager.getInstance(this.f35203a).cancelRequest(this.f35208g, true);
            this.f35208g = -1;
        }
    }
}
