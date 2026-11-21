package org.telegram.ui.Components;

import android.view.View;
public final class bu implements Runnable {
    public final int f33934a;
    public final View f33935b;

    public bu(int i7, View view) {
        this.f33934a = i7;
        this.f33935b = view;
    }

    @Override
    public final void run() {
        switch (this.f33934a) {
            case 0:
                this.f33935b.callOnClick();
                return;
            default:
                this.f33935b.invalidate();
                return;
        }
    }
}
