package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class zk extends TextView {
    public final int f35360a;
    public float f35361b;
    public float f35362c;

    public zk(Context context, int i10) {
        super(context);
        this.f35360a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f35360a) {
            case 0:
                return this.f35361b;
            default:
                return this.f35361b;
        }
    }

    @Override
    public final void setTranslationX(float f9) {
        switch (this.f35360a) {
            case 0:
                this.f35361b = f9;
                setTranslationY(this.f35362c + f9);
                return;
            default:
                this.f35361b = f9;
                setTranslationY(this.f35362c + f9);
                return;
        }
    }
}
