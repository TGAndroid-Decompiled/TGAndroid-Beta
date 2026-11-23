package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f39785a;
    public final Runnable f39786b;

    public t6(int i7, Runnable runnable) {
        this.f39785a = i7;
        this.f39786b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39785a) {
            case 0:
                this.f39786b.run();
                return;
            case 1:
                Runnable runnable = this.f39786b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39786b.run();
                return;
        }
    }
}
