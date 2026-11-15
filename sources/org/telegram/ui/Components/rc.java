package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class rc extends LinearLayout {
    public final sc[] f38945a;

    public rc(Context context) {
        super(context);
        this.f38945a = new sc[2];
    }

    public final void a(org.telegram.ui.sj sjVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f38945a[childCount] = sjVar;
            addView(sjVar, layoutParams);
        }
    }

    public sc[] getButtons() {
        return this.f38945a;
    }
}
