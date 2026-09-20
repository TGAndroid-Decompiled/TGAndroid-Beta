package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26738a;
    public final View f26739b;

    public nu(int i10, View view) {
        this.f26738a = i10;
        this.f26739b = view;
    }

    @Override
    public final void run() {
        switch (this.f26738a) {
            case 0:
                this.f26739b.callOnClick();
                return;
            default:
                this.f26739b.invalidate();
                return;
        }
    }
}
