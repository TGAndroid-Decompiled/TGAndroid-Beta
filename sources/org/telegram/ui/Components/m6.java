package org.telegram.ui.Components;

import android.view.View;
public final class m6 implements View.OnClickListener {
    public final int f37077a;
    public final Runnable f37078b;

    public m6(int i7, Runnable runnable) {
        this.f37077a = i7;
        this.f37078b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37077a) {
            case 0:
                this.f37078b.run();
                return;
            case 1:
                Runnable runnable = this.f37078b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f37078b.run();
                return;
        }
    }
}
