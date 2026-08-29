package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class lq extends Drawable {
    public final Paint f30413a = new Paint(1);

    public lq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new df.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new rp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f30413a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30413a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
