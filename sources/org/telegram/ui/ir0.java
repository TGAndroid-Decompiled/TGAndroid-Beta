package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ir0 implements Runnable {
    public final int f46375a = 1;
    public final pr0 f46376b;
    public final boolean f46377c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.d2 f46378e;
    public final ArrayList f46379f;

    public ir0(pr0 pr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList) {
        this.f46376b = pr0Var;
        this.f46377c = z10;
        this.d = pollAnswer;
        this.f46378e = d2Var;
        this.f46379f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f46375a) {
            case 0:
                pr0 pr0Var = this.f46376b;
                pr0Var.getClass();
                boolean z10 = this.f46377c;
                org.telegram.ui.ActionBar.d2 d2Var = this.f46378e;
                if (!z10) {
                    d2Var.getSendMessagesHelper().w0(pr0Var.I, null, null);
                } else {
                    ArrayList arrayList = this.f46379f;
                    arrayList.remove(this.d);
                    d2Var.getSendMessagesHelper().w0(pr0Var.I, arrayList, null);
                }
                pr0Var.c(true);
                return;
            default:
                pr0 pr0Var2 = this.f46376b;
                pr0Var2.getClass();
                boolean z11 = this.f46377c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f46378e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    d2Var2.getSendMessagesHelper().w0(pr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f46379f;
                    arrayList3.add(pollAnswer);
                    d2Var2.getSendMessagesHelper().w0(pr0Var2.I, arrayList3, null);
                }
                pr0Var2.c(true);
                return;
        }
    }

    public ir0(pr0 pr0Var, boolean z10, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f46376b = pr0Var;
        this.f46377c = z10;
        this.f46378e = d2Var;
        this.f46379f = arrayList;
        this.d = pollAnswer;
    }
}
