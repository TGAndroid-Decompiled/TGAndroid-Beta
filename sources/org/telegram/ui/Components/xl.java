package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class xl extends TextView {
    public final int f32805a;
    public float f32806b;
    public float f32807c;

    public xl(Context context, int i10) {
        super(context);
        this.f32805a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f32805a) {
            case 0:
                return this.f32806b;
            default:
                return this.f32806b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f32805a) {
            case 0:
                this.f32806b = f7;
                setTranslationY(this.f32807c + f7);
                return;
            default:
                this.f32806b = f7;
                setTranslationY(this.f32807c + f7);
                return;
        }
    }
}
