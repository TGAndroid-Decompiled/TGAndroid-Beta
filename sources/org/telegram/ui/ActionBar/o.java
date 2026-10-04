package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21430a;
    public final ActionBarLayout f21431b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21430a = i10;
        this.f21431b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21430a;
        ActionBarLayout actionBarLayout = this.f21431b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20344s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20349w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20306a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20344s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20328i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20303p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20303p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
