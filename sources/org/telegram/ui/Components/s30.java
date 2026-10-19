package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30159a;
    public final int f30160b;
    public final Object f30161c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30159a = i11;
        this.f30161c = obj;
        this.f30160b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30159a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.h10 h10Var = (org.telegram.ui.h10) this.f30161c;
                ba0 ba0Var = h10Var.f37454s;
                if (h10Var.f37453r) {
                    int i10 = this.f30160b / 2;
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
        switch (this.f30159a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30161c).f30412c.f30873b.x(this.f30160b, true);
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
        switch (this.f30159a) {
            case 1:
                if (drawable != ((org.telegram.ui.h10) this.f30161c).f37454s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
