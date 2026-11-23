package org.telegram.ui.Components;

import android.view.View;
public final class bu implements Runnable {
    public final int f33888a;
    public final View f33889b;

    public bu(int i7, View view) {
        this.f33888a = i7;
        this.f33889b = view;
    }

    @Override
    public final void run() {
        switch (this.f33888a) {
            case 0:
                this.f33889b.callOnClick();
                return;
            default:
                this.f33889b.invalidate();
                return;
        }
    }
}
