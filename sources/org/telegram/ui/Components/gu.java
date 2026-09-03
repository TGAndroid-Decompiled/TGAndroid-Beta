package org.telegram.ui.Components;

import android.view.View;
public final class gu implements Runnable {
    public final int f25237a;
    public final View f25238b;

    public gu(int i10, View view) {
        this.f25237a = i10;
        this.f25238b = view;
    }

    @Override
    public final void run() {
        switch (this.f25237a) {
            case 0:
                this.f25238b.callOnClick();
                return;
            default:
                this.f25238b.invalidate();
                return;
        }
    }
}
