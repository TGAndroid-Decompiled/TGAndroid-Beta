package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class c2 implements Runnable {
    public final int f23124a;
    public final org.telegram.ui.ActionBar.a2 f23125b;

    public c2(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f23124a = i10;
        this.f23125b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f23124a) {
            case 0:
                try {
                    this.f23125b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f23125b.dismiss();
                return;
        }
    }
}
