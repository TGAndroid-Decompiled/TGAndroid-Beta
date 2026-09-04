package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class qq extends Drawable {
    public final Paint f29797a = new Paint(1);

    public qq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.i2(this, 6));
            if (view.isAttachedToWindow()) {
                view.post(new wp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f29797a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29797a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
