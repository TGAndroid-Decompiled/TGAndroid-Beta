package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25059a;
    public final org.telegram.ui.ActionBar.b2 f25060b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25059a = i10;
        this.f25060b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25059a) {
            case 0:
                try {
                    this.f25060b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f25060b.dismiss();
                return;
        }
    }
}
