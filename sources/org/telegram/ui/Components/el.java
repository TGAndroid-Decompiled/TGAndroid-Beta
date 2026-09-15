package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f23684a;
    public float f23685b;
    public float f23686c;

    public el(Context context, int i10) {
        super(context);
        this.f23684a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23684a) {
            case 0:
                return this.f23685b;
            default:
                return this.f23685b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23684a) {
            case 0:
                this.f23685b = f7;
                setTranslationY(this.f23686c + f7);
                return;
            default:
                this.f23685b = f7;
                setTranslationY(this.f23686c + f7);
                return;
        }
    }
}
