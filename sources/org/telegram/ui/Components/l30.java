package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class l30 extends ImageView {
    public final int f26556a;
    public final int f26557b;
    public final Object f26558c;

    public l30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26556a = i11;
        this.f26558c = obj;
        this.f26557b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26556a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.x10 x10Var = (org.telegram.ui.x10) this.f26558c;
                j90 j90Var = x10Var.f39823s;
                if (x10Var.f39822r) {
                    int i10 = this.f26557b / 2;
                    j90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    j90Var.draw(canvas);
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
        switch (this.f26556a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((m30) this.f26558c).f26949c.f27179b.x(this.f26557b, true);
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
        switch (this.f26556a) {
            case 1:
                if (drawable != ((org.telegram.ui.x10) this.f26558c).f39823s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
