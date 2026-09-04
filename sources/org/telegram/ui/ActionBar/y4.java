package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class y4 extends ActionBarLayout {
    public final n f21542s1;

    public y4(Activity activity, n nVar) {
        super(activity, false);
        this.f21542s1 = nVar;
    }

    @Override
    public final f3 getBottomSheet() {
        return ((f3[]) this.f21542s1.f21202b)[0];
    }
}
