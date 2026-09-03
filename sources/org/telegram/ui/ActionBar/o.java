package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f20471a;
    public final ActionBarLayout f20472b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f20471a = i10;
        this.f20472b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f20471a;
        ActionBarLayout actionBarLayout = this.f20472b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f19456s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f19461w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f19422a && actionBarLayout.getLastFragment() != null && actionBarLayout.f19456s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f19437f1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f19419m1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f19419m1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.f19466y0.setVisibility(8);
                return;
        }
    }
}
