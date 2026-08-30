package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class yk extends TextView {
    public final int f31038a;
    public float f31039b;
    public float f31040c;

    public yk(Context context, int i10) {
        super(context);
        this.f31038a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31038a) {
            case 0:
                return this.f31039b;
            default:
                return this.f31039b;
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f31038a) {
            case 0:
                this.f31039b = f10;
                setTranslationY(this.f31040c + f10);
                return;
            default:
                this.f31039b = f10;
                setTranslationY(this.f31040c + f10);
                return;
        }
    }
}
