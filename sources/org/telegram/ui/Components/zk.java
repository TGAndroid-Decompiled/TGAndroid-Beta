package org.telegram.ui.Components;

import android.widget.TextView;
public final class zk extends TextView {
    public float f33177a;
    public float f33178b;

    @Override
    public final float getTranslationX() {
        return this.f33177a;
    }

    @Override
    public final void setTranslationX(float f7) {
        this.f33177a = f7;
        setTranslationY(this.f33178b + f7);
    }
}
