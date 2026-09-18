package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class md extends LinearLayout {
    public final nd[] f26399a;

    public md(Context context) {
        super(context);
        this.f26399a = new nd[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f26399a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.f26399a;
    }
}
