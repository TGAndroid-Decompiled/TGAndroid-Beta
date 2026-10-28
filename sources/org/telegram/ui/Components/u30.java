package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class u30 extends ImageView {
    public final int f33216a;
    public final int f33217b;
    public final Object f33218c;

    public u30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f33216a = i11;
        this.f33218c = obj;
        this.f33217b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33216a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.n10 n10Var = (org.telegram.ui.n10) this.f33218c;
                ea0 ea0Var = n10Var.f41604s;
                if (n10Var.f41603r) {
                    int i10 = this.f33217b / 2;
                    ea0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ea0Var.draw(canvas);
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
        switch (this.f33216a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((v30) this.f33218c).f33550c.f34435b.x(this.f33217b, true);
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
        switch (this.f33216a) {
            case 1:
                if (drawable != ((org.telegram.ui.n10) this.f33218c).f41604s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
