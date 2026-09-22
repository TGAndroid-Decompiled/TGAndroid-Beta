package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19689a;
    public final ActionBarLayout f19690b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19689a = i10;
        this.f19690b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19689a;
        ActionBarLayout actionBarLayout = this.f19690b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18647s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18652w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18610a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18647s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18631i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18607p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18607p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
