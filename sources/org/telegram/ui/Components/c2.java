package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23151a;
    public final org.telegram.ui.ActionBar.a2 f23152b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f23151a = i10;
        this.f23152b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f23151a) {
            case 0:
                try {
                    this.f23152b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23152b.dismiss();
                return;
        }
    }
}
