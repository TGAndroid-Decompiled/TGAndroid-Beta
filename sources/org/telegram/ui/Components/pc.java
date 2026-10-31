package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class pc extends LinearLayout {
    public final qc[] f29339a;

    public pc(Context context) {
        super(context);
        this.f29339a = new qc[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f29339a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public qc[] getButtons() {
        return this.f29339a;
    }
}
