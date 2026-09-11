package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f24866a;
    public final org.telegram.ui.ActionBar.b2 f24867b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f24866a = i10;
        this.f24867b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f24866a) {
            case 0:
                try {
                    this.f24867b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f24867b.dismiss();
                return;
        }
    }
}
