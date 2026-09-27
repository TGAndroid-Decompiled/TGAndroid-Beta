package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class gl extends TextView {
    public final int f24593a;
    public float f24594b;
    public float f24595c;

    public gl(Context context, int i10) {
        super(context);
        this.f24593a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24593a) {
            case 0:
                return this.f24594b;
            default:
                return this.f24594b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24593a) {
            case 0:
                this.f24594b = f7;
                setTranslationY(this.f24595c + f7);
                return;
            default:
                this.f24594b = f7;
                setTranslationY(this.f24595c + f7);
                return;
        }
    }
}
