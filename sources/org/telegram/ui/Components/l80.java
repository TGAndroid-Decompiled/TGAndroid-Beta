package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l80 implements Runnable {
    public final int f26613a;
    public final m80 f26614b;
    public final boolean f26615c;
    public final boolean d;

    public l80(m80 m80Var, boolean z4, boolean z10, int i10) {
        this.f26613a = i10;
        this.f26614b = m80Var;
        this.f26615c = z4;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26613a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.f26614b, this.f26615c, this.d, 1));
                return;
            default:
                m80 m80Var = this.f26614b;
                m80Var.setJoinRequest(this.f26615c);
                m80Var.setJoinToSend(this.d);
                return;
        }
    }
}
