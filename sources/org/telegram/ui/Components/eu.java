package org.telegram.ui.Components;

import android.view.View;
public final class eu implements Runnable {
    public final int f28179a;
    public final View f28180b;

    public eu(int i10, View view) {
        this.f28179a = i10;
        this.f28180b = view;
    }

    @Override
    public final void run() {
        switch (this.f28179a) {
            case 0:
                this.f28180b.callOnClick();
                return;
            default:
                this.f28180b.invalidate();
                return;
        }
    }
}
