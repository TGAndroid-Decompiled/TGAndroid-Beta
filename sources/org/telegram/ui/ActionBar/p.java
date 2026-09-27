package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class p implements Runnable {
    public final int f19705a;
    public final ActionBarLayout f19706b;

    public p(ActionBarLayout actionBarLayout, int i10) {
        this.f19705a = i10;
        this.f19706b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19705a;
        ActionBarLayout actionBarLayout = this.f19706b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18633s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18638w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18596a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18633s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18617i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18593p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18593p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
