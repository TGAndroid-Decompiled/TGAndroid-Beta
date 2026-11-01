package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.f8;
public final class p implements Runnable {
    public final int f20633a;
    public final ActionBarLayout f20634b;

    public p(ActionBarLayout actionBarLayout, int i10) {
        this.f20633a = i10;
        this.f20634b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f20633a;
        ActionBarLayout actionBarLayout = this.f20634b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20110s.requestLayout();
                actionBarLayout.f20118w.requestLayout();
                actionBarLayout.f20120x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20070a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20110s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    f8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20102o1)), true);
                    actionBarLayout.W(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20067v1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20067v1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
