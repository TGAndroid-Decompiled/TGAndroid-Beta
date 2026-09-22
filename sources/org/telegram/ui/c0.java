package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f32596a = 0;
    public final a3 f32597b;
    public final View f32598c;

    public c0(View view, a3 a3Var) {
        this.f32598c = view;
        this.f32597b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f32596a) {
            case 0:
                a3 a3Var = this.f32597b;
                View view = this.f32598c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f32597b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f32598c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f32597b = a3Var;
        this.f32598c = view;
    }
}
