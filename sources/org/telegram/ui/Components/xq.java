package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class xq extends Drawable {
    public final Paint f29125a = new Paint(1);

    public xq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new l.d(this, 5));
            if (view.isAttachedToWindow()) {
                view.post(new dq(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f29125a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29125a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
