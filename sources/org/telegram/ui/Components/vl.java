package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vl extends TextView {
    public final int f31813a;
    public float f31814b;
    public float f31815c;

    public vl(Context context, int i10) {
        super(context);
        this.f31813a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31813a) {
            case 0:
                return this.f31814b;
            default:
                return this.f31814b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31813a) {
            case 0:
                this.f31814b = f7;
                setTranslationY(this.f31815c + f7);
                return;
            default:
                this.f31814b = f7;
                setTranslationY(this.f31815c + f7);
                return;
        }
    }
}
