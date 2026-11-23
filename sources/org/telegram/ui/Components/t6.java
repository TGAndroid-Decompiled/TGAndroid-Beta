package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f39784a;
    public final Runnable f39785b;

    public t6(int i7, Runnable runnable) {
        this.f39784a = i7;
        this.f39785b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39784a) {
            case 0:
                this.f39785b.run();
                return;
            case 1:
                Runnable runnable = this.f39785b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39785b.run();
                return;
        }
    }
}
