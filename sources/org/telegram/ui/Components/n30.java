package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class n30 extends ImageView {
    public final int f28846a;
    public final int f28847b;
    public final Object f28848c;

    public n30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28846a = i11;
        this.f28848c = obj;
        this.f28847b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28846a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f28848c;
                u90 u90Var = z10Var.f43681s;
                if (z10Var.f43680r) {
                    int i10 = this.f28847b / 2;
                    u90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    u90Var.draw(canvas);
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
        switch (this.f28846a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((o30) this.f28848c).f29211c.f29491b.x(this.f28847b, true);
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
        switch (this.f28846a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f28848c).f43681s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
