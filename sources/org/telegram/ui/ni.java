package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39601a;
    public final boolean f39602b;
    public final int f39603c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39604f;
    public final float h;
    public final ah.i1 f39605n;
    public final MessageObject f39606r;
    public final qn f39607s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39607s = qnVar;
        this.f39601a = z10;
        this.f39602b = z11;
        this.f39603c = i10;
        this.d = z12;
        this.e = dl0Var;
        this.f39604f = f7;
        this.h = f10;
        this.f39605n = i1Var;
        this.f39606r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39601a) {
            qn qnVar = this.f39607s;
            if (qnVar.f40654cc != null) {
                qnVar.f40654cc = null;
                if (this.f39602b) {
                    qnVar.k8(new mi(this, this.f39603c, this.d, this.e, this.f39604f, this.h, this.f39605n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.f39606r));
                }
                qnVar.D7(true);
            }
        }
    }
}
