package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class kd extends LinearLayout {
    public final ld[] f28006a;

    public kd(Context context) {
        super(context);
        this.f28006a = new ld[2];
    }

    public final void a(org.telegram.ui.ik ikVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28006a[childCount] = ikVar;
            addView(ikVar, layoutParams);
        }
    }

    public ld[] getButtons() {
        return this.f28006a;
    }
}
