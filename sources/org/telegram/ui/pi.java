package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class pi implements Runnable {
    public final boolean f40115a;
    public final boolean f40116b;
    public final int f40117c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f40118f;
    public final float h;
    public final ah.i1 f40119n;
    public final MessageObject f40120r;
    public final sn f40121s;

    public pi(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f40121s = snVar;
        this.f40115a = z10;
        this.f40116b = z11;
        this.f40117c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f40118f = f7;
        this.h = f10;
        this.f40119n = i1Var;
        this.f40120r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f40115a) {
            sn snVar = this.f40121s;
            if (snVar.f41169cc != null) {
                snVar.f41169cc = null;
                if (this.f40116b) {
                    snVar.k8(new oi(this, this.f40117c, this.d, this.e, this.f40118f, this.h, this.f40119n, 0));
                } else {
                    snVar.k8(new gh(7, this, this.f40120r));
                }
                snVar.D7(true);
            }
        }
    }
}
