package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class hl extends TextView {
    public final int f27150a;
    public float f27151b;
    public float f27152c;

    public hl(Context context, int i10) {
        super(context);
        this.f27150a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f27150a) {
            case 0:
                return this.f27151b;
            default:
                return this.f27151b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f27150a) {
            case 0:
                this.f27151b = f7;
                setTranslationY(this.f27152c + f7);
                return;
            default:
                this.f27151b = f7;
                setTranslationY(this.f27152c + f7);
                return;
        }
    }
}
