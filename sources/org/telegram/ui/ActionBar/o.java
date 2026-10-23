package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21713a;
    public final ActionBarLayout f21714b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21713a = i10;
        this.f21714b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21713a;
        ActionBarLayout actionBarLayout = this.f21714b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20653s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20661w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20613a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20653s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20645o1)));
                    }
                    actionBarLayout.V(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20610v1;
                actionBarLayout.G(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20610v1;
                actionBarLayout.G(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
