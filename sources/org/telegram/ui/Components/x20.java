package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

public final class x20 extends ImageView {

    public final int f34446a;

    public final int f34447b;

    public final Object f34448c;

    public x20(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f34446a = i11;
        this.f34448c = obj;
        this.f34447b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f34446a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.k10 k10Var = (org.telegram.ui.k10) this.f34448c;
                t80 t80Var = k10Var.f39568s;
                if (k10Var.f39567r) {
                    int i10 = this.f34447b / 2;
                    t80Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    t80Var.draw(canvas);
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.f34446a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((y20) this.f34448c).f34792c.f35135b.x(this.f34447b, true);
                }
                break;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34446a) {
            case 1:
                return drawable == ((org.telegram.ui.k10) this.f34448c).f39568s || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
