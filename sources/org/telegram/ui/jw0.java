package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jw0 implements Runnable {
    public final int f37448a = 1;
    public final sw0 f37449b;
    public final boolean f37450c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final ArrayList f37451f;

    public jw0(sw0 sw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f37449b = sw0Var;
        this.f37450c = z10;
        this.d = pollAnswer;
        this.e = m2Var;
        this.f37451f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f37448a) {
            case 0:
                sw0 sw0Var = this.f37449b;
                sw0Var.getClass();
                boolean z10 = this.f37450c;
                org.telegram.ui.ActionBar.m2 m2Var = this.e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(sw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f37451f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(sw0Var.H, arrayList, null);
                }
                sw0Var.c(true);
                return;
            default:
                sw0 sw0Var2 = this.f37449b;
                sw0Var2.getClass();
                boolean z11 = this.f37450c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(sw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f37451f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(sw0Var2.H, arrayList3, null);
                }
                sw0Var2.c(true);
                return;
        }
    }

    public jw0(sw0 sw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f37449b = sw0Var;
        this.f37450c = z10;
        this.e = m2Var;
        this.f37451f = arrayList;
        this.d = pollAnswer;
    }
}
