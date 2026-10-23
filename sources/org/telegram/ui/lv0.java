package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lv0 implements Runnable {
    public final int f39332a = 1;
    public final uv0 f39333b;
    public final boolean f39334c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f39335f;

    public lv0(uv0 uv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.f39333b = uv0Var;
        this.f39334c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f39335f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f39332a) {
            case 0:
                uv0 uv0Var = this.f39333b;
                uv0Var.getClass();
                boolean z10 = this.f39334c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (!z10) {
                    o2Var.getSendMessagesHelper().sendVote(uv0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f39335f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(uv0Var.H, arrayList, null);
                }
                uv0Var.c(true);
                return;
            default:
                uv0 uv0Var2 = this.f39333b;
                uv0Var2.getClass();
                boolean z11 = this.f39334c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(uv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f39335f;
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(uv0Var2.H, arrayList3, null);
                }
                uv0Var2.c(true);
                return;
        }
    }

    public lv0(uv0 uv0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f39333b = uv0Var;
        this.f39334c = z10;
        this.e = o2Var;
        this.f39335f = arrayList;
        this.d = pollAnswer;
    }
}
