package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f28327a;
    public final ActionBarLayout f28328b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f28327a = i7;
        this.f28328b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f28327a;
        ActionBarLayout actionBarLayout = this.f28328b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f27267s.requestLayout();
                actionBarLayout.f27275w.requestLayout();
                actionBarLayout.f27277x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f27227a && actionBarLayout.getLastFragment() != null && actionBarLayout.f27267s.getChildCount() == 0) {
                    boolean z9 = org.telegram.messenger.r2.f25199a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f27259o1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f27224v1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f27224v1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
