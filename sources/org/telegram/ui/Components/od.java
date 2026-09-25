package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class od extends LinearLayout {
    public final pd[] f27028a;

    public od(Context context) {
        super(context);
        this.f27028a = new pd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f27028a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.f27028a;
    }
}
