package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class o implements Runnable {

    public final int f23692a;

    public final ActionBarLayout f23693b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f23692a = i10;
        this.f23693b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f23692a;
        ActionBarLayout actionBarLayout = this.f23693b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                break;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f22679s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f22684w.requestLayout();
                break;
            case 2:
                if (actionBarLayout.f22644a && actionBarLayout.getLastFragment() != null && actionBarLayout.f22679s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f22657e1)));
                    }
                    actionBarLayout.U(true, true);
                    break;
                }
                break;
            case 3:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
            case 4:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
            default:
                actionBarLayout.f22687x0.setVisibility(8);
                break;
        }
    }
}
