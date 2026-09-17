package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f27329a;
    public final int f27330b;
    public final Object f27331c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f27329a = i11;
        this.f27331c = obj;
        this.f27330b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27329a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f27331c;
                h90 h90Var = a20Var.f34303s;
                if (a20Var.f34302r) {
                    int i10 = this.f27330b / 2;
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
        switch (this.f27329a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f27331c).f27682c.f28037b.x(this.f27330b, true);
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
        switch (this.f27329a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f27331c).f34303s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
