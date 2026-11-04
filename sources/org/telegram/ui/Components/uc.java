package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class uc extends LinearLayout {
    public final vc[] f38718a;

    public uc(Context context) {
        super(context);
        this.f38718a = new vc[2];
    }

    public final void a(org.telegram.ui.oj ojVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f38718a[childCount] = ojVar;
            addView(ojVar, layoutParams);
        }
    }

    public vc[] getButtons() {
        return this.f38718a;
    }
}
