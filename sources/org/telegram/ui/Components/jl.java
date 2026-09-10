package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class jl extends TextView {
    public final int f24435a;
    public float f24436b;
    public float f24437c;

    public jl(Context context, int i10) {
        super(context);
        this.f24435a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24435a) {
            case 0:
                return this.f24436b;
            default:
                return this.f24436b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24435a) {
            case 0:
                this.f24436b = f7;
                setTranslationY(this.f24437c + f7);
                return;
            default:
                this.f24436b = f7;
                setTranslationY(this.f24437c + f7);
                return;
        }
    }
}
