package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class gl extends TextView {
    public final int f24568a;
    public float f24569b;
    public float f24570c;

    public gl(Context context, int i10) {
        super(context);
        this.f24568a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24568a) {
            case 0:
                return this.f24569b;
            default:
                return this.f24569b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24568a) {
            case 0:
                this.f24569b = f7;
                setTranslationY(this.f24570c + f7);
                return;
            default:
                this.f24569b = f7;
                setTranslationY(this.f24570c + f7);
                return;
        }
    }
}
