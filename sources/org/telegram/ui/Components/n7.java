package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n7 extends y20 {
    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            try {
                ((ViewGroup) getParent()).removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
