package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class b40 extends ImageView {
    public final int f24905a;
    public final int f24906b;
    public final Object f24907c;

    public b40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f24905a = i11;
        this.f24907c = obj;
        this.f24906b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24905a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.x10 x10Var = (org.telegram.ui.x10) this.f24907c;
                ia0 ia0Var = x10Var.f43969s;
                if (x10Var.f43968r) {
                    int i10 = this.f24906b / 2;
                    ia0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ia0Var.draw(canvas);
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
        switch (this.f24905a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((c40) this.f24907c).f25214c.f25603b.x(this.f24906b, true);
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
        switch (this.f24905a) {
            case 1:
                if (drawable != ((org.telegram.ui.x10) this.f24907c).f43969s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
