package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class b2 implements Runnable {
    public final int f22849a;
    public final org.telegram.ui.ActionBar.b2 f22850b;

    public b2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22849a = i10;
        this.f22850b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22849a) {
            case 0:
                try {
                    this.f22850b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f22850b.dismiss();
                return;
        }
    }
}
