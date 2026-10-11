package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class qd extends LinearLayout {
    public final rd[] f30232a;

    public qd(Context context) {
        super(context);
        this.f30232a = new rd[2];
    }

    public final void a(org.telegram.ui.qk qkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f30232a[childCount] = qkVar;
            addView(qkVar, layoutParams);
        }
    }

    public rd[] getButtons() {
        return this.f30232a;
    }
}
