package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class ql extends TextView {
    public final int f31947a;
    public float f31948b;
    public float f31949c;

    public ql(Context context, int i10) {
        super(context);
        this.f31947a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31947a) {
            case 0:
                return this.f31948b;
            default:
                return this.f31948b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31947a) {
            case 0:
                this.f31948b = f7;
                setTranslationY(this.f31949c + f7);
                return;
            default:
                this.f31948b = f7;
                setTranslationY(this.f31949c + f7);
                return;
        }
    }
}
