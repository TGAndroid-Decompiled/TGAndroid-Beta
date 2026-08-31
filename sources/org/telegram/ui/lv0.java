package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lv0 implements Runnable {
    public final int f38891a = 1;
    public final tv0 f38892b;
    public final boolean f38893c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.p2 f38894e;
    public final ArrayList f38895f;

    public lv0(tv0 tv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.f38892b = tv0Var;
        this.f38893c = z4;
        this.d = pollAnswer;
        this.f38894e = p2Var;
        this.f38895f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f38891a) {
            case 0:
                tv0 tv0Var = this.f38892b;
                tv0Var.getClass();
                boolean z4 = this.f38893c;
                org.telegram.ui.ActionBar.p2 p2Var = this.f38894e;
                if (!z4) {
                    p2Var.getSendMessagesHelper().sendVote(tv0Var.E, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f38895f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(tv0Var.E, arrayList, null);
                }
                tv0Var.c(true);
                return;
            default:
                tv0 tv0Var2 = this.f38892b;
                tv0Var2.getClass();
                boolean z10 = this.f38893c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f38894e;
                if (!z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(tv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f38895f;
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(tv0Var2.E, arrayList3, null);
                }
                tv0Var2.c(true);
                return;
        }
    }

    public lv0(tv0 tv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f38892b = tv0Var;
        this.f38893c = z4;
        this.f38894e = p2Var;
        this.f38895f = arrayList;
        this.d = pollAnswer;
    }
}
