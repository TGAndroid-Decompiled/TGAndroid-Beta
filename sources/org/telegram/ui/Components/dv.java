package org.telegram.ui.Components;

import android.view.View;
public final class dv implements Runnable {
    public final int f25818a;
    public final View f25819b;

    public dv(int i10, View view) {
        this.f25818a = i10;
        this.f25819b = view;
    }

    @Override
    public final void run() {
        switch (this.f25818a) {
            case 0:
                this.f25819b.callOnClick();
                return;
            default:
                this.f25819b.invalidate();
                return;
        }
    }
}
