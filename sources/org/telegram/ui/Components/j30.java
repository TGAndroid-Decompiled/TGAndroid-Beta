package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25216a;
    public final int f25217b;
    public final Object f25218c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25216a = i11;
        this.f25218c = obj;
        this.f25217b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25216a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f25218c;
                g90 g90Var = z10Var.f40040s;
                if (z10Var.f40039r) {
                    int i10 = this.f25217b / 2;
                    g90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    g90Var.draw(canvas);
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
        switch (this.f25216a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25218c).f25534c.f25816b.x(this.f25217b, true);
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
        switch (this.f25216a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f25218c).f40040s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
