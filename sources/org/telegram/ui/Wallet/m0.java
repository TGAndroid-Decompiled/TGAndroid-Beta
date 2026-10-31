package org.telegram.ui.Wallet;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ep0;
public final class m0 {
    public static final long[] f34877j = {500, 1000, 3000, 5000, 10000};
    public final int f34878a;
    public final String f34879b;
    public final ep0 f34880c;
    public boolean d;
    public int e;
    public int f34881f;
    public int f34882g = -1;
    public final l0 h = new Runnable(this) {
        public final m0 f34831b;

        {
            this.f34831b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34831b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f34882g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f34878a).cancelRequest(m0Var.f34882g, true);
                            m0Var.f34882g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f34831b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f34879b);
                        org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                        m0Var2.f34882g = ConnectionsManager.getInstance(m0Var2.f34878a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final l0 f34883i = new Runnable(this) {
        public final m0 f34831b;

        {
            this.f34831b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    m0 m0Var = this.f34831b;
                    if (m0Var.d) {
                        m0Var.e++;
                        if (m0Var.f34882g >= 0) {
                            ConnectionsManager.getInstance(m0Var.f34878a).cancelRequest(m0Var.f34882g, true);
                            m0Var.f34882g = -1;
                        }
                        m0Var.a();
                        return;
                    }
                    return;
                default:
                    m0 m0Var2 = this.f34831b;
                    if (m0Var2.d) {
                        int i10 = m0Var2.e + 1;
                        m0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(m0Var2.f34879b);
                        org.telegram.messenger.i0.h3(m0Var2.h, 30000L);
                        m0Var2.f34882g = ConnectionsManager.getInstance(m0Var2.f34878a).sendRequestTyped(gettransactionsbymsghash, new a3.b(1), new org.telegram.ui.Components.p(m0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public m0(int i10, String str, ep0 ep0Var) {
        this.f34878a = i10;
        this.f34879b = str;
        this.f34880c = ep0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34881f;
        long j10 = f34877j[i10];
        if (i10 < 4) {
            this.f34881f = i10 + 1;
        }
        org.telegram.messenger.i0.h3(this.f34883i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        org.telegram.messenger.i0.r(this.f34883i);
        org.telegram.messenger.i0.r(this.h);
        if (this.f34882g >= 0) {
            ConnectionsManager.getInstance(this.f34878a).cancelRequest(this.f34882g, true);
            this.f34882g = -1;
        }
    }
}
