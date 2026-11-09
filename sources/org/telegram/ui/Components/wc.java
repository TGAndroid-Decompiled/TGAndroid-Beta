package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class wc extends LinearLayout {
    public final xc[] f40033a;

    public wc(Context context) {
        super(context);
        this.f40033a = new xc[2];
    }

    public final void a(org.telegram.ui.uj ujVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f40033a[childCount] = ujVar;
            addView(ujVar, layoutParams);
        }
    }

    public xc[] getButtons() {
        return this.f40033a;
    }
}
