package org.telegram.ui.Components;

import android.view.View;

public final class xt implements Runnable {

    public final int f34698a;

    public final View f34699b;

    public xt(int i10, View view) {
        this.f34698a = i10;
        this.f34699b = view;
    }

    @Override
    public final void run() {
        switch (this.f34698a) {
            case 0:
                this.f34699b.callOnClick();
                break;
            default:
                this.f34699b.invalidate();
                break;
        }
    }
}
