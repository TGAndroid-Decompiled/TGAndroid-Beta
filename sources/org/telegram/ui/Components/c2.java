package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23172a;
    public final org.telegram.ui.ActionBar.a2 f23173b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f23172a = i10;
        this.f23173b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f23172a) {
            case 0:
                try {
                    this.f23173b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23173b.dismiss();
                return;
        }
    }
}
