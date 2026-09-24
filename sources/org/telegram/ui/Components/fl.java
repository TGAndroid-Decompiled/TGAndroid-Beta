package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class fl extends TextView {
    public final int f24190a;
    public float f24191b;
    public float f24192c;

    public fl(Context context, int i10) {
        super(context);
        this.f24190a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24190a) {
            case 0:
                return this.f24191b;
            default:
                return this.f24191b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24190a) {
            case 0:
                this.f24191b = f7;
                setTranslationY(this.f24192c + f7);
                return;
            default:
                this.f24191b = f7;
                setTranslationY(this.f24192c + f7);
                return;
        }
    }
}
