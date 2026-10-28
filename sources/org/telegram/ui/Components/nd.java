package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class nd extends LinearLayout {
    public final od[] f30866a;

    public nd(Context context) {
        super(context);
        this.f30866a = new od[2];
    }

    public final void a(org.telegram.ui.lk lkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f30866a[childCount] = lkVar;
            addView(lkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.f30866a;
    }
}
