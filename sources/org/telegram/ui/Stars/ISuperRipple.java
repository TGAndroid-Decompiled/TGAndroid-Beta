package org.telegram.ui.Stars;

import android.view.View;

public abstract class ISuperRipple {
    public final View view;

    public abstract void animate(float f, float f2, float f3);

    public ISuperRipple(View view) {
        this.view = view;
    }
}
