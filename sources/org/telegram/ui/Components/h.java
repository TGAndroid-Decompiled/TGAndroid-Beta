package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f25437a;
    public final m80 f25438b;
    public final boolean f25439c;
    public final Runnable d;

    public h(m80 m80Var, boolean z10, Runnable runnable, int i10) {
        this.f25437a = i10;
        this.f25438b = m80Var;
        this.f25439c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f25437a) {
            case 0:
                this.f25438b.u();
                if (!this.f25439c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25438b.u();
                if (!this.f25439c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
