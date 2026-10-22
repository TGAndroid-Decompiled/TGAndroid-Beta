package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30177a;
    public final int f30178b;
    public final Object f30179c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30177a = i11;
        this.f30179c = obj;
        this.f30178b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30177a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.h10 h10Var = (org.telegram.ui.h10) this.f30179c;
                ba0 ba0Var = h10Var.f37464s;
                if (h10Var.f37463r) {
                    int i10 = this.f30178b / 2;
                    ba0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ba0Var.draw(canvas);
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
        switch (this.f30177a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30179c).f30429c.f30834b.x(this.f30178b, true);
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
        switch (this.f30177a) {
            case 1:
                if (drawable != ((org.telegram.ui.h10) this.f30179c).f37464s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
