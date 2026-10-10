package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vl extends TextView {
    public final int f31881a;
    public float f31882b;
    public float f31883c;

    public vl(Context context, int i10) {
        super(context);
        this.f31881a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31881a) {
            case 0:
                return this.f31882b;
            default:
                return this.f31882b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31881a) {
            case 0:
                this.f31882b = f7;
                setTranslationY(this.f31883c + f7);
                return;
            default:
                this.f31882b = f7;
                setTranslationY(this.f31883c + f7);
                return;
        }
    }
}
