package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cw0 implements Runnable {
    public final int f35561a = 1;
    public final lw0 f35562b;
    public final boolean f35563c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 f35564e;
    public final ArrayList f35565f;

    public cw0(lw0 lw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f35562b = lw0Var;
        this.f35563c = z10;
        this.d = pollAnswer;
        this.f35564e = n2Var;
        this.f35565f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f35561a) {
            case 0:
                lw0 lw0Var = this.f35562b;
                lw0Var.getClass();
                boolean z10 = this.f35563c;
                org.telegram.ui.ActionBar.n2 n2Var = this.f35564e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(lw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f35565f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(lw0Var.H, arrayList, null);
                }
                lw0Var.c(true);
                return;
            default:
                lw0 lw0Var2 = this.f35562b;
                lw0Var2.getClass();
                boolean z11 = this.f35563c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f35564e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f35565f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList3, null);
                }
                lw0Var2.c(true);
                return;
        }
    }

    public cw0(lw0 lw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f35562b = lw0Var;
        this.f35563c = z10;
        this.f35564e = n2Var;
        this.f35565f = arrayList;
        this.d = pollAnswer;
    }
}
