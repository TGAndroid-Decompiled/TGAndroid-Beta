package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f29045a;
    public final View f29046b;

    public j1(int i7, View view) {
        this.f29045a = i7;
        this.f29046b = view;
    }

    @Override
    public final void run() {
        switch (this.f29045a) {
            case 0:
                View view = this.f29046b;
                if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    if (!n5Var.f29813a) {
                        n5Var.f29813a = true;
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29046b.performClick();
                return;
        }
    }
}
