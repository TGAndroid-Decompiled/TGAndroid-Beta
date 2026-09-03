package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f27317a;
    public final q70 f27318b;
    public final boolean f27319c;
    public final Runnable d;

    public h(q70 q70Var, boolean z4, Runnable runnable, int i10) {
        this.f27317a = i10;
        this.f27318b = q70Var;
        this.f27319c = z4;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f27317a) {
            case 0:
                this.f27318b.u();
                if (!this.f27319c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27318b.u();
                if (!this.f27319c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
