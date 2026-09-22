package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25213a;
    public final int f25214b;
    public final Object f25215c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25213a = i11;
        this.f25215c = obj;
        this.f25214b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25213a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f25215c;
                g90 g90Var = z10Var.f40013s;
                if (z10Var.f40012r) {
                    int i10 = this.f25214b / 2;
                    g90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    g90Var.draw(canvas);
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
        switch (this.f25213a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25215c).f25531c.f25819b.x(this.f25214b, true);
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
        switch (this.f25213a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f25215c).f40013s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
