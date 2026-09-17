package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26540a;
    public final View f26541b;

    public nu(int i10, View view) {
        this.f26540a = i10;
        this.f26541b = view;
    }

    @Override
    public final void run() {
        switch (this.f26540a) {
            case 0:
                this.f26541b.callOnClick();
                return;
            default:
                this.f26541b.invalidate();
                return;
        }
    }
}
