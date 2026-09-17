package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f25723a;
    public float f25724b;
    public float f25725c;

    public el(Context context, int i10) {
        super(context);
        this.f25723a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25723a) {
            case 0:
                return this.f25724b;
            default:
                return this.f25724b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f25723a) {
            case 0:
                this.f25724b = f7;
                setTranslationY(this.f25725c + f7);
                return;
            default:
                this.f25724b = f7;
                setTranslationY(this.f25725c + f7);
                return;
        }
    }
}
