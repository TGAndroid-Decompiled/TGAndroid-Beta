package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f39877a;
    public final boolean f39878b;
    public final int f39879c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f39880f;
    public final float h;
    public final ah.i1 f39881n;
    public final MessageObject f39882r;
    public final sn f39883s;

    public ni(sn snVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f39883s = snVar;
        this.f39877a = z10;
        this.f39878b = z11;
        this.f39879c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f39880f = f7;
        this.h = f10;
        this.f39881n = i1Var;
        this.f39882r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39877a) {
            sn snVar = this.f39883s;
            if (snVar.f41644pc != null) {
                snVar.f41644pc = null;
                if (this.f39878b) {
                    snVar.k8(new mi(this, this.f39879c, this.d, this.e, this.f39880f, this.h, this.f39881n, 0));
                } else {
                    snVar.k8(new eh(7, this, this.f39882r));
                }
                snVar.D7(true);
            }
        }
    }
}
