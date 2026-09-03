package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f22189a;
    public final ActionBarLayout f22190b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f22189a = i10;
        this.f22190b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f22189a;
        ActionBarLayout actionBarLayout = this.f22190b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f21145s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f21150w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f21110a && actionBarLayout.getLastFragment() != null && actionBarLayout.f21145s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f21126f1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f21107m1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f21107m1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.f21155y0.setVisibility(8);
                return;
        }
    }
}
