package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.en0;
public final class o0 {
    public static final long[] f34625j = {500, 1000, 3000, 5000, 10000};
    public final int f34626a;
    public final String f34627b;
    public final en0 f34628c;
    public boolean d;
    public int e;
    public int f34629f;
    public int f34630g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34545b;

        {
            this.f34545b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34545b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34630g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34626a).cancelRequest(o0Var.f34630g, true);
                            o0Var.f34630g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34545b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34627b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34630g = ConnectionsManager.getInstance(o0Var2.f34626a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34631i = new Runnable(this) {
        public final o0 f34545b;

        {
            this.f34545b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34545b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34630g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34626a).cancelRequest(o0Var.f34630g, true);
                            o0Var.f34630g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34545b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34627b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34630g = ConnectionsManager.getInstance(o0Var2.f34626a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, en0 en0Var) {
        this.f34626a = i10;
        this.f34627b = str;
        this.f34628c = en0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34629f;
        long j10 = f34625j[i10];
        if (i10 < 4) {
            this.f34629f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34631i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34631i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34630g >= 0) {
            ConnectionsManager.getInstance(this.f34626a).cancelRequest(this.f34630g, true);
            this.f34630g = -1;
        }
    }
}
