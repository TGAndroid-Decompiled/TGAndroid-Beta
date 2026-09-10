package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class ld extends LinearLayout {
    public final md[] f24964a;

    public ld(Context context) {
        super(context);
        this.f24964a = new md[2];
    }

    public final void a(org.telegram.ui.rk rkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f24964a[childCount] = rkVar;
            addView(rkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.f24964a;
    }
}
