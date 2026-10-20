package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39598a;
    public final boolean f39599b;
    public final int f39600c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39601f;
    public final float h;
    public final ah.i1 f39602n;
    public final MessageObject f39603r;
    public final qn f39604s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39604s = qnVar;
        this.f39598a = z10;
        this.f39599b = z11;
        this.f39600c = i10;
        this.d = z12;
        this.e = dl0Var;
        this.f39601f = f7;
        this.h = f10;
        this.f39602n = i1Var;
        this.f39603r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39598a) {
            qn qnVar = this.f39604s;
            if (qnVar.f40651cc != null) {
                qnVar.f40651cc = null;
                if (this.f39599b) {
                    qnVar.k8(new mi(this, this.f39600c, this.d, this.e, this.f39601f, this.h, this.f39602n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.f39603r));
                }
                qnVar.D7(true);
            }
        }
    }
}
