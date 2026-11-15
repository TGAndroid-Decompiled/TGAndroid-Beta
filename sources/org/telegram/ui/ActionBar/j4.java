package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class j4 extends ActionBarLayout {
    public final z f28747z1;

    public j4(Activity activity, z zVar) {
        super(activity, false);
        this.f28747z1 = zVar;
    }

    @Override
    public final u2 getBottomSheet() {
        return ((u2[]) this.f28747z1.f29898b)[0];
    }
}
