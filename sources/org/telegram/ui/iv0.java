package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iv0 implements Runnable {
    public final int f38117a = 1;
    public final qv0 f38118b;
    public final boolean f38119c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final ArrayList f38120f;

    public iv0(qv0 qv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f38118b = qv0Var;
        this.f38119c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f38120f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f38117a) {
            case 0:
                qv0 qv0Var = this.f38118b;
                qv0Var.getClass();
                boolean z10 = this.f38119c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(qv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f38120f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(qv0Var.H, arrayList, null);
                }
                qv0Var.c(true);
                return;
            default:
                qv0 qv0Var2 = this.f38118b;
                qv0Var2.getClass();
                boolean z11 = this.f38119c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(qv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f38120f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(qv0Var2.H, arrayList3, null);
                }
                qv0Var2.c(true);
                return;
        }
    }

    public iv0(qv0 qv0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f38118b = qv0Var;
        this.f38119c = z10;
        this.e = n2Var;
        this.f38120f = arrayList;
        this.d = pollAnswer;
    }
}
