package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kv0 implements Runnable {
    public final int f39056a = 1;
    public final tv0 f39057b;
    public final boolean f39058c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f39059f;

    public kv0(tv0 tv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.f39057b = tv0Var;
        this.f39058c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f39059f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f39056a) {
            case 0:
                tv0 tv0Var = this.f39057b;
                tv0Var.getClass();
                boolean z10 = this.f39058c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (!z10) {
                    o2Var.getSendMessagesHelper().sendVote(tv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f39059f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(tv0Var.H, arrayList, null);
                }
                tv0Var.c(true);
                return;
            default:
                tv0 tv0Var2 = this.f39057b;
                tv0Var2.getClass();
                boolean z11 = this.f39058c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(tv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f39059f;
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(tv0Var2.H, arrayList3, null);
                }
                tv0Var2.c(true);
                return;
        }
    }

    public kv0(tv0 tv0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f39057b = tv0Var;
        this.f39058c = z10;
        this.e = o2Var;
        this.f39059f = arrayList;
        this.d = pollAnswer;
    }
}
