package org.telegram.ui.Components;

import android.view.View;
public final class lu implements Runnable {
    public final int f28307a;
    public final View f28308b;

    public lu(int i10, View view) {
        this.f28307a = i10;
        this.f28308b = view;
    }

    @Override
    public final void run() {
        switch (this.f28307a) {
            case 0:
                this.f28308b.callOnClick();
                return;
            default:
                this.f28308b.invalidate();
                return;
        }
    }
}
