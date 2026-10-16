package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iw0 implements Runnable {
    public final int f36881a = 1;
    public final rw0 f36882b;
    public final boolean f36883c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final ArrayList f36884f;

    public iw0(rw0 rw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.f36882b = rw0Var;
        this.f36883c = z10;
        this.d = pollAnswer;
        this.e = m2Var;
        this.f36884f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36881a) {
            case 0:
                rw0 rw0Var = this.f36882b;
                rw0Var.getClass();
                boolean z10 = this.f36883c;
                org.telegram.ui.ActionBar.m2 m2Var = this.e;
                if (!z10) {
                    m2Var.getSendMessagesHelper().sendVote(rw0Var.H, null, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f36884f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(rw0Var.H, arrayList, null);
                }
                rw0Var.c(true);
                return;
            default:
                rw0 rw0Var2 = this.f36882b;
                rw0Var2.getClass();
                boolean z11 = this.f36883c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.e;
                if (!z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = new ArrayList<>(1);
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(rw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = this.f36884f;
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(rw0Var2.H, arrayList3, null);
                }
                rw0Var2.c(true);
                return;
        }
    }

    public iw0(rw0 rw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36882b = rw0Var;
        this.f36883c = z10;
        this.e = m2Var;
        this.f36884f = arrayList;
        this.d = pollAnswer;
    }
}
