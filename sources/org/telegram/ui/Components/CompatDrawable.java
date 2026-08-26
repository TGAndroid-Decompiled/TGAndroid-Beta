package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.AvatarSpan;

public abstract class CompatDrawable extends Drawable {
    public final Paint paint = new Paint(1);

    public CompatDrawable(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 7));
            if (view.isAttachedToWindow()) {
                view.post(new Bulletin$2$$ExternalSyntheticLambda1(this, 23));
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedToWindow() {
    }

    @Override
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
