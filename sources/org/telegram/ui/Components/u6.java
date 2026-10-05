package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f31357a;
    public final Runnable f31358b;

    public u6(int i10, Runnable runnable) {
        this.f31357a = i10;
        this.f31358b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31357a) {
            case 0:
                this.f31358b.run();
                return;
            case 1:
                Runnable runnable = this.f31358b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31358b.run();
                return;
        }
    }
}
