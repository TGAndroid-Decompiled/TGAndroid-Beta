package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class al extends TextView {
    public final int f25271a;
    public float f25272b;
    public float f25273c;

    public al(Context context, int i10) {
        super(context);
        this.f25271a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25271a) {
            case 0:
                return this.f25272b;
            default:
                return this.f25272b;
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f25271a) {
            case 0:
                this.f25272b = f10;
                setTranslationY(this.f25273c + f10);
                return;
            default:
                this.f25272b = f10;
                setTranslationY(this.f25273c + f10);
                return;
        }
    }
}
