package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29585a;
    public float f29586b;
    public float f29587c;

    public pl(Context context, int i10) {
        super(context);
        this.f29585a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29585a) {
            case 0:
                return this.f29586b;
            default:
                return this.f29586b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29585a) {
            case 0:
                this.f29586b = f7;
                setTranslationY(this.f29587c + f7);
                return;
            default:
                this.f29586b = f7;
                setTranslationY(this.f29587c + f7);
                return;
        }
    }
}
