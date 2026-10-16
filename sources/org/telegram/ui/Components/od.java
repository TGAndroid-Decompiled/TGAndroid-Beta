package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class od extends LinearLayout {
    public final pd[] f27638a;

    public od(Context context) {
        super(context);
        this.f27638a = new pd[2];
    }

    public final void a(org.telegram.ui.uk ukVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f27638a[childCount] = ukVar;
            addView(ukVar, layoutParams);
        }
    }

    public pd[] getButtons() {
        return this.f27638a;
    }
}
