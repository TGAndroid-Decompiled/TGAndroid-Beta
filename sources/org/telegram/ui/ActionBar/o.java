package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19650a;
    public final ActionBarLayout f19651b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19650a = i10;
        this.f19651b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19650a;
        ActionBarLayout actionBarLayout = this.f19651b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18625s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18630w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18588a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18625s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18609i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18585p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18585p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
