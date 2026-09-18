package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22780a;
    public final org.telegram.ui.ActionBar.b2 f22781b;

    public b2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22780a = i10;
        this.f22781b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22780a) {
            case 0:
                try {
                    this.f22781b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22781b.dismiss();
                return;
        }
    }
}
