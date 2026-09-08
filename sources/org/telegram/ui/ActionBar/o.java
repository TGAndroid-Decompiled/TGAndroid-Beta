package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21274a;
    public final ActionBarLayout f21275b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21274a = i10;
        this.f21275b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21274a;
        ActionBarLayout actionBarLayout = this.f21275b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20202s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20207w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20164a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20202s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20186i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20161p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20161p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
