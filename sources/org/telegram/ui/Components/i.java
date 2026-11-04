package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f34553a;
    public final f60 f34554b;
    public final boolean f34555c;
    public final Runnable d;

    public i(f60 f60Var, boolean z10, Runnable runnable, int i3) {
        this.f34553a = i3;
        this.f34554b = f60Var;
        this.f34555c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f34553a) {
            case 0:
                this.f34554b.u();
                if (!this.f34555c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34554b.u();
                if (!this.f34555c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
