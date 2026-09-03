package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25736a;
    public final org.telegram.ui.ActionBar.d2 f25737b;

    public c2(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f25736a = i10;
        this.f25737b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f25736a) {
            case 0:
                try {
                    this.f25737b.dismiss();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                this.f25737b.dismiss();
                return;
        }
    }
}
