package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class ld extends LinearLayout {
    public final md[] f25908a;

    public ld(Context context) {
        super(context);
        this.f25908a = new md[2];
    }

    public final void a(org.telegram.ui.pk pkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f25908a[childCount] = pkVar;
            addView(pkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.f25908a;
    }
}
