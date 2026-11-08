package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class l4 extends ActionBarLayout {
    public final l2.y f28280y1;

    public l4(Activity activity, l2.y yVar) {
        super(activity, false);
        this.f28280y1 = yVar;
    }

    @Override
    public final v2 getBottomSheet() {
        return ((v2[]) this.f28280y1.f18089b)[0];
    }
}
