package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class dd extends LinearLayout {
    public final ed[] f26259a;

    public dd(Context context) {
        super(context);
        this.f26259a = new ed[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f26259a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public ed[] getButtons() {
        return this.f26259a;
    }
}
