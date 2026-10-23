package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class md extends LinearLayout {
    public final nd[] f28637a;

    public md(Context context) {
        super(context);
        this.f28637a = new nd[2];
    }

    public final void a(org.telegram.ui.ik ikVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28637a[childCount] = ikVar;
            addView(ikVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.f28637a;
    }
}
