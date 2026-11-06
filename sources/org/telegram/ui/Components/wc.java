package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class wc extends LinearLayout {
    public final xc[] f39959a;

    public wc(Context context) {
        super(context);
        this.f39959a = new xc[2];
    }

    public final void a(org.telegram.ui.sj sjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f39959a[childCount] = sjVar;
            addView(sjVar, layoutParams);
        }
    }

    public xc[] getButtons() {
        return this.f39959a;
    }
}
