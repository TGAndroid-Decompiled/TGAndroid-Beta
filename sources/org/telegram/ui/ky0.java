package org.telegram.ui;

import android.view.View;
public final class ky0 implements View.OnClickListener {
    public final int f41086a;
    public final Runnable f41087b;

    public ky0(int i10, Runnable runnable) {
        this.f41086a = i10;
        this.f41087b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41086a;
        Runnable runnable = this.f41087b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                runnable.run();
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
