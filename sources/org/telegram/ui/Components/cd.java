package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class cd extends LinearLayout {
    public final dd[] f27468a;

    public cd(Context context) {
        super(context);
        this.f27468a = new dd[2];
    }

    public final void a(org.telegram.ui.dk dkVar, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.f27468a[childCount] = dkVar;
            addView(dkVar, layoutParams);
        }
    }

    public dd[] getButtons() {
        return this.f27468a;
    }
}
