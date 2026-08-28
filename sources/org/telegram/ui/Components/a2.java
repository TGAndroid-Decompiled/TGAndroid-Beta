package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class a2 implements Runnable {
    public final int f26630a;
    public final org.telegram.ui.ActionBar.c2 f26631b;

    public a2(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f26630a = i9;
        this.f26631b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f26630a) {
            case 0:
                try {
                    this.f26631b.dismiss();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                this.f26631b.dismiss();
                return;
        }
    }
}
