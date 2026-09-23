package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class nd extends LinearLayout {
    public final od[] f26410a;

    public nd(Context context) {
        super(context);
        this.f26410a = new od[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f26410a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.f26410a;
    }
}
