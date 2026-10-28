package org.telegram.ui.Components;

import android.view.View;
public final class x6 implements View.OnClickListener {
    public final int f34682a;
    public final Runnable f34683b;

    public x6(int i10, Runnable runnable) {
        this.f34682a = i10;
        this.f34683b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34682a) {
            case 0:
                this.f34683b.run();
                return;
            case 1:
                Runnable runnable = this.f34683b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34683b.run();
                return;
        }
    }
}
