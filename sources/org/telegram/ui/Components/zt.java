package org.telegram.ui.Components;

import android.view.View;
public final class zt implements Runnable {
    public final int f33220a;
    public final View f33221b;

    public zt(int i10, View view) {
        this.f33220a = i10;
        this.f33221b = view;
    }

    @Override
    public final void run() {
        switch (this.f33220a) {
            case 0:
                this.f33221b.callOnClick();
                return;
            default:
                this.f33221b.invalidate();
                return;
        }
    }
}
