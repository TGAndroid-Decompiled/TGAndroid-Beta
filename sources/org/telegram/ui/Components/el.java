package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class el extends TextView {
    public final int f23962a;
    public float f23963b;
    public float f23964c;

    public el(Context context, int i10) {
        super(context);
        this.f23962a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23962a) {
            case 0:
                return this.f23963b;
            default:
                return this.f23963b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23962a) {
            case 0:
                this.f23963b = f7;
                setTranslationY(this.f23964c + f7);
                return;
            default:
                this.f23963b = f7;
                setTranslationY(this.f23964c + f7);
                return;
        }
    }
}
