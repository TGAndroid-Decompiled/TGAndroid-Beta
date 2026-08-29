package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class e2 implements Runnable {
    public final int f27910a;
    public final org.telegram.ui.ActionBar.c2 f27911b;

    public e2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f27910a = i10;
        this.f27911b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f27910a) {
            case 0:
                try {
                    this.f27911b.dismiss();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                this.f27911b.dismiss();
                return;
        }
    }
}
