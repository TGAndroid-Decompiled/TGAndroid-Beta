package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class gl extends TextView {
    public final int f24566a;
    public float f24567b;
    public float f24568c;

    public gl(Context context, int i10) {
        super(context);
        this.f24566a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f24566a) {
            case 0:
                return this.f24567b;
            default:
                return this.f24567b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f24566a) {
            case 0:
                this.f24567b = f7;
                setTranslationY(this.f24568c + f7);
                return;
            default:
                this.f24567b = f7;
                setTranslationY(this.f24568c + f7);
                return;
        }
    }
}
