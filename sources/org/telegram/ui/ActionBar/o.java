package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21632a;
    public final ActionBarLayout f21633b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21632a = i10;
        this.f21633b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21632a;
        ActionBarLayout actionBarLayout = this.f21633b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20587s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20592w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20550a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20587s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20571i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20547p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20547p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
