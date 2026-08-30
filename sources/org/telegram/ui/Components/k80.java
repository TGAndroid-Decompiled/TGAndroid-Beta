package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k80 implements Runnable {
    public final int f26202a;
    public final m80 f26203b;
    public final boolean f26204c;

    public k80(m80 m80Var, boolean z4, int i10) {
        this.f26202a = i10;
        this.f26203b = m80Var;
        this.f26204c = z4;
    }

    @Override
    public final void run() {
        switch (this.f26202a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k80(this.f26203b, this.f26204c, 1));
                return;
            default:
                this.f26203b.setJoinRequest(this.f26204c);
                return;
        }
    }
}
