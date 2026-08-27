package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

public final class zc extends LinearLayout {

    public final ad[] f35221a;

    public zc(Context context) {
        super(context);
        this.f35221a = new ad[2];
    }

    public final void a(org.telegram.ui.fk fkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f35221a[childCount] = fkVar;
            addView(fkVar, layoutParams);
        }
    }

    public ad[] getButtons() {
        return this.f35221a;
    }
}
