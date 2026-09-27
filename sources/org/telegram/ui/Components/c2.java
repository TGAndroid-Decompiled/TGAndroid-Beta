package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23189a;
    public final org.telegram.ui.ActionBar.c2 f23190b;

    public c2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f23189a = i10;
        this.f23190b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f23189a) {
            case 0:
                try {
                    this.f23190b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23190b.dismiss();
                return;
        }
    }
}
