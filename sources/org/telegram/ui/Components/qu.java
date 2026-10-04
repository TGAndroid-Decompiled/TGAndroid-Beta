package org.telegram.ui.Components;

import android.view.View;
public final class qu implements Runnable {
    public final int f30177a;
    public final View f30178b;

    public qu(int i10, View view) {
        this.f30177a = i10;
        this.f30178b = view;
    }

    @Override
    public final void run() {
        switch (this.f30177a) {
            case 0:
                this.f30178b.callOnClick();
                return;
            default:
                this.f30178b.invalidate();
                return;
        }
    }
}
