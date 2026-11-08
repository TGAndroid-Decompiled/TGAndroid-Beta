package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;
public final class o implements Runnable {
    public final int f28330a;
    public final ActionBarLayout f28331b;

    public o(ActionBarLayout actionBarLayout, int i7) {
        this.f28330a = i7;
        this.f28331b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i7 = this.f28330a;
        ActionBarLayout actionBarLayout = this.f28331b;
        switch (i7) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f27270s.requestLayout();
                actionBarLayout.f27278w.requestLayout();
                actionBarLayout.f27280x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f27230a && actionBarLayout.getLastFragment() != null && actionBarLayout.f27270s.getChildCount() == 0) {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f27262o1)), true);
                    actionBarLayout.X(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f27227v1;
                actionBarLayout.H(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f27227v1;
                actionBarLayout.H(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
