package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class bv0 implements Runnable {

    public final int f36888a = 1;

    public final jv0 f36889b;

    public final boolean f36890c;
    public final TLRPC.PollAnswer d;

    public final org.telegram.ui.ActionBar.n2 f36891e;

    public final ArrayList f36892f;

    public bv0(jv0 jv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f36889b = jv0Var;
        this.f36890c = z10;
        this.d = pollAnswer;
        this.f36891e = n2Var;
        this.f36892f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36888a) {
            case 0:
                jv0 jv0Var = this.f36889b;
                jv0Var.getClass();
                boolean z10 = this.f36890c;
                org.telegram.ui.ActionBar.n2 n2Var = this.f36891e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f36892f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(jv0Var.D, arrayList, null);
                } else {
                    n2Var.getSendMessagesHelper().sendVote(jv0Var.D, null, null);
                }
                jv0Var.c(true);
                break;
            default:
                jv0 jv0Var2 = this.f36889b;
                jv0Var2.getClass();
                boolean z11 = this.f36890c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f36891e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f36892f;
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(jv0Var2.D, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(jv0Var2.D, arrayList3, null);
                }
                jv0Var2.c(true);
                break;
        }
    }

    public bv0(jv0 jv0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36889b = jv0Var;
        this.f36890c = z10;
        this.f36891e = n2Var;
        this.f36892f = arrayList;
        this.d = pollAnswer;
    }
}
