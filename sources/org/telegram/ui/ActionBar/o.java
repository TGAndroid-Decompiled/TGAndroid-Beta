package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f20496a;
    public final ActionBarLayout f20497b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f20496a = i10;
        this.f20497b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f20496a;
        ActionBarLayout actionBarLayout = this.f20497b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f19481s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f19486w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f19447a && actionBarLayout.getLastFragment() != null && actionBarLayout.f19481s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f19462f1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f19444m1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f19444m1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.f19491y0.setVisibility(8);
                return;
        }
    }
}
