package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f27609a;
    public final View f27610b;

    public j1(int i7, View view) {
        this.f27609a = i7;
        this.f27610b = view;
    }

    @Override
    public final void run() {
        switch (this.f27609a) {
            case 0:
                View view = this.f27610b;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f28281a) {
                        l5Var.f28281a = true;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27610b.performClick();
                return;
        }
    }
}
