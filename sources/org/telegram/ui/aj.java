package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class aj implements Runnable {
    public final boolean f35851a;
    public final boolean f35852b;
    public final int f35853c;
    public final boolean d;
    public final org.telegram.ui.Components.nl0 f35854e;
    public final float f35855f;
    public final float h;
    public final zg.n0 f35856n;
    public final MessageObject f35857r;
    public final eo f35858s;

    public aj(eo eoVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.nl0 nl0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f35858s = eoVar;
        this.f35851a = z10;
        this.f35852b = z11;
        this.f35853c = i10;
        this.d = z12;
        this.f35854e = nl0Var;
        this.f35855f = f7;
        this.h = f10;
        this.f35856n = n0Var;
        this.f35857r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f35851a) {
            eo eoVar = this.f35858s;
            if (eoVar.f37232cc != null) {
                eoVar.f37232cc = null;
                if (this.f35852b) {
                    eoVar.k8(new zi(this, this.f35853c, this.d, this.f35854e, this.f35855f, this.h, this.f35856n, 0));
                } else {
                    eoVar.k8(new nh(9, this, this.f35857r));
                }
                eoVar.D7(true);
            }
        }
    }
}
