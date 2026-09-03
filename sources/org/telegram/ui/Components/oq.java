package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class oq extends Drawable {
    public final Paint f27627a = new Paint(1);

    public oq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new ef.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new up(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f27627a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27627a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
