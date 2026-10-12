package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f24788a;
    public final org.telegram.ui.ActionBar.a2 f24789b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f24788a = i10;
        this.f24789b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f24788a) {
            case 0:
                try {
                    this.f24789b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f24789b.dismiss();
                return;
        }
    }
}
