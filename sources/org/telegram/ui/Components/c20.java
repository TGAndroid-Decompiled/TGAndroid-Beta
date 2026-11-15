package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class c20 extends ImageView {
    public final int f33469a;
    public final int f33470b;
    public final Object f33471c;

    public c20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f33469a = i10;
        this.f33471c = obj;
        this.f33470b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33469a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) this.f33471c;
                d80 d80Var = c00Var.f45877s;
                if (c00Var.f45876r) {
                    int i7 = this.f33470b / 2;
                    d80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    d80Var.draw(canvas);
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
        switch (this.f33469a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.d30) ((d20) this.f33471c).d).f34165m1.x(this.f33470b, true);
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
        switch (this.f33469a) {
            case 1:
                if (drawable != ((org.telegram.ui.c00) this.f33471c).f45877s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
