package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class e2 implements Runnable {
    public final int f27657a;
    public final org.telegram.ui.ActionBar.e2 f27658b;

    public e2(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f27657a = i10;
        this.f27658b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f27657a) {
            case 0:
                try {
                    this.f27658b.dismiss();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                this.f27658b.dismiss();
                return;
        }
    }
}
