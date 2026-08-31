package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f27335a;
    public final q70 f27336b;
    public final boolean f27337c;
    public final Runnable d;

    public h(q70 q70Var, boolean z4, Runnable runnable, int i10) {
        this.f27335a = i10;
        this.f27336b = q70Var;
        this.f27337c = z4;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f27335a) {
            case 0:
                this.f27336b.u();
                if (!this.f27337c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27336b.u();
                if (!this.f27337c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
