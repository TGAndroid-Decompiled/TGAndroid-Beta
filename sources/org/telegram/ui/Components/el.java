package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f25722a;
    public float f25723b;
    public float f25724c;

    public el(Context context, int i10) {
        super(context);
        this.f25722a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25722a) {
            case 0:
                return this.f25723b;
            default:
                return this.f25723b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f25722a) {
            case 0:
                this.f25723b = f7;
                setTranslationY(this.f25724c + f7);
                return;
            default:
                this.f25723b = f7;
                setTranslationY(this.f25724c + f7);
                return;
        }
    }
}
