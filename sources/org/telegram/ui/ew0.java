package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ew0 implements Runnable {
    public final int f32636a = 1;
    public final ow0 f32637b;
    public final boolean f32638c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final ArrayList f32639f;

    public ew0(ow0 ow0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.f32637b = ow0Var;
        this.f32638c = z10;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f32639f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f32636a) {
            case 0:
                ow0 ow0Var = this.f32637b;
                ow0Var.getClass();
                boolean z10 = this.f32638c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (!z10) {
                    p2Var.getSendMessagesHelper().sendVote(ow0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f32639f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(ow0Var.H, arrayList, null);
                }
                ow0Var.c(true);
                return;
            default:
                ow0 ow0Var2 = this.f32637b;
                ow0Var2.getClass();
                boolean z11 = this.f32638c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f32639f;
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList3, null);
                }
                ow0Var2.c(true);
                return;
        }
    }

    public ew0(ow0 ow0Var, boolean z10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f32637b = ow0Var;
        this.f32638c = z10;
        this.e = p2Var;
        this.f32639f = arrayList;
        this.d = pollAnswer;
    }
}
