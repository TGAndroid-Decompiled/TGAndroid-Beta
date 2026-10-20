package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class pl extends TextView {
    public final int f29327a;
    public float f29328b;
    public float f29329c;

    public pl(Context context, int i10) {
        super(context);
        this.f29327a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f29327a) {
            case 0:
                return this.f29328b;
            default:
                return this.f29328b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f29327a) {
            case 0:
                this.f29328b = f7;
                setTranslationY(this.f29329c + f7);
                return;
            default:
                this.f29328b = f7;
                setTranslationY(this.f29329c + f7);
                return;
        }
    }
}
