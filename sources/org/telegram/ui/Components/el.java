package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f23895a;
    public float f23896b;
    public float f23897c;

    public el(Context context, int i10) {
        super(context);
        this.f23895a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23895a) {
            case 0:
                return this.f23896b;
            default:
                return this.f23896b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23895a) {
            case 0:
                this.f23896b = f7;
                setTranslationY(this.f23897c + f7);
                return;
            default:
                this.f23896b = f7;
                setTranslationY(this.f23897c + f7);
                return;
        }
    }
}
