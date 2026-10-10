package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25133a;
    public final org.telegram.ui.ActionBar.b2 f25134b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25133a = i10;
        this.f25134b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25133a) {
            case 0:
                try {
                    this.f25134b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25134b.dismiss();
                return;
        }
    }
}
