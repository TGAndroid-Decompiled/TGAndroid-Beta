package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class ou0 implements View.OnClickListener {
    public final int f48581a;
    public final Runnable f48582b;

    public ou0(int i7, Runnable runnable) {
        this.f48581a = i7;
        this.f48582b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f48581a;
        Runnable runnable = this.f48582b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.V6;
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
