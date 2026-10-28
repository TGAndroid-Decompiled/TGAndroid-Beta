package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class d5 extends ActionBarLayout {
    public final p f22546y1;

    public d5(Activity activity, p pVar) {
        super(activity, false);
        this.f22546y1 = pVar;
    }

    @Override
    public final k3 getBottomSheet() {
        return ((k3[]) this.f22546y1.f22925b)[0];
    }
}
