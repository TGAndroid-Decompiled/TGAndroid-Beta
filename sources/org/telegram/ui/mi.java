package org.telegram.ui;

import org.telegram.messenger.MessageObject;

public final class mi implements Runnable {

    public final boolean f40522a;

    public final boolean f40523b;

    public final int f40524c;
    public final boolean d;

    public final org.telegram.ui.Components.wj0 f40525e;

    public final float f40526f;
    public final float h;

    public final ig.q0 f40527n;

    public final MessageObject f40528r;

    public final rn f40529s;

    public mi(rn rnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.wj0 wj0Var, float f10, float f11, ig.q0 q0Var, MessageObject messageObject) {
        this.f40529s = rnVar;
        this.f40522a = z10;
        this.f40523b = z11;
        this.f40524c = i10;
        this.d = z12;
        this.f40525e = wj0Var;
        this.f40526f = f10;
        this.h = f11;
        this.f40527n = q0Var;
        this.f40528r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f40522a) {
            rn rnVar = this.f40529s;
            if (rnVar.Yb != null) {
                rnVar.Yb = null;
                if (this.f40523b) {
                    rnVar.h8(new li(this, this.f40524c, this.d, this.f40525e, this.f40526f, this.h, this.f40527n, 0));
                } else {
                    rnVar.h8(new rd(16, this, this.f40528r));
                }
                rnVar.A7(true);
            }
        }
    }
}
