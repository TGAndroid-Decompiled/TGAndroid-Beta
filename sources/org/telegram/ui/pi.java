package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class pi implements Runnable {
    public final boolean f40137a;
    public final boolean f40138b;
    public final int f40139c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f40140f;
    public final float h;
    public final ah.i1 f40141n;
    public final MessageObject f40142r;
    public final sn f40143s;

    public pi(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f40143s = snVar;
        this.f40137a = z10;
        this.f40138b = z11;
        this.f40139c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f40140f = f7;
        this.h = f10;
        this.f40141n = i1Var;
        this.f40142r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f40137a) {
            sn snVar = this.f40143s;
            if (snVar.f41183cc != null) {
                snVar.f41183cc = null;
                if (this.f40138b) {
                    snVar.k8(new oi(this, this.f40139c, this.d, this.e, this.f40140f, this.h, this.f40141n, 0));
                } else {
                    snVar.k8(new gh(7, this, this.f40142r));
                }
                snVar.D7(true);
            }
        }
    }
}
