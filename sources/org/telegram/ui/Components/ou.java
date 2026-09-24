package org.telegram.ui.Components;

import android.view.View;
public final class ou implements Runnable {
    public final int f27188a;
    public final View f27189b;

    public ou(int i10, View view) {
        this.f27188a = i10;
        this.f27189b = view;
    }

    @Override
    public final void run() {
        switch (this.f27188a) {
            case 0:
                this.f27189b.callOnClick();
                return;
            default:
                this.f27189b.invalidate();
                return;
        }
    }
}
