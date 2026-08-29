package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class p implements Runnable {
    public final int f23721a;
    public final ActionBarLayout f23722b;

    public p(ActionBarLayout actionBarLayout, int i10) {
        this.f23721a = i10;
        this.f23722b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f23721a;
        ActionBarLayout actionBarLayout = this.f23722b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f22691s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f22696w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f22656a && actionBarLayout.getLastFragment() != null && actionBarLayout.f22691s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f22669e1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.f22699x0.setVisibility(8);
                return;
        }
    }
}
