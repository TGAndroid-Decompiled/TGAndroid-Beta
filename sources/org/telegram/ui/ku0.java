package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class ku0 implements View.OnClickListener {
    public final int f47289a;
    public final Runnable f47290b;

    public ku0(int i7, Runnable runnable) {
        this.f47289a = i7;
        this.f47290b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47289a;
        Runnable runnable = this.f47290b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.S6;
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
