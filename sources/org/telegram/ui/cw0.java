package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cw0 implements Runnable {
    public final int f36842a = 1;
    public final lw0 f36843b;
    public final boolean f36844c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 f36845e;
    public final ArrayList f36846f;

    public cw0(lw0 lw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f36843b = lw0Var;
        this.f36844c = z10;
        this.d = pollAnswer;
        this.f36845e = m2Var;
        this.f36846f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36842a) {
            case 0:
                lw0 lw0Var = this.f36843b;
                lw0Var.getClass();
                boolean z10 = this.f36844c;
                org.telegram.ui.ActionBar.m2 m2Var = this.f36845e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(lw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f36846f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(lw0Var.H, arrayList, null);
                }
                lw0Var.c(true);
                return;
            default:
                lw0 lw0Var2 = this.f36843b;
                lw0Var2.getClass();
                boolean z11 = this.f36844c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f36845e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f36846f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList3, null);
                }
                lw0Var2.c(true);
                return;
        }
    }

    public cw0(lw0 lw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36843b = lw0Var;
        this.f36844c = z10;
        this.f36845e = m2Var;
        this.f36846f = arrayList;
        this.d = pollAnswer;
    }
}
