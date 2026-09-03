package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class yk extends TextView {
    public final int f31042a;
    public float f31043b;
    public float f31044c;

    public yk(Context context, int i10) {
        super(context);
        this.f31042a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31042a) {
            case 0:
                return this.f31043b;
            default:
                return this.f31043b;
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f31042a) {
            case 0:
                this.f31043b = f10;
                setTranslationY(this.f31044c + f10);
                return;
            default:
                this.f31043b = f10;
                setTranslationY(this.f31044c + f10);
                return;
        }
    }
}
