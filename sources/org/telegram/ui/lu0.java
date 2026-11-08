package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class lu0 implements View.OnClickListener {
    public final int f47587a;
    public final Runnable f47588b;

    public lu0(int i7, Runnable runnable) {
        this.f47587a = i7;
        this.f47588b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47587a;
        Runnable runnable = this.f47588b;
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
