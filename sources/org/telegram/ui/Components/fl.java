package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class fl extends TextView {
    public final int f24206a;
    public float f24207b;
    public float f24208c;

    public fl(Context context, int i10) {
        super(context);
        this.f24206a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24206a) {
            case 0:
                return this.f24207b;
            default:
                return this.f24207b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24206a) {
            case 0:
                this.f24207b = f7;
                setTranslationY(this.f24208c + f7);
                return;
            default:
                this.f24207b = f7;
                setTranslationY(this.f24208c + f7);
                return;
        }
    }
}
