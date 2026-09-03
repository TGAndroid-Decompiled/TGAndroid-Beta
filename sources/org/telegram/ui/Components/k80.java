package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k80 implements Runnable {
    public final int f26204a;
    public final m80 f26205b;
    public final boolean f26206c;

    public k80(m80 m80Var, boolean z4, int i10) {
        this.f26204a = i10;
        this.f26205b = m80Var;
        this.f26206c = z4;
    }

    @Override
    public final void run() {
        switch (this.f26204a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k80(this.f26205b, this.f26206c, 1));
                return;
            default:
                this.f26205b.setJoinRequest(this.f26206c);
                return;
        }
    }
}
