package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26543a;
    public final View f26544b;

    public nu(int i10, View view) {
        this.f26543a = i10;
        this.f26544b = view;
    }

    @Override
    public final void run() {
        switch (this.f26543a) {
            case 0:
                this.f26544b.callOnClick();
                return;
            default:
                this.f26544b.invalidate();
                return;
        }
    }
}
