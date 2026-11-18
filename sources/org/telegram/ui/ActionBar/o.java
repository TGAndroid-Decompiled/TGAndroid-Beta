package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f29818a;
    public final ActionBarLayout f29819b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f29818a = i7;
        this.f29819b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f29818a;
        ActionBarLayout actionBarLayout = this.f29819b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f28717s.requestLayout();
                actionBarLayout.f28726w.requestLayout();
                actionBarLayout.f28728x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f28677a && actionBarLayout.getLastFragment() != null && actionBarLayout.f28717s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.s2.f26721a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f28711p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f28674w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f28674w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
