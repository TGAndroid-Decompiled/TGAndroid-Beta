package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22539a;
    public final org.telegram.ui.ActionBar.c2 f22540b;

    public b2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f22539a = i10;
        this.f22540b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f22539a) {
            case 0:
                try {
                    this.f22540b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22540b.dismiss();
                return;
        }
    }
}
