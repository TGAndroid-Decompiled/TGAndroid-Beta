package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vk extends TextView {
    public final int f33400a;
    public float f33401b;
    public float f33402c;

    public vk(Context context, int i9) {
        super(context);
        this.f33400a = i9;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f33400a) {
            case 0:
                return this.f33401b;
            default:
                return this.f33401b;
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        switch (this.f33400a) {
            case 0:
                this.f33401b = f10;
                setTranslationY(this.f33402c + f10);
                return;
            default:
                this.f33401b = f10;
                setTranslationY(this.f33402c + f10);
                return;
        }
    }
}
