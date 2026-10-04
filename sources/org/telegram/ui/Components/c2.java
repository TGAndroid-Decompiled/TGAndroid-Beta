package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25161a;
    public final org.telegram.ui.ActionBar.b2 f25162b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25161a = i10;
        this.f25162b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25161a) {
            case 0:
                try {
                    this.f25162b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25162b.dismiss();
                return;
        }
    }
}
