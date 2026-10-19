package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.en0;
public final class o0 {
    public static final long[] f34618j = {500, 1000, 3000, 5000, 10000};
    public final int f34619a;
    public final String f34620b;
    public final en0 f34621c;
    public boolean d;
    public int e;
    public int f34622f;
    public int f34623g = -1;
    public final n0 h = new Runnable(this) {
        public final o0 f34538b;

        {
            this.f34538b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34538b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34623g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34619a).cancelRequest(o0Var.f34623g, true);
                            o0Var.f34623g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34538b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34620b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34623g = ConnectionsManager.getInstance(o0Var2.f34619a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };
    public final n0 f34624i = new Runnable(this) {
        public final o0 f34538b;

        {
            this.f34538b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    o0 o0Var = this.f34538b;
                    if (o0Var.d) {
                        o0Var.e++;
                        if (o0Var.f34623g >= 0) {
                            ConnectionsManager.getInstance(o0Var.f34619a).cancelRequest(o0Var.f34623g, true);
                            o0Var.f34623g = -1;
                        }
                        o0Var.a();
                        return;
                    }
                    return;
                default:
                    o0 o0Var2 = this.f34538b;
                    if (o0Var2.d) {
                        int i10 = o0Var2.e + 1;
                        o0Var2.e = i10;
                        TL_wallet.getTransactionsByMsgHash gettransactionsbymsghash = new TL_wallet.getTransactionsByMsgHash();
                        gettransactionsbymsghash.msg_hash.add(o0Var2.f34620b);
                        AndroidUtilities.runOnUIThread(o0Var2.h, 30000L);
                        o0Var2.f34623g = ConnectionsManager.getInstance(o0Var2.f34619a).sendRequestTyped(gettransactionsbymsghash, new Object(), new org.telegram.ui.Components.o(o0Var2, i10, 1));
                        return;
                    }
                    return;
            }
        }
    };

    public o0(int i10, String str, en0 en0Var) {
        this.f34619a = i10;
        this.f34620b = str;
        this.f34621c = en0Var;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        int i10 = this.f34622f;
        long j10 = f34618j[i10];
        if (i10 < 4) {
            this.f34622f = i10 + 1;
        }
        AndroidUtilities.runOnUIThread(this.f34624i, j10);
    }

    public final void b() {
        this.d = false;
        this.e++;
        AndroidUtilities.cancelRunOnUIThread(this.f34624i);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f34623g >= 0) {
            ConnectionsManager.getInstance(this.f34619a).cancelRequest(this.f34623g, true);
            this.f34623g = -1;
        }
    }
}
