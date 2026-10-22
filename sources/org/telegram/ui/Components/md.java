package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class md extends LinearLayout {
    public final nd[] f28491a;

    public md(Context context) {
        super(context);
        this.f28491a = new nd[2];
    }

    public final void a(org.telegram.ui.hk hkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28491a[childCount] = hkVar;
            addView(hkVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.f28491a;
    }
}
