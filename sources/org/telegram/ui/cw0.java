package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cw0 implements Runnable {
    public final int f36876a = 1;
    public final lw0 f36877b;
    public final boolean f36878c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 f36879e;
    public final ArrayList f36880f;

    public cw0(lw0 lw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f36877b = lw0Var;
        this.f36878c = z10;
        this.d = pollAnswer;
        this.f36879e = m2Var;
        this.f36880f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36876a) {
            case 0:
                lw0 lw0Var = this.f36877b;
                lw0Var.getClass();
                boolean z10 = this.f36878c;
                org.telegram.ui.ActionBar.m2 m2Var = this.f36879e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(lw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f36880f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(lw0Var.H, arrayList, null);
                }
                lw0Var.c(true);
                return;
            default:
                lw0 lw0Var2 = this.f36877b;
                lw0Var2.getClass();
                boolean z11 = this.f36878c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f36879e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f36880f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(lw0Var2.H, arrayList3, null);
                }
                lw0Var2.c(true);
                return;
        }
    }

    public cw0(lw0 lw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36877b = lw0Var;
        this.f36878c = z10;
        this.f36879e = m2Var;
        this.f36880f = arrayList;
        this.d = pollAnswer;
    }
}
