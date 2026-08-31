package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class al extends TextView {
    public final int f25282a;
    public float f25283b;
    public float f25284c;

    public al(Context context, int i10) {
        super(context);
        this.f25282a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f25282a) {
            case 0:
                return this.f25283b;
            default:
                return this.f25283b;
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f25282a) {
            case 0:
                this.f25283b = f10;
                setTranslationY(this.f25284c + f10);
                return;
            default:
                this.f25283b = f10;
                setTranslationY(this.f25284c + f10);
                return;
        }
    }
}
