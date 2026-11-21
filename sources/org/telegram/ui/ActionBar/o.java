package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f29826a;
    public final ActionBarLayout f29827b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f29826a = i7;
        this.f29827b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f29826a;
        ActionBarLayout actionBarLayout = this.f29827b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f28747s.requestLayout();
                actionBarLayout.f28756w.requestLayout();
                actionBarLayout.f28758x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f28707a && actionBarLayout.getLastFragment() != null && actionBarLayout.f28747s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.s2.f26749a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f28741p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f28704w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f28704w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
