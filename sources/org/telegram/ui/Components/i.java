package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f34459a;
    public final k60 f34460b;
    public final boolean f34461c;
    public final Runnable d;

    public i(k60 k60Var, boolean z9, Runnable runnable, int i7) {
        this.f34459a = i7;
        this.f34460b = k60Var;
        this.f34461c = z9;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f34459a) {
            case 0:
                this.f34460b.u();
                if (!this.f34461c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34460b.u();
                if (!this.f34461c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
