package org.telegram.ui.Components;

import android.view.View;
public final class lu implements Runnable {
    public final int f28334a;
    public final View f28335b;

    public lu(int i10, View view) {
        this.f28334a = i10;
        this.f28335b = view;
    }

    @Override
    public final void run() {
        switch (this.f28334a) {
            case 0:
                this.f28335b.callOnClick();
                return;
            default:
                this.f28335b.invalidate();
                return;
        }
    }
}
