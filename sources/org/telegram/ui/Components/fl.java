package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class fl extends TextView {
    public final int f23999a;
    public float f24000b;
    public float f24001c;

    public fl(Context context, int i10) {
        super(context);
        this.f23999a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f23999a) {
            case 0:
                return this.f24000b;
            default:
                return this.f24000b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f23999a) {
            case 0:
                this.f24000b = f7;
                setTranslationY(this.f24001c + f7);
                return;
            default:
                this.f24000b = f7;
                setTranslationY(this.f24001c + f7);
                return;
        }
    }
}
