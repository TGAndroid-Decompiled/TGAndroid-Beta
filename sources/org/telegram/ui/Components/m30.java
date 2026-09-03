package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m30 extends ImageView {
    public final int f28964a;
    public final int f28965b;
    public final Object f28966c;

    public m30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28964a = i11;
        this.f28966c = obj;
        this.f28965b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28964a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f28966c;
                k90 k90Var = v10Var.f41984s;
                if (v10Var.f41983r) {
                    int i10 = this.f28965b / 2;
                    k90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    k90Var.draw(canvas);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.f28964a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((n30) this.f28966c).f29374c.f29650b.x(this.f28965b, true);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f28964a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f28966c).f41984s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
