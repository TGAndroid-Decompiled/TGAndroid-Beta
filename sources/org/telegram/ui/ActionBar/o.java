package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f21247a;
    public final ActionBarLayout f21248b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f21247a = i10;
        this.f21248b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f21247a;
        ActionBarLayout actionBarLayout = this.f21248b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f20175s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f20180w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f20137a && actionBarLayout.getLastFragment() != null && actionBarLayout.f20175s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f20159i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f20134p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f20134p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
