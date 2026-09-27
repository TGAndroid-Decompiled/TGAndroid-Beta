package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pf0 implements Runnable {
    public final int f36468a;
    public final wf0 f36469b;
    public final int f36470c;

    public pf0(wf0 wf0Var, int i10, int i11) {
        this.f36468a = i11;
        this.f36469b = wf0Var;
        this.f36470c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36468a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.f36469b, this.f36470c, 1));
                return;
            case 1:
                this.f36469b.A(this.f36470c);
                return;
            default:
                this.f36469b.f39266f.f32431f[this.f36470c].l(1.0f);
                return;
        }
    }
}
