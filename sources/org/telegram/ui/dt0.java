package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dt0 implements Runnable {
    public final int f36825a = 1;
    public final kt0 f36826b;
    public final boolean f36827c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.k2 e;
    public final ArrayList f36828f;

    public dt0(kt0 kt0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList) {
        this.f36826b = kt0Var;
        this.f36827c = z10;
        this.d = pollAnswer;
        this.e = k2Var;
        this.f36828f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36825a) {
            case 0:
                kt0 kt0Var = this.f36826b;
                kt0Var.getClass();
                boolean z10 = this.f36827c;
                org.telegram.ui.ActionBar.k2 k2Var = this.e;
                if (!z10) {
                    k2Var.getSendMessagesHelper().w0(kt0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f36828f;
                    arrayList.remove(this.d);
                    k2Var.getSendMessagesHelper().w0(kt0Var.H, arrayList, null);
                }
                kt0Var.c(true);
                return;
            default:
                kt0 kt0Var2 = this.f36826b;
                kt0Var2.getClass();
                boolean z11 = this.f36827c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = this.e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(kt0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f36828f;
                    arrayList3.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(kt0Var2.H, arrayList3, null);
                }
                kt0Var2.c(true);
                return;
        }
    }

    public dt0(kt0 kt0Var, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36826b = kt0Var;
        this.f36827c = z10;
        this.e = k2Var;
        this.f36828f = arrayList;
        this.d = pollAnswer;
    }
}
