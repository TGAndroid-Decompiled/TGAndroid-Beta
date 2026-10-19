package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39594a;
    public final boolean f39595b;
    public final int f39596c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f39597f;
    public final float h;
    public final ah.i1 f39598n;
    public final MessageObject f39599r;
    public final qn f39600s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39600s = qnVar;
        this.f39594a = z10;
        this.f39595b = z11;
        this.f39596c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f39597f = f7;
        this.h = f10;
        this.f39598n = i1Var;
        this.f39599r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39594a) {
            qn qnVar = this.f39600s;
            if (qnVar.f40653cc != null) {
                qnVar.f40653cc = null;
                if (this.f39595b) {
                    qnVar.k8(new mi(this, this.f39596c, this.d, this.e, this.f39597f, this.h, this.f39598n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.f39599r));
                }
                qnVar.D7(true);
            }
        }
    }
}
