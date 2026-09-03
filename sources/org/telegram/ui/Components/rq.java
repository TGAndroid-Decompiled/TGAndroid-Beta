package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class rq extends Drawable {
    public final Paint f30869a = new Paint(1);

    public rq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new ff.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new xp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f30869a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30869a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
