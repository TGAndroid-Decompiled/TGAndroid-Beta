package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19440a;
    public final ActionBarLayout f19441b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19440a = i10;
        this.f19441b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19440a;
        ActionBarLayout actionBarLayout = this.f19441b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18425s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18430w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18388a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18425s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18409i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18385p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18385p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
