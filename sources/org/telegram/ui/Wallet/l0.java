package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cs0;
public final class l0 {
    public static final long[] f33414j = {500, 1000, 3000, 5000, 10000};
    public final int f33415a;
    public final String f33416b;
    public final cs0 f33417c;
    public boolean d;
    public int e;
    public int f33418f;
    public int f33419g = -1;
    public final k0 h = new Runnable(this) {
        public final l0 f33383b;

        {
            this.f33383b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    l0 l0Var = this.f33383b;
                    if (l0Var.d) {
                        l0Var.e++;
                        if (l0Var.f33419g >= 0) {
                            ConnectionsManager.getInstance(l0Var.f33415a).cancelRequest(l0Var.f33419g, true);
                            l0Var.f33419g = -1;
                        }
                        l0Var.a();
                        return;
                    }
                    return;
                default:
                    l0 l0Var2 = this.f33383b;
                    if (l0Var2.d) {
                        int i10 = l0Var2.e + 1;
                        l0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(l0Var2.f33416b);
                        AndroidUtilities.runOnUIThread(l0Var2.h, 30000L);
                        l0Var2.f33419g = ConnectionsManager.getInstance(l0Var2.f33415a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(l0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final k0 f33420i = new Runnable(this) {
        public final l0 f33383b;

        {
            this.f33383b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    l0 l0Var = this.f33383b;
                    if (l0Var.d) {
                        l0Var.e++;
                        if (l0Var.f33419g >= 0) {
                            ConnectionsManager.getInstance(l0Var.f33415a).cancelRequest(l0Var.f33419g, true);
                            l0Var.f33419g = -1;
                        }
                        l0Var.a();
                        return;
                    }
                    return;
                default:
                    l0 l0Var2 = this.f33383b;
                    if (l0Var2.d) {
                        int i10 = l0Var2.e + 1;
                        l0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(l0Var2.f33416b);
                        AndroidUtilities.runOnUIThread(l0Var2.h, 30000L);
                        l0Var2.f33419g = ConnectionsManager.getInstance(l0Var2.f33415a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(l0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public l0(int i10, String str, cs0 cs0Var) {
        this.f33415a = i10;
        this.f33416b = str;
        this.f33417c = cs0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f33418f;
        long j10 = f33414j[i10];
        if (i10 < 4) {
            this.f33418f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f33420i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f33420i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f33419g >= 0) {
            ConnectionsManager.getInstance(this.f33415a).cancelRequest(this.f33419g, true);
            this.f33419g = -1;
        }
    }
}
