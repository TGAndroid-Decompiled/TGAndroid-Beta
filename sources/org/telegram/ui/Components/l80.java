package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l80 implements Runnable {
    public final int f26589a;
    public final m80 f26590b;
    public final boolean f26591c;
    public final boolean d;

    public l80(m80 m80Var, boolean z4, boolean z10, int i10) {
        this.f26589a = i10;
        this.f26590b = m80Var;
        this.f26591c = z4;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26589a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.f26590b, this.f26591c, this.d, 1));
                return;
            default:
                m80 m80Var = this.f26590b;
                m80Var.setJoinRequest(this.f26591c);
                m80Var.setJoinToSend(this.d);
                return;
        }
    }
}
