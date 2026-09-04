package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class nd extends LinearLayout {
    public final od[] f28731a;

    public nd(Context context) {
        super(context);
        this.f28731a = new od[2];
    }

    public final void a(org.telegram.ui.pk pkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28731a[childCount] = pkVar;
            addView(pkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.f28731a;
    }
}
