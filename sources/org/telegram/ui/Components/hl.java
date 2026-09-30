package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class hl extends TextView {
    public final int f24882a;
    public float f24883b;
    public float f24884c;

    public hl(Context context, int i10) {
        super(context);
        this.f24882a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24882a) {
            case 0:
                return this.f24883b;
            default:
                return this.f24883b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24882a) {
            case 0:
                this.f24883b = f7;
                setTranslationY(this.f24884c + f7);
                return;
            default:
                this.f24883b = f7;
                setTranslationY(this.f24884c + f7);
                return;
        }
    }
}
