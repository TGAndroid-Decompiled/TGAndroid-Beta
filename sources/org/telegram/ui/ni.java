package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ni implements Runnable {
    public final boolean f40813a;
    public final boolean f40814b;
    public final int f40815c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f40816e;
    public final float f40817f;
    public final float h;
    public final kg.q0 f40818n;
    public final MessageObject f40819r;
    public final tn f40820s;

    public ni(tn tnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f9, float f10, kg.q0 q0Var, MessageObject messageObject) {
        this.f40820s = tnVar;
        this.f40813a = z10;
        this.f40814b = z11;
        this.f40815c = i10;
        this.d = z12;
        this.f40816e = fk0Var;
        this.f40817f = f9;
        this.h = f10;
        this.f40818n = q0Var;
        this.f40819r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f40813a) {
            tn tnVar = this.f40820s;
            if (tnVar.Yb != null) {
                tnVar.Yb = null;
                if (this.f40814b) {
                    tnVar.h8(new mi(this, this.f40815c, this.d, this.f40816e, this.f40817f, this.h, this.f40818n, 0));
                } else {
                    tnVar.h8(new vf(13, this, this.f40819r));
                }
                tnVar.A7(true);
            }
        }
    }
}
