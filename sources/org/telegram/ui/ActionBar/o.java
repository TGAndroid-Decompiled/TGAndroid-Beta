package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f22901a;
    public final ActionBarLayout f22902b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f22901a = i10;
        this.f22902b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f22901a;
        ActionBarLayout actionBarLayout = this.f22902b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f22344s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f22352w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f22304a && actionBarLayout.getLastFragment() != null && actionBarLayout.f22344s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f22336o1)));
                    }
                    actionBarLayout.W(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f22301v1;
                actionBarLayout.G(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f22301v1;
                actionBarLayout.G(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
