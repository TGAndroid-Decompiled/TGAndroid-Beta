package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class w30 extends ImageView {
    public final int f30784a;
    public final int f30785b;
    public final Object f30786c;

    public w30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30784a = i11;
        this.f30786c = obj;
        this.f30785b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30784a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.e20 e20Var = (org.telegram.ui.e20) this.f30786c;
                ha0 ha0Var = e20Var.f35445s;
                if (e20Var.f35444r) {
                    int i10 = this.f30785b / 2;
                    ha0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ha0Var.draw(canvas);
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
        switch (this.f30784a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((x30) this.f30786c).f31147c.f31466b.x(this.f30785b, true);
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
        switch (this.f30784a) {
            case 1:
                if (drawable != ((org.telegram.ui.e20) this.f30786c).f35445s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
