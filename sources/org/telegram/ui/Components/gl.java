package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class gl extends TextView {
    public final int f24567a;
    public float f24568b;
    public float f24569c;

    public gl(Context context, int i10) {
        super(context);
        this.f24567a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24567a) {
            case 0:
                return this.f24568b;
            default:
                return this.f24568b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24567a) {
            case 0:
                this.f24568b = f7;
                setTranslationY(this.f24569c + f7);
                return;
            default:
                this.f24568b = f7;
                setTranslationY(this.f24569c + f7);
                return;
        }
    }
}
