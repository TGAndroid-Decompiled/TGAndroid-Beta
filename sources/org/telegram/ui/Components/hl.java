package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class hl extends TextView {
    public final int f27151a;
    public float f27152b;
    public float f27153c;

    public hl(Context context, int i10) {
        super(context);
        this.f27151a = i10;
    }

    @Override
    public final float getTranslationX() {
        switch (this.f27151a) {
            case 0:
                return this.f27152b;
            default:
                return this.f27152b;
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        switch (this.f27151a) {
            case 0:
                this.f27152b = f7;
                setTranslationY(this.f27153c + f7);
                return;
            default:
                this.f27152b = f7;
                setTranslationY(this.f27153c + f7);
                return;
        }
    }
}
