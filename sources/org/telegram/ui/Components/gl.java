package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class gl extends TextView {
    public final int f24519a;
    public float f24520b;
    public float f24521c;

    public gl(Context context, int i10) {
        super(context);
        this.f24519a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24519a) {
            case 0:
                return this.f24520b;
            default:
                return this.f24520b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24519a) {
            case 0:
                this.f24520b = f7;
                setTranslationY(this.f24521c + f7);
                return;
            default:
                this.f24520b = f7;
                setTranslationY(this.f24521c + f7);
                return;
        }
    }
}
