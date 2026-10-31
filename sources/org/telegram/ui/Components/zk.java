package org.telegram.ui.Components;

import android.widget.TextView;
public final class zk extends TextView {
    public float f33101a;
    public float f33102b;

    @Override
    public final float getTranslationX() {
        return this.f33101a;
    }

    @Override
    public final void setTranslationX(float f7) {
        this.f33101a = f7;
        setTranslationY(this.f33102b + f7);
    }
}
