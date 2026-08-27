package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class fq extends Drawable {

    public final Paint f28431a = new Paint(1);

    public fq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new bf.b(this, 11));
            if (view.isAttachedToWindow()) {
                view.post(new lp(this, 1));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
        this.f28431a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28431a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
