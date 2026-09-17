package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22536a;
    public final org.telegram.ui.ActionBar.c2 f22537b;

    public b2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f22536a = i10;
        this.f22537b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f22536a) {
            case 0:
                try {
                    this.f22537b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22537b.dismiss();
                return;
        }
    }
}
