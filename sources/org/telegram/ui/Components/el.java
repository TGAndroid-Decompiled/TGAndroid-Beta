package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f23681a;
    public float f23682b;
    public float f23683c;

    public el(Context context, int i10) {
        super(context);
        this.f23681a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23681a) {
            case 0:
                return this.f23682b;
            default:
                return this.f23682b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23681a) {
            case 0:
                this.f23682b = f7;
                setTranslationY(this.f23683c + f7);
                return;
            default:
                this.f23682b = f7;
                setTranslationY(this.f23683c + f7);
                return;
        }
    }
}
