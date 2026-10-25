package org.telegram.ui.Components;

import android.view.View;
public final class x6 implements View.OnClickListener {
    public final int f34638a;
    public final Runnable f34639b;

    public x6(int i10, Runnable runnable) {
        this.f34638a = i10;
        this.f34639b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34638a) {
            case 0:
                this.f34639b.run();
                return;
            case 1:
                Runnable runnable = this.f34639b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34639b.run();
                return;
        }
    }
}
