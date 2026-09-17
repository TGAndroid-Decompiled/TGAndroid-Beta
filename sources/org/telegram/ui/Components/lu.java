package org.telegram.ui.Components;

import android.view.View;
public final class lu implements Runnable {
    public final int f28335a;
    public final View f28336b;

    public lu(int i10, View view) {
        this.f28335a = i10;
        this.f28336b = view;
    }

    @Override
    public final void run() {
        switch (this.f28335a) {
            case 0:
                this.f28336b.callOnClick();
                return;
            default:
                this.f28336b.invalidate();
                return;
        }
    }
}
