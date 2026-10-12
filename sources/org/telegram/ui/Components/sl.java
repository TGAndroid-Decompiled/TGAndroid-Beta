package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class sl extends TextView {
    public final int f29152a;
    public float f29153b;
    public float f29154c;

    public sl(Context context, int i10) {
        super(context);
        this.f29152a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29152a) {
            case 0:
                return this.f29153b;
            default:
                return this.f29153b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29152a) {
            case 0:
                this.f29153b = f7;
                setTranslationY(this.f29154c + f7);
                return;
            default:
                this.f29153b = f7;
                setTranslationY(this.f29154c + f7);
                return;
        }
    }
}
