package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class n30 extends ImageView {
    public final int f28852a;
    public final int f28853b;
    public final Object f28854c;

    public n30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28852a = i11;
        this.f28854c = obj;
        this.f28853b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28852a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f28854c;
                u90 u90Var = z10Var.f43689s;
                if (z10Var.f43688r) {
                    int i10 = this.f28853b / 2;
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
        switch (this.f28852a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((o30) this.f28854c).f29217c.f29497b.x(this.f28853b, true);
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
        switch (this.f28852a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f28854c).f43689s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
