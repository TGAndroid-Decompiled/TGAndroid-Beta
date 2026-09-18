package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class z4 extends ActionBarLayout {
    public final p f19760s1;

    public z4(Activity activity, p pVar) {
        super(activity, false);
        this.f19760s1 = pVar;
    }

    @Override
    public final g3 getBottomSheet() {
        return ((g3[]) this.f19760s1.f19483b)[0];
    }
}
