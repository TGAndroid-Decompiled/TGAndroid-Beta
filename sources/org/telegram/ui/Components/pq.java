package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class pq extends Drawable {
    public final Paint f27967a = new Paint(1);

    public pq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new ff.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new vp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f27967a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27967a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
