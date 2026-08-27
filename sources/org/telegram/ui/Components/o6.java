package org.telegram.ui.Components;

import android.view.View;

public final class o6 implements View.OnClickListener {

    public final int f31171a;

    public final Runnable f31172b;

    public o6(int i10, Runnable runnable) {
        this.f31171a = i10;
        this.f31172b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31171a) {
            case 0:
                this.f31172b.run();
                break;
            case 1:
                Runnable runnable = this.f31172b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                this.f31172b.run();
                break;
        }
    }
}
