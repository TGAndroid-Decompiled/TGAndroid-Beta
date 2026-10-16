package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class rl extends TextView {
    public final int f28563a;
    public float f28564b;
    public float f28565c;

    public rl(Context context, int i10) {
        super(context);
        this.f28563a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f28563a) {
            case 0:
                return this.f28564b;
            default:
                return this.f28564b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f28563a) {
            case 0:
                this.f28564b = f7;
                setTranslationY(this.f28565c + f7);
                return;
            default:
                this.f28564b = f7;
                setTranslationY(this.f28565c + f7);
                return;
        }
    }
}
