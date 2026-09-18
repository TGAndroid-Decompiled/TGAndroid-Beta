package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fw0 implements Runnable {
    public final int f33785a = 1;
    public final ow0 f33786b;
    public final boolean f33787c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f33788f;

    public fw0(ow0 ow0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.f33786b = ow0Var;
        this.f33787c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f33788f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f33785a) {
            case 0:
                ow0 ow0Var = this.f33786b;
                ow0Var.getClass();
                boolean z10 = this.f33787c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (!z10) {
                    o2Var.getSendMessagesHelper().sendVote(ow0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f33788f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(ow0Var.H, arrayList, null);
                }
                ow0Var.c(true);
                return;
            default:
                ow0 ow0Var2 = this.f33786b;
                ow0Var2.getClass();
                boolean z11 = this.f33787c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f33788f;
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList3, null);
                }
                ow0Var2.c(true);
                return;
        }
    }

    public fw0(ow0 ow0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f33786b = ow0Var;
        this.f33787c = z10;
        this.e = o2Var;
        this.f33788f = arrayList;
        this.d = pollAnswer;
    }
}
