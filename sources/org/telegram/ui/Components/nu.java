package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26888a;
    public final View f26889b;

    public nu(int i10, View view) {
        this.f26888a = i10;
        this.f26889b = view;
    }

    @Override
    public final void run() {
        switch (this.f26888a) {
            case 0:
                this.f26889b.callOnClick();
                return;
            default:
                this.f26889b.invalidate();
                return;
        }
    }
}
