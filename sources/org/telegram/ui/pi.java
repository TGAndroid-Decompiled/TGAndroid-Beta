package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class pi implements Runnable {
    public final boolean f40156a;
    public final boolean f40157b;
    public final int f40158c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f40159f;
    public final float h;
    public final ah.i1 f40160n;
    public final MessageObject f40161r;
    public final sn f40162s;

    public pi(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f40162s = snVar;
        this.f40156a = z10;
        this.f40157b = z11;
        this.f40158c = i10;
        this.d = z12;
        this.e = cl0Var;
        this.f40159f = f7;
        this.h = f10;
        this.f40160n = i1Var;
        this.f40161r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f40156a) {
            sn snVar = this.f40162s;
            if (snVar.f41204cc != null) {
                snVar.f41204cc = null;
                if (this.f40157b) {
                    snVar.k8(new oi(this, this.f40158c, this.d, this.e, this.f40159f, this.h, this.f40160n, 0));
                } else {
                    snVar.k8(new gh(7, this, this.f40161r));
                }
                snVar.D7(true);
            }
        }
    }
}
