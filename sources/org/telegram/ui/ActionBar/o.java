package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f23680a;
    public final ActionBarLayout f23681b;

    public o(ActionBarLayout actionBarLayout, int i9) {
        this.f23680a = i9;
        this.f23681b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i9 = this.f23680a;
        ActionBarLayout actionBarLayout = this.f23681b;
        switch (i9) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f22679s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f22684w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f22644a && actionBarLayout.getLastFragment() != null && actionBarLayout.f22679s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f22657e1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.f22687x0.setVisibility(8);
                return;
        }
    }
}
