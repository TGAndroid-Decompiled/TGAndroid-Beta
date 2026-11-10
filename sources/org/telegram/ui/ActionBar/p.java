package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class p implements Runnable {
    public final int f28355a;
    public final ActionBarLayout f28356b;

    public p(ActionBarLayout actionBarLayout, int i7) {
        this.f28355a = i7;
        this.f28356b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f28355a;
        ActionBarLayout actionBarLayout = this.f28356b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f27274s.requestLayout();
                actionBarLayout.f27282w.requestLayout();
                actionBarLayout.f27284x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f27234a && actionBarLayout.getLastFragment() != null && actionBarLayout.f27274s.getChildCount() == 0) {
                    boolean z9 = org.telegram.messenger.r2.f25216a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f27266o1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f27231v1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f27231v1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
