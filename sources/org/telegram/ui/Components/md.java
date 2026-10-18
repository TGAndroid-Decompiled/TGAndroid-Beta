package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class md extends LinearLayout {
    public final nd[] f28511a;

    public md(Context context) {
        super(context);
        this.f28511a = new nd[2];
    }

    public final void a(org.telegram.ui.jk jkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28511a[childCount] = jkVar;
            addView(jkVar, layoutParams);
        }
    }

    public nd[] getButtons() {
        return this.f28511a;
    }
}
