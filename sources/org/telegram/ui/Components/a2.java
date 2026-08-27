package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

public final class a2 implements Runnable {

    public final int f26598a;

    public final org.telegram.ui.ActionBar.b2 f26599b;

    public a2(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f26598a = i10;
        this.f26599b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f26598a) {
            case 0:
                try {
                    this.f26599b.dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                this.f26599b.dismiss();
                break;
        }
    }
}
