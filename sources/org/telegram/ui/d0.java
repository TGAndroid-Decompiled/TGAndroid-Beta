package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f32834a = 0;
    public final b3 f32835b;
    public final View f32836c;

    public d0(View view, b3 b3Var) {
        this.f32836c = view;
        this.f32835b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f32834a) {
            case 0:
                b3 b3Var = this.f32835b;
                View view = this.f32836c;
                view.post(new d0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f32835b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f32836c.invalidate();
                return;
        }
    }

    public d0(b3 b3Var, View view) {
        this.f32835b = b3Var;
        this.f32836c = view;
    }
}
