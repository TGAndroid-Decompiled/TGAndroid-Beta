package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class od extends LinearLayout {
    public final pd[] f27031a;

    public od(Context context) {
        super(context);
        this.f27031a = new pd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f27031a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.f27031a;
    }
}
