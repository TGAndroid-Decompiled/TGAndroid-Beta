package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29331a;
    public float f29332b;
    public float f29333c;

    public pl(Context context, int i10) {
        super(context);
        this.f29331a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29331a) {
            case 0:
                return this.f29332b;
            default:
                return this.f29332b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29331a) {
            case 0:
                this.f29332b = f7;
                setTranslationY(this.f29333c + f7);
                return;
            default:
                this.f29332b = f7;
                setTranslationY(this.f29333c + f7);
                return;
        }
    }
}
