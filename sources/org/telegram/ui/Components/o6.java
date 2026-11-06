package org.telegram.ui.Components;

import android.view.View;
public final class o6 implements View.OnClickListener {
    public final int f36560a;
    public final Runnable f36561b;

    public o6(int i7, Runnable runnable) {
        this.f36560a = i7;
        this.f36561b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36560a) {
            case 0:
                this.f36561b.run();
                return;
            case 1:
                Runnable runnable = this.f36561b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36561b.run();
                return;
        }
    }
}
