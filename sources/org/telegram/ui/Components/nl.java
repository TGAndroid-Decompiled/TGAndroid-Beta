package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class nl extends TextView {
    public final int f28961a;
    public float f28962b;
    public float f28963c;

    public nl(Context context, int i10) {
        super(context);
        this.f28961a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f28961a) {
            case 0:
                return this.f28962b;
            default:
                return this.f28962b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f28961a) {
            case 0:
                this.f28962b = f7;
                setTranslationY(this.f28963c + f7);
                return;
            default:
                this.f28962b = f7;
                setTranslationY(this.f28963c + f7);
                return;
        }
    }
}
