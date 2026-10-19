package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29304a;
    public float f29305b;
    public float f29306c;

    public pl(Context context, int i10) {
        super(context);
        this.f29304a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29304a) {
            case 0:
                return this.f29305b;
            default:
                return this.f29305b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29304a) {
            case 0:
                this.f29305b = f7;
                setTranslationY(this.f29306c + f7);
                return;
            default:
                this.f29305b = f7;
                setTranslationY(this.f29306c + f7);
                return;
        }
    }
}
