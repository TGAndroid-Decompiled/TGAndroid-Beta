package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f27606a;
    public final View f27607b;

    public j1(int i7, View view) {
        this.f27606a = i7;
        this.f27607b = view;
    }

    @Override
    public final void run() {
        switch (this.f27606a) {
            case 0:
                View view = this.f27607b;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f28278a) {
                        l5Var.f28278a = true;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27607b.performClick();
                return;
        }
    }
}
