package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21439a;
    public final ActionBarLayout f21440b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21439a = i10;
        this.f21440b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21439a;
        ActionBarLayout actionBarLayout = this.f21440b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20354s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20359w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20316a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20354s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20338i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20313p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20313p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
