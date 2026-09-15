package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f27784a;
    public final Runnable f27785b;

    public s6(int i10, Runnable runnable) {
        this.f27784a = i10;
        this.f27785b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27784a) {
            case 0:
                this.f27785b.run();
                return;
            case 1:
                Runnable runnable = this.f27785b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27785b.run();
                return;
        }
    }
}
