package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class a2 implements Runnable {
    public final int f24607a;
    public final org.telegram.ui.ActionBar.c2 f24608b;

    public a2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f24607a = i10;
        this.f24608b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f24607a) {
            case 0:
                try {
                    this.f24608b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f24608b.dismiss();
                return;
        }
    }
}
