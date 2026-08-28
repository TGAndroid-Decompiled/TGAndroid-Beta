package org.telegram.ui.Components;

import android.view.View;
public final class yt implements Runnable {
    public final int f35064a;
    public final View f35065b;

    public yt(int i9, View view) {
        this.f35064a = i9;
        this.f35065b = view;
    }

    @Override
    public final void run() {
        switch (this.f35064a) {
            case 0:
                this.f35065b.callOnClick();
                return;
            default:
                this.f35065b.invalidate();
                return;
        }
    }
}
