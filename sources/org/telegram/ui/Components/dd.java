package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class dd extends LinearLayout {
    public final ed[] f24247a;

    public dd(Context context) {
        super(context);
        this.f24247a = new ed[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f24247a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public ed[] getButtons() {
        return this.f24247a;
    }
}
