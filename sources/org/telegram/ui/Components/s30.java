package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30174a;
    public final int f30175b;
    public final Object f30176c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30174a = i11;
        this.f30176c = obj;
        this.f30175b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30174a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.h10 h10Var = (org.telegram.ui.h10) this.f30176c;
                ba0 ba0Var = h10Var.f37461s;
                if (h10Var.f37460r) {
                    int i10 = this.f30175b / 2;
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
        switch (this.f30174a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30176c).f30426c.f30831b.x(this.f30175b, true);
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
        switch (this.f30174a) {
            case 1:
                if (drawable != ((org.telegram.ui.h10) this.f30176c).f37461s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
