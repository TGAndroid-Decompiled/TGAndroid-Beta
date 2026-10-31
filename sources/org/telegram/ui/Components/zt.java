package org.telegram.ui.Components;

import android.view.View;
public final class zt implements Runnable {
    public final int f33163a;
    public final View f33164b;

    public zt(int i10, View view) {
        this.f33163a = i10;
        this.f33164b = view;
    }

    @Override
    public final void run() {
        switch (this.f33163a) {
            case 0:
                this.f33164b.callOnClick();
                return;
            default:
                this.f33164b.invalidate();
                return;
        }
    }
}
