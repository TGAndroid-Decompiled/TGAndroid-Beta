package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29332a;
    public float f29333b;
    public float f29334c;

    public pl(Context context, int i10) {
        super(context);
        this.f29332a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29332a) {
            case 0:
                return this.f29333b;
            default:
                return this.f29333b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29332a) {
            case 0:
                this.f29333b = f7;
                setTranslationY(this.f29334c + f7);
                return;
            default:
                this.f29333b = f7;
                setTranslationY(this.f29334c + f7);
                return;
        }
    }
}
