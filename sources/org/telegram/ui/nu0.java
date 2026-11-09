package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class nu0 implements View.OnClickListener {
    public final int f48237a;
    public final Runnable f48238b;

    public nu0(int i7, Runnable runnable) {
        this.f48237a = i7;
        this.f48238b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f48237a;
        Runnable runnable = this.f48238b;
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
