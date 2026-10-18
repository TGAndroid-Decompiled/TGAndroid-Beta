package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29339a;
    public float f29340b;
    public float f29341c;

    public pl(Context context, int i10) {
        super(context);
        this.f29339a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29339a) {
            case 0:
                return this.f29340b;
            default:
                return this.f29340b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29339a) {
            case 0:
                this.f29340b = f7;
                setTranslationY(this.f29341c + f7);
                return;
            default:
                this.f29340b = f7;
                setTranslationY(this.f29341c + f7);
                return;
        }
    }
}
