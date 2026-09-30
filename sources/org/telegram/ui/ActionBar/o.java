package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19681a;
    public final ActionBarLayout f19682b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19681a = i10;
        this.f19682b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19681a;
        ActionBarLayout actionBarLayout = this.f19682b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18656s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18661w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18619a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18656s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18640i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18616p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18616p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
