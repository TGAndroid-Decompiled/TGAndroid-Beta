package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class n30 extends ImageView {
    public final int f28847a;
    public final int f28848b;
    public final Object f28849c;

    public n30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28847a = i11;
        this.f28849c = obj;
        this.f28848b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28847a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f28849c;
                u90 u90Var = z10Var.f43682s;
                if (z10Var.f43681r) {
                    int i10 = this.f28848b / 2;
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
        switch (this.f28847a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((o30) this.f28849c).f29212c.f29492b.x(this.f28848b, true);
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
        switch (this.f28847a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f28849c).f43682s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
