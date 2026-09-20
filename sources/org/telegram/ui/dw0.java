package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dw0 implements Runnable {
    public final int f33163a = 1;
    public final mw0 f33164b;
    public final boolean f33165c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final ArrayList f33166f;

    public dw0(mw0 mw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f33164b = mw0Var;
        this.f33165c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f33166f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f33163a) {
            case 0:
                mw0 mw0Var = this.f33164b;
                mw0Var.getClass();
                boolean z10 = this.f33165c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f33166f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, arrayList, null);
                }
                mw0Var.c(true);
                return;
            default:
                mw0 mw0Var2 = this.f33164b;
                mw0Var2.getClass();
                boolean z11 = this.f33165c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f33166f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList3, null);
                }
                mw0Var2.c(true);
                return;
        }
    }

    public dw0(mw0 mw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f33164b = mw0Var;
        this.f33165c = z10;
        this.e = n2Var;
        this.f33166f = arrayList;
        this.d = pollAnswer;
    }
}
