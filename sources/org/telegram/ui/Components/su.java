package org.telegram.ui.Components;

import android.view.View;
public final class su implements Runnable {
    public final int f30625a;
    public final View f30626b;

    public su(int i10, View view) {
        this.f30625a = i10;
        this.f30626b = view;
    }

    @Override
    public final void run() {
        switch (this.f30625a) {
            case 0:
                this.f30626b.callOnClick();
                return;
            default:
                this.f30626b.invalidate();
                return;
        }
    }
}
