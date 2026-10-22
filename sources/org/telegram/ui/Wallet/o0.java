package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.en0;
public final class o0 {
    public static final long[] f34628j = {500, 1000, 3000, 5000, 10000};
    public final int f34629a;
    public final String f34630b;
    public final en0 f34631c;
    public boolean d;
    public int e;
    public int f34632f;
    public int f34633g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34548b;

        {
            this.f34548b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34548b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34633g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34629a).cancelRequest(o0Var.f34633g, true);
                            o0Var.f34633g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34548b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34630b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34633g = ConnectionsManager.getInstance(o0Var2.f34629a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34634i = new Runnable(this) {
        public final o0 f34548b;

        {
            this.f34548b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34548b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34633g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34629a).cancelRequest(o0Var.f34633g, true);
                            o0Var.f34633g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34548b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34630b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34633g = ConnectionsManager.getInstance(o0Var2.f34629a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, en0 en0Var) {
        this.f34629a = i10;
        this.f34630b = str;
        this.f34631c = en0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34632f;
        long j10 = f34628j[i10];
        if (i10 < 4) {
            this.f34632f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34634i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34634i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34633g >= 0) {
            ConnectionsManager.getInstance(this.f34629a).cancelRequest(this.f34633g, true);
            this.f34633g = -1;
        }
    }
}
