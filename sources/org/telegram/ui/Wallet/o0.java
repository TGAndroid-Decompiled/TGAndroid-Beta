package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.fr0;
public final class o0 {
    public static final long[] f34657j = {500, 1000, 3000, 5000, 10000};
    public final int f34658a;
    public final String f34659b;
    public final fr0 f34660c;
    public boolean d;
    public int e;
    public int f34661f;
    public int f34662g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34623b;

        {
            this.f34623b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34623b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34662g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34658a).cancelRequest(o0Var.f34662g, true);
                            o0Var.f34662g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34623b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34659b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34662g = ConnectionsManager.getInstance(o0Var2.f34658a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34663i = new Runnable(this) {
        public final o0 f34623b;

        {
            this.f34623b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34623b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34662g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34658a).cancelRequest(o0Var.f34662g, true);
                            o0Var.f34662g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34623b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34659b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34662g = ConnectionsManager.getInstance(o0Var2.f34658a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, fr0 fr0Var) {
        this.f34658a = i10;
        this.f34659b = str;
        this.f34660c = fr0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34661f;
        long j10 = f34657j[i10];
        if (i10 < 4) {
            this.f34661f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34663i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34663i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34662g >= 0) {
            ConnectionsManager.getInstance(this.f34658a).cancelRequest(this.f34662g, true);
            this.f34662g = -1;
        }
    }
}
