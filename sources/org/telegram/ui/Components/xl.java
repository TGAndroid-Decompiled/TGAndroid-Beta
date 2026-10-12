package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class xl extends TextView {
    public final int f32795a;
    public float f32796b;
    public float f32797c;

    public xl(Context context, int i10) {
        super(context);
        this.f32795a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f32795a) {
            case 0:
                return this.f32796b;
            default:
                return this.f32796b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f32795a) {
            case 0:
                this.f32796b = f7;
                setTranslationY(this.f32797c + f7);
                return;
            default:
                this.f32796b = f7;
                setTranslationY(this.f32797c + f7);
                return;
        }
    }
}
