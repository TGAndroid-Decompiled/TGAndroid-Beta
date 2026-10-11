package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vl extends TextView {
    public final int f31915a;
    public float f31916b;
    public float f31917c;

    public vl(Context context, int i10) {
        super(context);
        this.f31915a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31915a) {
            case 0:
                return this.f31916b;
            default:
                return this.f31916b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31915a) {
            case 0:
                this.f31916b = f7;
                setTranslationY(this.f31917c + f7);
                return;
            default:
                this.f31916b = f7;
                setTranslationY(this.f31917c + f7);
                return;
        }
    }
}
