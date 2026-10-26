package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class ql extends TextView {
    public final int f31949a;
    public float f31950b;
    public float f31951c;

    public ql(Context context, int i10) {
        super(context);
        this.f31949a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31949a) {
            case 0:
                return this.f31950b;
            default:
                return this.f31950b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31949a) {
            case 0:
                this.f31950b = f7;
                setTranslationY(this.f31951c + f7);
                return;
            default:
                this.f31950b = f7;
                setTranslationY(this.f31951c + f7);
                return;
        }
    }
}
