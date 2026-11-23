package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class ad extends LinearLayout {
    public final bd[] f33465a;

    public ad(Context context) {
        super(context);
        this.f33465a = new bd[2];
    }

    public final void a(org.telegram.ui.tj tjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f33465a[childCount] = tjVar;
            addView(tjVar, layoutParams);
        }
    }

    public bd[] getButtons() {
        return this.f33465a;
    }
}
