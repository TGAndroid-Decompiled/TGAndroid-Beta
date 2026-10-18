package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kv0 implements Runnable {
    public final int f38634a = 1;
    public final sv0 f38635b;
    public final boolean f38636c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final ArrayList f38637f;

    public kv0(sv0 sv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f38635b = sv0Var;
        this.f38636c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f38637f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f38634a) {
            case 0:
                sv0 sv0Var = this.f38635b;
                sv0Var.getClass();
                boolean z10 = this.f38636c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(sv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f38637f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(sv0Var.H, arrayList, null);
                }
                sv0Var.c(true);
                return;
            default:
                sv0 sv0Var2 = this.f38635b;
                sv0Var2.getClass();
                boolean z11 = this.f38636c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(sv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f38637f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(sv0Var2.H, arrayList3, null);
                }
                sv0Var2.c(true);
                return;
        }
    }

    public kv0(sv0 sv0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f38635b = sv0Var;
        this.f38636c = z10;
        this.e = n2Var;
        this.f38637f = arrayList;
        this.d = pollAnswer;
    }
}
