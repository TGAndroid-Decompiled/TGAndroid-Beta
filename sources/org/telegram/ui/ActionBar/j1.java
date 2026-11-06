package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f27605a;
    public final View f27606b;

    public j1(int i7, View view) {
        this.f27605a = i7;
        this.f27606b = view;
    }

    @Override
    public final void run() {
        switch (this.f27605a) {
            case 0:
                View view = this.f27606b;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f28277a) {
                        l5Var.f28277a = true;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27606b.performClick();
                return;
        }
    }
}
