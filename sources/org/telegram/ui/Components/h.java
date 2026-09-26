package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24626a;
    public final z70 f24627b;
    public final boolean f24628c;
    public final Runnable d;

    public h(z70 z70Var, boolean z10, Runnable runnable, int i10) {
        this.f24626a = i10;
        this.f24627b = z70Var;
        this.f24628c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24626a) {
            case 0:
                this.f24627b.u();
                if (!this.f24628c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24627b.u();
                if (!this.f24628c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
