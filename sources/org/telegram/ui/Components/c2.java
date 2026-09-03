package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23795a;
    public final org.telegram.ui.ActionBar.d2 f23796b;

    public c2(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f23795a = i10;
        this.f23796b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f23795a) {
            case 0:
                try {
                    this.f23796b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23796b.dismiss();
                return;
        }
    }
}
