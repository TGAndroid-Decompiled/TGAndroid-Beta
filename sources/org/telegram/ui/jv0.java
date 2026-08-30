package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jv0 implements Runnable {
    public final int f35515a = 1;
    public final rv0 f35516b;
    public final boolean f35517c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final ArrayList f35518f;

    public jv0(rv0 rv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.f35516b = rv0Var;
        this.f35517c = z4;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f35518f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f35515a) {
            case 0:
                rv0 rv0Var = this.f35516b;
                rv0Var.getClass();
                boolean z4 = this.f35517c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (!z4) {
                    p2Var.getSendMessagesHelper().sendVote(rv0Var.E, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f35518f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(rv0Var.E, arrayList, null);
                }
                rv0Var.c(true);
                return;
            default:
                rv0 rv0Var2 = this.f35516b;
                rv0Var2.getClass();
                boolean z10 = this.f35517c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (!z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(rv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f35518f;
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(rv0Var2.E, arrayList3, null);
                }
                rv0Var2.c(true);
                return;
        }
    }

    public jv0(rv0 rv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f35516b = rv0Var;
        this.f35517c = z4;
        this.e = p2Var;
        this.f35518f = arrayList;
        this.d = pollAnswer;
    }
}
