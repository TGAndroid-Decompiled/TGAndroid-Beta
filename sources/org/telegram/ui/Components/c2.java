package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23617a;
    public final org.telegram.ui.ActionBar.a2 f23618b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f23617a = i10;
        this.f23618b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f23617a) {
            case 0:
                try {
                    this.f23618b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23618b.dismiss();
                return;
        }
    }
}
