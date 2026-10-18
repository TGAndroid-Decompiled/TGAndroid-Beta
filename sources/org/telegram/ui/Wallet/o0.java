package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gn0;
public final class o0 {
    public static final long[] f34659j = {500, 1000, 3000, 5000, 10000};
    public final int f34660a;
    public final String f34661b;
    public final gn0 f34662c;
    public boolean d;
    public int e;
    public int f34663f;
    public int f34664g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34617b;

        {
            this.f34617b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34617b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34664g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34660a).cancelRequest(o0Var.f34664g, true);
                            o0Var.f34664g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34617b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34661b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34664g = ConnectionsManager.getInstance(o0Var2.f34660a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34665i = new Runnable(this) {
        public final o0 f34617b;

        {
            this.f34617b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34617b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34664g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34660a).cancelRequest(o0Var.f34664g, true);
                            o0Var.f34664g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34617b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34661b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34664g = ConnectionsManager.getInstance(o0Var2.f34660a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, gn0 gn0Var) {
        this.f34660a = i10;
        this.f34661b = str;
        this.f34662c = gn0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34663f;
        long j10 = f34659j[i10];
        if (i10 < 4) {
            this.f34663f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34665i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34665i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34664g >= 0) {
            ConnectionsManager.getInstance(this.f34660a).cancelRequest(this.f34664g, true);
            this.f34664g = -1;
        }
    }
}
