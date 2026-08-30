package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class z4 extends ActionBarLayout {
    public final n f20785p1;

    public z4(Activity activity, n nVar) {
        super(activity, false);
        this.f20785p1 = nVar;
    }

    @Override
    public final g3 getBottomSheet() {
        return ((g3[]) this.f20785p1.f20475b)[0];
    }
}
