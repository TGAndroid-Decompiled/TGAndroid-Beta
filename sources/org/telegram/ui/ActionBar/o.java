package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21631a;
    public final ActionBarLayout f21632b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21631a = i10;
        this.f21632b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21631a;
        ActionBarLayout actionBarLayout = this.f21632b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20586s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20591w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20549a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20586s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20570i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20546p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20546p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
