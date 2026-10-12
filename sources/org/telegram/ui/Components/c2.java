package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f24793a;
    public final org.telegram.ui.ActionBar.a2 f24794b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f24793a = i10;
        this.f24794b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f24793a) {
            case 0:
                try {
                    this.f24794b.dismiss();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                this.f24794b.dismiss();
                return;
        }
    }
}
