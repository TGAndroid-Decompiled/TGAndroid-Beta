package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39592a;
    public final boolean f39593b;
    public final int f39594c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f39595f;
    public final float h;
    public final ah.i1 f39596n;
    public final MessageObject f39597r;
    public final qn f39598s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39598s = qnVar;
        this.f39592a = z10;
        this.f39593b = z11;
        this.f39594c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f39595f = f7;
        this.h = f10;
        this.f39596n = i1Var;
        this.f39597r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39592a) {
            qn qnVar = this.f39598s;
            if (qnVar.f40645cc != null) {
                qnVar.f40645cc = null;
                if (this.f39593b) {
                    qnVar.k8(new mi(this, this.f39594c, this.d, this.e, this.f39595f, this.h, this.f39596n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.f39597r));
                }
                qnVar.D7(true);
            }
        }
    }
}
