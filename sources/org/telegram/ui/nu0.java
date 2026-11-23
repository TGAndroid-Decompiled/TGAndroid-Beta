package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class nu0 implements View.OnClickListener {
    public final int f50326a;
    public final Runnable f50327b;

    public nu0(int i7, Runnable runnable) {
        this.f50326a = i7;
        this.f50327b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f50326a;
        Runnable runnable = this.f50327b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
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
