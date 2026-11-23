package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f29875a;
    public final ActionBarLayout f29876b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f29875a = i7;
        this.f29876b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f29875a;
        ActionBarLayout actionBarLayout = this.f29876b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f28808s.requestLayout();
                actionBarLayout.f28817w.requestLayout();
                actionBarLayout.f28819x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f28768a && actionBarLayout.getLastFragment() != null && actionBarLayout.f28808s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.s2.f26829a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f28802p1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f28765w1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f28765w1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.I0.setVisibility(8);
                return;
        }
    }
}
