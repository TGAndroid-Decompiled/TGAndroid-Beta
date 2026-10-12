package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f20550a;
    public final ActionBarLayout f20551b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f20550a = i10;
        this.f20551b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f20550a;
        ActionBarLayout actionBarLayout = this.f20551b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f19526s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f19531w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f19489a && actionBarLayout.getLastFragment() != null && actionBarLayout.f19526s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f19510i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f19486p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f19486p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
