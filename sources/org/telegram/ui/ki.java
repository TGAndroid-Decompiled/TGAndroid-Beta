package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ki implements Runnable {
    public final boolean f39845a;
    public final boolean f39846b;
    public final int f39847c;
    public final boolean d;
    public final org.telegram.ui.Components.uj0 f39848e;
    public final float f39849f;
    public final float h;
    public final hg.r0 f39850n;
    public final MessageObject f39851r;
    public final qn f39852s;

    public ki(qn qnVar, boolean z10, boolean z11, int i9, boolean z12, org.telegram.ui.Components.uj0 uj0Var, float f10, float f11, hg.r0 r0Var, MessageObject messageObject) {
        this.f39852s = qnVar;
        this.f39845a = z10;
        this.f39846b = z11;
        this.f39847c = i9;
        this.d = z12;
        this.f39848e = uj0Var;
        this.f39849f = f10;
        this.h = f11;
        this.f39850n = r0Var;
        this.f39851r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39845a) {
            qn qnVar = this.f39852s;
            if (qnVar.Yb != null) {
                qnVar.Yb = null;
                if (this.f39846b) {
                    qnVar.h8(new ji(this, this.f39847c, this.d, this.f39848e, this.f39849f, this.h, this.f39850n, 0));
                } else {
                    qnVar.h8(new rd(16, this, this.f39851r));
                }
                qnVar.A7(true);
            }
        }
    }
}
