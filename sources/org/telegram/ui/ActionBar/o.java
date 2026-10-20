package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21628a;
    public final ActionBarLayout f21629b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21628a = i10;
        this.f21629b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21628a;
        ActionBarLayout actionBarLayout = this.f21629b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20583s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20588w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20546a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20583s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20567i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20543p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20543p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
