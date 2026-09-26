package org.telegram.ui.Components;

import android.view.View;
public final class ou implements Runnable {
    public final int f27192a;
    public final View f27193b;

    public ou(int i10, View view) {
        this.f27192a = i10;
        this.f27193b = view;
    }

    @Override
    public final void run() {
        switch (this.f27192a) {
            case 0:
                this.f27193b.callOnClick();
                return;
            default:
                this.f27193b.invalidate();
                return;
        }
    }
}
