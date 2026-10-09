package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f25208a;
    public final org.telegram.ui.ActionBar.b2 f25209b;

    public c2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f25208a = i10;
        this.f25209b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f25208a) {
            case 0:
                try {
                    this.f25209b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f25209b.dismiss();
                return;
        }
    }
}
