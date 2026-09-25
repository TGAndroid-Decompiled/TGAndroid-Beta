package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class fl extends TextView {
    public final int f24207a;
    public float f24208b;
    public float f24209c;

    public fl(Context context, int i10) {
        super(context);
        this.f24207a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24207a) {
            case 0:
                return this.f24208b;
            default:
                return this.f24208b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24207a) {
            case 0:
                this.f24208b = f7;
                setTranslationY(this.f24209c + f7);
                return;
            default:
                this.f24208b = f7;
                setTranslationY(this.f24209c + f7);
                return;
        }
    }
}
