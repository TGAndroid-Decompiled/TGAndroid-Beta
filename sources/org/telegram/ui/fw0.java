package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fw0 implements Runnable {
    public final int f37863a = 1;
    public final ow0 f37864b;
    public final boolean f37865c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 f37866e;
    public final ArrayList f37867f;

    public fw0(ow0 ow0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f37864b = ow0Var;
        this.f37865c = z10;
        this.d = pollAnswer;
        this.f37866e = m2Var;
        this.f37867f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f37863a) {
            case 0:
                ow0 ow0Var = this.f37864b;
                ow0Var.getClass();
                boolean z10 = this.f37865c;
                org.telegram.ui.ActionBar.m2 m2Var = this.f37866e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(ow0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f37867f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(ow0Var.H, arrayList, null);
                }
                ow0Var.c(true);
                return;
            default:
                ow0 ow0Var2 = this.f37864b;
                ow0Var2.getClass();
                boolean z11 = this.f37865c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f37866e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f37867f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList3, null);
                }
                ow0Var2.c(true);
                return;
        }
    }

    public fw0(ow0 ow0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f37864b = ow0Var;
        this.f37865c = z10;
        this.f37866e = m2Var;
        this.f37867f = arrayList;
        this.d = pollAnswer;
    }
}
