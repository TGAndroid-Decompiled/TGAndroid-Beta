package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vl extends TextView {
    public final int f31833a;
    public float f31834b;
    public float f31835c;

    public vl(Context context, int i10) {
        super(context);
        this.f31833a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f31833a) {
            case 0:
                return this.f31834b;
            default:
                return this.f31834b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f31833a) {
            case 0:
                this.f31834b = f7;
                setTranslationY(this.f31835c + f7);
                return;
            default:
                this.f31834b = f7;
                setTranslationY(this.f31835c + f7);
                return;
        }
    }
}
