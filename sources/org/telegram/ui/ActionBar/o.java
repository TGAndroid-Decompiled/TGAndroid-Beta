package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class o implements Runnable {
    public final int f22898a;
    public final ActionBarLayout f22899b;

    public o(ActionBarLayout actionBarLayout, int i10) {
        this.f22898a = i10;
        this.f22899b = actionBarLayout;
    }

    @Override
    public final void run() {
        int i10 = this.f22898a;
        ActionBarLayout actionBarLayout = this.f22899b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                return;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.f22341s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.f22349w.requestLayout();
                return;
            case 2:
                if (actionBarLayout.f22301a && actionBarLayout.getLastFragment() != null && actionBarLayout.f22341s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.f22333o1)));
                    }
                    actionBarLayout.W(true, true);
                    return;
                }
                return;
            case 3:
                Drawable drawable = ActionBarLayout.f22298v1;
                actionBarLayout.G(false);
                return;
            case 4:
                Drawable drawable2 = ActionBarLayout.f22298v1;
                actionBarLayout.G(false);
                return;
            default:
                actionBarLayout.H0.setVisibility(8);
                return;
        }
    }
}
