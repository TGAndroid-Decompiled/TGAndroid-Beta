package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f25750a;
    public float f25751b;
    public float f25752c;

    public el(Context context, int i10) {
        super(context);
        this.f25750a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25750a) {
            case 0:
                return this.f25751b;
            default:
                return this.f25751b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f25750a) {
            case 0:
                this.f25751b = f7;
                setTranslationY(this.f25752c + f7);
                return;
            default:
                this.f25751b = f7;
                setTranslationY(this.f25752c + f7);
                return;
        }
    }
}
