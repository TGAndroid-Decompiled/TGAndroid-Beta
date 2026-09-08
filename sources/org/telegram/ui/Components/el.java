package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f25749a;
    public float f25750b;
    public float f25751c;

    public el(Context context, int i10) {
        super(context);
        this.f25749a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25749a) {
            case 0:
                return this.f25750b;
            default:
                return this.f25750b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f25749a) {
            case 0:
                this.f25750b = f7;
                setTranslationY(this.f25751c + f7);
                return;
            default:
                this.f25750b = f7;
                setTranslationY(this.f25751c + f7);
                return;
        }
    }
}
