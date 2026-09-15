package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22566a;
    public final org.telegram.ui.ActionBar.b2 f22567b;

    public b2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22566a = i10;
        this.f22567b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22566a) {
            case 0:
                try {
                    this.f22567b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22567b.dismiss();
                return;
        }
    }
}
