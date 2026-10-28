package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f38131a = 0;
    public final a3 f38132b;
    public final View f38133c;

    public c0(View view, a3 a3Var) {
        this.f38133c = view;
        this.f38132b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f38131a) {
            case 0:
                a3 a3Var = this.f38132b;
                View view = this.f38133c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f38132b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f38133c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f38132b = a3Var;
        this.f38133c = view;
    }
}
