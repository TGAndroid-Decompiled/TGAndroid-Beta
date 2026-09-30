package org.telegram.ui.Components;

import android.view.View;
public final class qu implements Runnable {
    public final int f27725a;
    public final View f27726b;

    public qu(int i10, View view) {
        this.f27725a = i10;
        this.f27726b = view;
    }

    @Override
    public final void run() {
        switch (this.f27725a) {
            case 0:
                this.f27726b.callOnClick();
                return;
            default:
                this.f27726b.invalidate();
                return;
        }
    }
}
