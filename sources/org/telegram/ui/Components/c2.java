package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25160a;
    public final org.telegram.ui.ActionBar.b2 f25161b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25160a = i10;
        this.f25161b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25160a) {
            case 0:
                try {
                    this.f25161b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25161b.dismiss();
                return;
        }
    }
}
