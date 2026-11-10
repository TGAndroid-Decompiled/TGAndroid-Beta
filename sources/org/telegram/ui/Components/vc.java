package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class vc extends LinearLayout {
    public final wc[] f38984a;

    public vc(Context context) {
        super(context);
        this.f38984a = new wc[2];
    }

    public final void a(org.telegram.ui.uj ujVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f38984a[childCount] = ujVar;
            addView(ujVar, layoutParams);
        }
    }

    public wc[] getButtons() {
        return this.f38984a;
    }
}
