package org.telegram.ui.Components;

import android.view.View;
public final class i implements View.OnClickListener {
    public final int f29286a;
    public final j70 f29287b;
    public final boolean f29288c;
    public final Runnable d;

    public i(j70 j70Var, boolean z10, Runnable runnable, int i10) {
        this.f29286a = i10;
        this.f29287b = j70Var;
        this.f29288c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f29286a) {
            case 0:
                this.f29287b.u();
                if (!this.f29288c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f29287b.u();
                if (!this.f29288c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
