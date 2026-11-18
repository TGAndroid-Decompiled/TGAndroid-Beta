package org.telegram.ui.ActionBar;

import android.view.View;
public final class k1 implements Runnable {
    public final int f29119a;
    public final View f29120b;

    public k1(int i7, View view) {
        this.f29119a = i7;
        this.f29120b = view;
    }

    @Override
    public final void run() {
        switch (this.f29119a) {
            case 0:
                View view = this.f29120b;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.f29829a) {
                        o5Var.f29829a = true;
                        o5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29120b.performClick();
                return;
        }
    }
}
