package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f28362a;
    public final ActionBarLayout f28363b;

    public o(ActionBarLayout actionBarLayout, int i3) {
        this.f28362a = i3;
        this.f28363b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i3 = this.f28362a;
        ActionBarLayout actionBarLayout = this.f28363b;
        switch (i3) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f27316s.requestLayout();
                actionBarLayout.f27325w.requestLayout();
                actionBarLayout.f27327x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f27276a && actionBarLayout.getLastFragment() != null && actionBarLayout.f27316s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.r2.f25040a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f27310p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f27273w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f27273w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
