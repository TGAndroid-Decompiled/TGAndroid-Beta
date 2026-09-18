package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f32474a = 0;
    public final a3 f32475b;
    public final View f32476c;

    public c0(View view, a3 a3Var) {
        this.f32476c = view;
        this.f32475b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f32474a) {
            case 0:
                a3 a3Var = this.f32475b;
                View view = this.f32476c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f32475b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f32476c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f32475b = a3Var;
        this.f32476c = view;
    }
}
