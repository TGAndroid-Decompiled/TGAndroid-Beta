package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f25277a;
    public final o70 f25278b;
    public final boolean f25279c;
    public final Runnable d;

    public h(o70 o70Var, boolean z4, Runnable runnable, int i10) {
        this.f25277a = i10;
        this.f25278b = o70Var;
        this.f25279c = z4;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f25277a) {
            case 0:
                this.f25278b.u();
                if (!this.f25279c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25278b.u();
                if (!this.f25279c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
