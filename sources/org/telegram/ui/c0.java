package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36166a = 0;
    public final c3 f36167b;
    public final View f36168c;

    public c0(View view, c3 c3Var) {
        this.f36168c = view;
        this.f36167b = c3Var;
    }

    @Override
    public final void run() {
        switch (this.f36166a) {
            case 0:
                c3 c3Var = this.f36167b;
                View view = this.f36168c;
                view.post(new c0(c3Var, view));
                return;
            default:
                c3 c3Var2 = this.f36167b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.f36168c.invalidate();
                return;
        }
    }

    public c0(c3 c3Var, View view) {
        this.f36167b = c3Var;
        this.f36168c = view;
    }
}
