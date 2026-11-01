package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cp0;
public final class m0 {
    public static final long[] f34881j = {500, 1000, 3000, 5000, 10000};
    public final int f34882a;
    public final String f34883b;
    public final cp0 f34884c;
    public boolean d;
    public int e;
    public int f34885f;
    public int f34886g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f34835b;

        {
            this.f34835b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34835b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f34886g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f34882a).cancelRequest(m0Var.f34886g, true);
                            m0Var.f34886g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f34835b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f34883b);
                        org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                        m0Var2.f34886g = ConnectionsManager.getInstance(m0Var2.f34882a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f34887i = new Runnable(this) {
        public final m0 f34835b;

        {
            this.f34835b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34835b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f34886g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f34882a).cancelRequest(m0Var.f34886g, true);
                            m0Var.f34886g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f34835b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f34883b);
                        org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                        m0Var2.f34886g = ConnectionsManager.getInstance(m0Var2.f34882a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, cp0 cp0Var) {
        this.f34882a = i10;
        this.f34883b = str;
        this.f34884c = cp0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34885f;
        long j10 = f34881j[i10];
        if (i10 < 4) {
            this.f34885f = i10 + 1;
        }
        org.telegram.messenger.i0.h3(this.f34887i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        org.telegram.messenger.i0.r(this.f34887i);
        org.telegram.messenger.i0.r(this.h);
        if (this.f34886g >= 0) {
            ConnectionsManager.getInstance(this.f34882a).cancelRequest(this.f34886g, true);
            this.f34886g = -1;
        }
    }
}
