package org.telegram.ui.Components;

import android.view.View;
public final class bu implements Runnable {
    public final int f33927a;
    public final View f33928b;

    public bu(int i7, View view) {
        this.f33927a = i7;
        this.f33928b = view;
    }

    @Override
    public final void run() {
        switch (this.f33927a) {
            case 0:
                this.f33928b.callOnClick();
                return;
            default:
                this.f33928b.invalidate();
                return;
        }
    }
}
