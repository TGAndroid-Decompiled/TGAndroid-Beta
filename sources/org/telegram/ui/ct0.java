package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ct0 implements Runnable {
    public final int f36402a = 1;
    public final jt0 f36403b;
    public final boolean f36404c;
    public final TLRPC.PollAnswer d;
    public final org.telegram.ui.ActionBar.k2 e;
    public final ArrayList f36405f;

    public ct0(jt0 jt0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList) {
        this.f36403b = jt0Var;
        this.f36404c = z10;
        this.d = pollAnswer;
        this.e = k2Var;
        this.f36405f = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f36402a) {
            case 0:
                jt0 jt0Var = this.f36403b;
                jt0Var.getClass();
                boolean z10 = this.f36404c;
                org.telegram.ui.ActionBar.k2 k2Var = this.e;
                if (!z10) {
                    k2Var.getSendMessagesHelper().w0(jt0Var.H, null, null);
                } else {
                    ArrayList arrayList = this.f36405f;
                    arrayList.remove(this.d);
                    k2Var.getSendMessagesHelper().w0(jt0Var.H, arrayList, null);
                }
                jt0Var.c(true);
                return;
            default:
                jt0 jt0Var2 = this.f36403b;
                jt0Var2.getClass();
                boolean z11 = this.f36404c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = this.e;
                if (!z11) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(jt0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = this.f36405f;
                    arrayList3.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(jt0Var2.H, arrayList3, null);
                }
                jt0Var2.c(true);
                return;
        }
    }

    public ct0(jt0 jt0Var, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.f36403b = jt0Var;
        this.f36404c = z10;
        this.e = k2Var;
        this.f36405f = arrayList;
        this.d = pollAnswer;
    }
}
