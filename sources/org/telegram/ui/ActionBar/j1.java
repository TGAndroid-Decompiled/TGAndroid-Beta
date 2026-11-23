package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f29098a;
    public final View f29099b;

    public j1(int i7, View view) {
        this.f29098a = i7;
        this.f29099b = view;
    }

    @Override
    public final void run() {
        switch (this.f29098a) {
            case 0:
                View view = this.f29099b;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.f29898a) {
                        o5Var.f29898a = true;
                        o5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29099b.performClick();
                return;
        }
    }
}
