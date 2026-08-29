package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class gd extends LinearLayout {
    public final hd[] f28871a;

    public gd(Context context) {
        super(context);
        this.f28871a = new hd[2];
    }

    public final void a(org.telegram.ui.gk gkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f28871a[childCount] = gkVar;
            addView(gkVar, layoutParams);
        }
    }

    public hd[] getButtons() {
        return this.f28871a;
    }
}
