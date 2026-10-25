package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pv0 implements Runnable {
    public final int f42664a = 1;
    public final xv0 f42665b;
    public final boolean f42666c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.r2 e;
    public final ArrayList f42667f;

    public pv0(xv0 xv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList) {
        this.f42665b = xv0Var;
        this.f42666c = z10;
        this.d = pollAnswer;
        this.e = r2Var;
        this.f42667f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f42664a) {
            case 0:
                xv0 xv0Var = this.f42665b;
                xv0Var.getClass();
                boolean z10 = this.f42666c;
                org.telegram.ui.ActionBar.r2 r2Var = this.e;
                if (!z10) {
                    r2Var.getSendMessagesHelper().sendVote(xv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f42667f;
                    arrayList.remove(this.d);
                    r2Var.getSendMessagesHelper().sendVote(xv0Var.H, arrayList, null);
                }
                xv0Var.c(true);
                return;
            default:
                xv0 xv0Var2 = this.f42665b;
                xv0Var2.getClass();
                boolean z11 = this.f42666c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(xv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f42667f;
                    arrayList3.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(xv0Var2.H, arrayList3, null);
                }
                xv0Var2.c(true);
                return;
        }
    }

    public pv0(xv0 xv0Var, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f42665b = xv0Var;
        this.f42666c = z10;
        this.e = r2Var;
        this.f42667f = arrayList;
        this.d = pollAnswer;
    }
}
