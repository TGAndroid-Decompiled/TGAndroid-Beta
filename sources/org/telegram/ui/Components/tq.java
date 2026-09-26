package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class tq extends Drawable {
    public final Paint f28594a = new Paint(1);

    public tq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.u2(this, 7));
            if (view.isAttachedToWindow()) {
                view.post(new zp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f28594a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28594a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
