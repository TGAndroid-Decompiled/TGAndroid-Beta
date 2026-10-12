package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class aj implements Runnable {
    public final boolean f35849a;
    public final boolean f35850b;
    public final int f35851c;
    public final boolean d;
    public final org.telegram.ui.Components.nl0 f35852e;
    public final float f35853f;
    public final float h;
    public final zg.n0 f35854n;
    public final MessageObject f35855r;
    public final eo f35856s;

    public aj(eo eoVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.nl0 nl0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f35856s = eoVar;
        this.f35849a = z10;
        this.f35850b = z11;
        this.f35851c = i10;
        this.d = z12;
        this.f35852e = nl0Var;
        this.f35853f = f7;
        this.h = f10;
        this.f35854n = n0Var;
        this.f35855r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f35849a) {
            eo eoVar = this.f35856s;
            if (eoVar.f37227cc != null) {
                eoVar.f37227cc = null;
                if (this.f35850b) {
                    eoVar.k8(new zi(this, this.f35851c, this.d, this.f35852e, this.f35853f, this.h, this.f35854n, 0));
                } else {
                    eoVar.k8(new nh(9, this, this.f35855r));
                }
                eoVar.D7(true);
            }
        }
    }
}
