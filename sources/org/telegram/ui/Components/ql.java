package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class ql extends TextView {
    public final int f31930a;
    public float f31931b;
    public float f31932c;

    public ql(Context context, int i10) {
        super(context);
        this.f31930a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31930a) {
            case 0:
                return this.f31931b;
            default:
                return this.f31931b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31930a) {
            case 0:
                this.f31931b = f7;
                setTranslationY(this.f31932c + f7);
                return;
            default:
                this.f31931b = f7;
                setTranslationY(this.f31932c + f7);
                return;
        }
    }
}
