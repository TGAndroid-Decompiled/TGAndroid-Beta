package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class nd extends LinearLayout {
    public final od[] f26808a;

    public nd(Context context) {
        super(context);
        this.f26808a = new od[2];
    }

    public final void a(org.telegram.ui.ok okVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f26808a[childCount] = okVar;
            addView(okVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.f26808a;
    }
}
