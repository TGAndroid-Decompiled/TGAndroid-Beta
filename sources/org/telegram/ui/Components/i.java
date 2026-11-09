package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f34505a;
    public final l60 f34506b;
    public final boolean f34507c;
    public final Runnable d;

    public i(l60 l60Var, boolean z9, Runnable runnable, int i7) {
        this.f34505a = i7;
        this.f34506b = l60Var;
        this.f34507c = z9;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f34505a) {
            case 0:
                this.f34506b.u();
                if (!this.f34507c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34506b.u();
                if (!this.f34507c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
