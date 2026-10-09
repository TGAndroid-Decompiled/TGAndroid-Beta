package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f36769a = 0;
    public final b3 f36770b;
    public final View f36771c;

    public d0(View view, b3 b3Var) {
        this.f36771c = view;
        this.f36770b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f36769a) {
            case 0:
                b3 b3Var = this.f36770b;
                View view = this.f36771c;
                view.post(new d0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f36770b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f36771c.invalidate();
                return;
        }
    }

    public d0(b3 b3Var, View view) {
        this.f36770b = b3Var;
        this.f36771c = view;
    }
}
