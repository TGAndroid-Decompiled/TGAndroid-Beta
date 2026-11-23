package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f29795a;
    public final ActionBarLayout f29796b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f29795a = i7;
        this.f29796b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f29795a;
        ActionBarLayout actionBarLayout = this.f29796b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f28716s.requestLayout();
                actionBarLayout.f28725w.requestLayout();
                actionBarLayout.f28727x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f28676a && actionBarLayout.getLastFragment() != null && actionBarLayout.f28716s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.s2.f26694a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f28710p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f28673w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f28673w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
