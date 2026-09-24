package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f24572a;
    public final y70 f24573b;
    public final boolean f24574c;
    public final Runnable d;

    public h(y70 y70Var, boolean z10, Runnable runnable, int i10) {
        this.f24572a = i10;
        this.f24573b = y70Var;
        this.f24574c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f24572a) {
            case 0:
                this.f24573b.u();
                if (!this.f24574c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f24573b.u();
                if (!this.f24574c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
