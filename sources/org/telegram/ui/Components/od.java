package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class od extends LinearLayout {
    public final pd[] f29344a;

    public od(Context context) {
        super(context);
        this.f29344a = new pd[2];
    }

    public final void a(org.telegram.ui.mk mkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f29344a[childCount] = mkVar;
            addView(mkVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.f29344a;
    }
}
