package org.telegram.ui.Components;

import android.view.View;
public final class k6 implements View.OnClickListener {
    public final int f27642a;
    public final Runnable f27643b;

    public k6(int i10, Runnable runnable) {
        this.f27642a = i10;
        this.f27643b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27642a) {
            case 0:
                this.f27643b.run();
                return;
            case 1:
                Runnable runnable = this.f27643b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27643b.run();
                return;
        }
    }
}
