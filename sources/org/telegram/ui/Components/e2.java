package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class e2 implements Runnable {
    public final int f27689a;
    public final org.telegram.ui.ActionBar.e2 f27690b;

    public e2(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f27689a = i10;
        this.f27690b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f27689a) {
            case 0:
                try {
                    this.f27690b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f27690b.dismiss();
                return;
        }
    }
}
