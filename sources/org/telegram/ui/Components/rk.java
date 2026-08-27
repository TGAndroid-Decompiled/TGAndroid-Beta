package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

public final class rk extends TextView {

    public final int f32196a;

    public float f32197b;

    public float f32198c;

    public rk(Context context, int i10) {
        super(context);
        this.f32196a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f32196a) {
            case 0:
                break;
        }
        return this.f32197b;
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f32196a) {
            case 0:
                this.f32197b = f10;
                setTranslationY(this.f32198c + f10);
                break;
            default:
                this.f32197b = f10;
                setTranslationY(this.f32198c + f10);
                break;
        }
    }
}
