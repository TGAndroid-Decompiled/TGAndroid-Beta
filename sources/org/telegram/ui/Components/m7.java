package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m7 extends u20 {
    @Override
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 != 0) {
            try {
                ((ViewGroup) getParent()).removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
