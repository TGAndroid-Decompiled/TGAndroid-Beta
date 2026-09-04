package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f27328a;
    public final int f27329b;
    public final Object f27330c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f27328a = i11;
        this.f27330c = obj;
        this.f27329b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27328a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f27330c;
                h90 h90Var = a20Var.f34302s;
                if (a20Var.f34301r) {
                    int i10 = this.f27329b / 2;
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
        switch (this.f27328a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f27330c).f27681c.f28036b.x(this.f27329b, true);
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
        switch (this.f27328a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f27330c).f34302s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
