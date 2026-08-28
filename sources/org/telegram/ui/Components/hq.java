package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class hq extends Drawable {
    public final Paint f29171a = new Paint(1);

    public hq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new af.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new np(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i9) {
        this.f29171a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29171a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
