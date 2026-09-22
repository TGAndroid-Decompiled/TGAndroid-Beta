package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22804a;
    public final org.telegram.ui.ActionBar.b2 f22805b;

    public b2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22804a = i10;
        this.f22805b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22804a) {
            case 0:
                try {
                    this.f22805b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22805b.dismiss();
                return;
        }
    }
}
