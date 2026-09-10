package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class d2 implements Runnable {
    public final int f22273a;
    public final org.telegram.ui.ActionBar.d2 f22274b;

    public d2(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f22273a = i10;
        this.f22274b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f22273a) {
            case 0:
                try {
                    this.f22274b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22274b.dismiss();
                return;
        }
    }
}
