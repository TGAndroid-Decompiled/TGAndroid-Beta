package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25166a;
    public final org.telegram.ui.ActionBar.b2 f25167b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25166a = i10;
        this.f25167b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25166a) {
            case 0:
                try {
                    this.f25167b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25167b.dismiss();
                return;
        }
    }
}
