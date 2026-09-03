package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f25273a;
    public final p70 f25274b;
    public final boolean f25275c;
    public final Runnable d;

    public h(p70 p70Var, boolean z4, Runnable runnable, int i10) {
        this.f25273a = i10;
        this.f25274b = p70Var;
        this.f25275c = z4;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f25273a) {
            case 0:
                this.f25274b.u();
                if (!this.f25275c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25274b.u();
                if (!this.f25275c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
