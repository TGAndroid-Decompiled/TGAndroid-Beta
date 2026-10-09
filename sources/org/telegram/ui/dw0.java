package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dw0 implements Runnable {
    public final int f37097a = 1;
    public final mw0 f37098b;
    public final boolean f37099c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.n2 f37100e;
    public final ArrayList f37101f;

    public dw0(mw0 mw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.f37098b = mw0Var;
        this.f37099c = z10;
        this.d = pollAnswer;
        this.f37100e = n2Var;
        this.f37101f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f37097a) {
            case 0:
                mw0 mw0Var = this.f37098b;
                mw0Var.getClass();
                boolean z10 = this.f37099c;
                org.telegram.ui.ActionBar.n2 n2Var = this.f37100e;
                if (!z10) {
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f37101f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, arrayList, null);
                }
                mw0Var.c(true);
                return;
            default:
                mw0 mw0Var2 = this.f37098b;
                mw0Var2.getClass();
                boolean z11 = this.f37099c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f37100e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f37101f;
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList3, null);
                }
                mw0Var2.c(true);
                return;
        }
    }

    public dw0(mw0 mw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f37098b = mw0Var;
        this.f37099c = z10;
        this.f37100e = n2Var;
        this.f37101f = arrayList;
        this.d = pollAnswer;
    }
}
