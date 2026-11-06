package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f34448a;
    public final k60 f34449b;
    public final boolean f34450c;
    public final Runnable d;

    public i(k60 k60Var, boolean z9, Runnable runnable, int i7) {
        this.f34448a = i7;
        this.f34449b = k60Var;
        this.f34450c = z9;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f34448a) {
            case 0:
                this.f34449b.u();
                if (!this.f34450c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34449b.u();
                if (!this.f34450c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
