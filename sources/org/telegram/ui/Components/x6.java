package org.telegram.ui.Components;

import android.view.View;
public final class x6 implements View.OnClickListener {
    public final int f34641a;
    public final Runnable f34642b;

    public x6(int i10, Runnable runnable) {
        this.f34641a = i10;
        this.f34642b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34641a) {
            case 0:
                this.f34642b.run();
                return;
            case 1:
                Runnable runnable = this.f34642b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34642b.run();
                return;
        }
    }
}
