package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f22883a;
    public final org.telegram.ui.ActionBar.b2 f22884b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22883a = i10;
        this.f22884b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22883a) {
            case 0:
                try {
                    this.f22884b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22884b.dismiss();
                return;
        }
    }
}
