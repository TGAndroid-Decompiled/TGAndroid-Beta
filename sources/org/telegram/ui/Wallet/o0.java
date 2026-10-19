package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.en0;
public final class o0 {
    public static final long[] f34616j = {500, 1000, 3000, 5000, 10000};
    public final int f34617a;
    public final String f34618b;
    public final en0 f34619c;
    public boolean d;
    public int e;
    public int f34620f;
    public int f34621g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34536b;

        {
            this.f34536b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34536b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34621g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34617a).cancelRequest(o0Var.f34621g, true);
                            o0Var.f34621g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34536b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34618b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34621g = ConnectionsManager.getInstance(o0Var2.f34617a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34622i = new Runnable(this) {
        public final o0 f34536b;

        {
            this.f34536b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34536b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34621g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34617a).cancelRequest(o0Var.f34621g, true);
                            o0Var.f34621g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34536b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34618b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34621g = ConnectionsManager.getInstance(o0Var2.f34617a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, en0 en0Var) {
        this.f34617a = i10;
        this.f34618b = str;
        this.f34619c = en0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34620f;
        long j10 = f34616j[i10];
        if (i10 < 4) {
            this.f34620f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34622i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34622i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34621g >= 0) {
            ConnectionsManager.getInstance(this.f34617a).cancelRequest(this.f34621g, true);
            this.f34621g = -1;
        }
    }
}
