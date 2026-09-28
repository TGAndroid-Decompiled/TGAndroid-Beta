package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19665a;
    public final ActionBarLayout f19666b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19665a = i10;
        this.f19666b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19665a;
        ActionBarLayout actionBarLayout = this.f19666b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18640s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18645w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18603a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18640s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18624i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18600p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18600p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
