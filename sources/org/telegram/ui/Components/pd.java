package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class pd extends LinearLayout {
    public final qd[] f27337a;

    public pd(Context context) {
        super(context);
        this.f27337a = new qd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f27337a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public qd[] getButtons() {
        return this.f27337a;
    }
}
