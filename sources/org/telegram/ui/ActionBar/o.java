package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f19664a;
    public final ActionBarLayout f19665b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f19664a = i10;
        this.f19665b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f19664a;
        ActionBarLayout actionBarLayout = this.f19665b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f18639s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f18644w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f18602a && actionBarLayout.getLastFragment() != null && actionBarLayout.f18639s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f18623i1)));
                    }
                    actionBarLayout.U(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f18599p1;
                actionBarLayout.F(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f18599p1;
                actionBarLayout.F(false);
                return;
            default:
                actionBarLayout.B0.setVisibility(8);
                return;
        }
    }
}
