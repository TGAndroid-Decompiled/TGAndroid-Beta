package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39873a;
    public final boolean f39874b;
    public final int f39875c;
    public final boolean d;
    public final org.telegram.ui.Components.fl0 e;
    public final float f39876f;
    public final float h;
    public final ah.i1 f39877n;
    public final MessageObject f39878r;
    public final sn f39879s;

    public ni(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39879s = snVar;
        this.f39873a = z10;
        this.f39874b = z11;
        this.f39875c = i10;
        this.d = z12;
        this.e = fl0Var;
        this.f39876f = f7;
        this.h = f10;
        this.f39877n = i1Var;
        this.f39878r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39873a) {
            sn snVar = this.f39879s;
            if (snVar.f41641pc != null) {
                snVar.f41641pc = null;
                if (this.f39874b) {
                    snVar.k8(new mi(this, this.f39875c, this.d, this.e, this.f39876f, this.h, this.f39877n, 0));
                } else {
                    snVar.k8(new eh(7, this, this.f39878r));
                }
                snVar.D7(true);
            }
        }
    }
}
