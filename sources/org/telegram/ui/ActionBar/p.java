package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class p implements Runnable {
    public final int f18526a;
    public final ActionBarLayout f18527b;

    public p(ActionBarLayout actionBarLayout, int i10) {
        this.f18526a = i10;
        this.f18527b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f18526a;
        ActionBarLayout actionBarLayout = this.f18527b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f17506s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f17511w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f17469a && actionBarLayout.getLastFragment() != null && actionBarLayout.f17506s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f17490i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f17466p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f17466p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
