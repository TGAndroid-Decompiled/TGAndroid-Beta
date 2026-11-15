package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f29420a;
    public final ActionBarLayout f29421b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f29420a = i7;
        this.f29421b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f29420a;
        ActionBarLayout actionBarLayout = this.f29421b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f28365s.requestLayout();
                actionBarLayout.f28374w.requestLayout();
                actionBarLayout.f28376x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f28325a && actionBarLayout.getLastFragment() != null && actionBarLayout.f28365s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.r2.f26198a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f28359p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f28322w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f28322w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
