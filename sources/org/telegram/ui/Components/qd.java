package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class qd extends LinearLayout {
    public final rd[] f29820a;

    public qd(Context context) {
        super(context);
        this.f29820a = new rd[2];
    }

    public final void a(org.telegram.ui.uk ukVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f29820a[childCount] = ukVar;
            addView(ukVar, layoutParams);
        }
    }

    public rd[] getButtons() {
        return this.f29820a;
    }
}
