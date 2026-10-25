package org.telegram.ui.ActionBar;

import android.app.Activity;
public final class d5 extends ActionBarLayout {
    public final p f22543y1;

    public d5(Activity activity, p pVar) {
        super(activity, false);
        this.f22543y1 = pVar;
    }

    @Override
    public final k3 getBottomSheet() {
        return ((k3[]) this.f22543y1.f22922b)[0];
    }
}
