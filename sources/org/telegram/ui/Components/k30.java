package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class k30 extends ImageView {
    public final int f25496a;
    public final int f25497b;
    public final Object f25498c;

    public k30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25496a = i11;
        this.f25498c = obj;
        this.f25497b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25496a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.x10 x10Var = (org.telegram.ui.x10) this.f25498c;
                h90 h90Var = x10Var.f39150s;
                if (x10Var.f39149r) {
                    int i10 = this.f25497b / 2;
                    h90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    h90Var.draw(canvas);
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
        switch (this.f25496a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((l30) this.f25498c).f25801c.f26081b.x(this.f25497b, true);
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
        switch (this.f25496a) {
            case 1:
                if (drawable != ((org.telegram.ui.x10) this.f25498c).f39150s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
