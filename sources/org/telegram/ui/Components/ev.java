package org.telegram.ui.Components;

import android.view.View;
public final class ev implements Runnable {
    public final int f26142a;
    public final View f26143b;

    public ev(int i10, View view) {
        this.f26142a = i10;
        this.f26143b = view;
    }

    @Override
    public final void run() {
        switch (this.f26142a) {
            case 0:
                this.f26143b.callOnClick();
                return;
            default:
                this.f26143b.invalidate();
                return;
        }
    }
}
