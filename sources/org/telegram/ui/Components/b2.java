package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f24932a;
    public final org.telegram.ui.ActionBar.c2 f24933b;

    public b2(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f24932a = i10;
        this.f24933b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f24932a) {
            case 0:
                try {
                    this.f24933b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f24933b.dismiss();
                return;
        }
    }
}
