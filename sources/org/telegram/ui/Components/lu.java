package org.telegram.ui.Components;

import android.view.View;
public final class lu implements Runnable {
    public final int f28308a;
    public final View f28309b;

    public lu(int i10, View view) {
        this.f28308a = i10;
        this.f28309b = view;
    }

    @Override
    public final void run() {
        switch (this.f28308a) {
            case 0:
                this.f28309b.callOnClick();
                return;
            default:
                this.f28309b.invalidate();
                return;
        }
    }
}
