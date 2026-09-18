package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class ld extends LinearLayout {
    public final md[] f25893a;

    public ld(Context context) {
        super(context);
        this.f25893a = new md[2];
    }

    public final void a(org.telegram.ui.qk qkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f25893a[childCount] = qkVar;
            addView(qkVar, layoutParams);
        }
    }

    public md[] getButtons() {
        return this.f25893a;
    }
}
