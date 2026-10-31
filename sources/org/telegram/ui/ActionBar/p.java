package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.f8;
public final class p implements Runnable {
    public final int f20632a;
    public final ActionBarLayout f20633b;

    public p(ActionBarLayout actionBarLayout, int i10) {
        this.f20632a = i10;
        this.f20633b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f20632a;
        ActionBarLayout actionBarLayout = this.f20633b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20109s.requestLayout();
                actionBarLayout.f20117w.requestLayout();
                actionBarLayout.f20119x.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20069a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20109s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.v2.f18448a;
                    f8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20101o1)), true);
                    actionBarLayout.W(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20066v1;
                actionBarLayout.G(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20066v1;
                actionBarLayout.G(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
