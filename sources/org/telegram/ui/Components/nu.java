package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26573a;
    public final View f26574b;

    public nu(int i10, View view) {
        this.f26573a = i10;
        this.f26574b = view;
    }

    @Override
    public final void run() {
        switch (this.f26573a) {
            case 0:
                this.f26574b.callOnClick();
                return;
            default:
                this.f26574b.invalidate();
                return;
        }
    }
}
