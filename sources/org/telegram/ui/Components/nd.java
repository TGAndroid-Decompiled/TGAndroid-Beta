package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class nd extends LinearLayout {
    public final od[] f30964a;

    public nd(Context context) {
        super(context);
        this.f30964a = new od[2];
    }

    public final void a(org.telegram.ui.jk jkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f30964a[childCount] = jkVar;
            addView(jkVar, layoutParams);
        }
    }

    public od[] getButtons() {
        return this.f30964a;
    }
}
