package org.telegram.ui.ActionBar;

import android.view.View;
public final class i1 implements Runnable {
    public final int f27589a;
    public final View f27590b;

    public i1(int i3, View view) {
        this.f27589a = i3;
        this.f27590b = view;
    }

    @Override
    public final void run() {
        switch (this.f27589a) {
            case 0:
                View view = this.f27590b;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.f28311a) {
                        l5Var.f28311a = true;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27590b.performClick();
                return;
        }
    }
}
