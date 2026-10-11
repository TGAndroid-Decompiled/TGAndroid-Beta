package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25171a;
    public final org.telegram.ui.ActionBar.a2 f25172b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f25171a = i10;
        this.f25172b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f25171a) {
            case 0:
                try {
                    this.f25172b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25172b.dismiss();
                return;
        }
    }
}
