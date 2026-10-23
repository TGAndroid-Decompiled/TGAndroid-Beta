package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39602a;
    public final boolean f39603b;
    public final int f39604c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39605f;
    public final float h;
    public final ah.i1 f39606n;
    public final MessageObject f39607r;
    public final qn f39608s;

    public ni(qn qnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39608s = qnVar;
        this.f39602a = z10;
        this.f39603b = z11;
        this.f39604c = i10;
        this.d = z12;
        this.e = dl0Var;
        this.f39605f = f7;
        this.h = f10;
        this.f39606n = i1Var;
        this.f39607r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39602a) {
            qn qnVar = this.f39608s;
            if (qnVar.f40655cc != null) {
                qnVar.f40655cc = null;
                if (this.f39603b) {
                    qnVar.k8(new mi(this, this.f39604c, this.d, this.e, this.f39605f, this.h, this.f39606n, 0));
                } else {
                    qnVar.k8(new eh(7, this, this.f39607r));
                }
                qnVar.D7(true);
            }
        }
    }
}
