package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f23870a;
    public float f23871b;
    public float f23872c;

    public el(Context context, int i10) {
        super(context);
        this.f23870a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23870a) {
            case 0:
                return this.f23871b;
            default:
                return this.f23871b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23870a) {
            case 0:
                this.f23871b = f7;
                setTranslationY(this.f23872c + f7);
                return;
            default:
                this.f23871b = f7;
                setTranslationY(this.f23872c + f7);
                return;
        }
    }
}
