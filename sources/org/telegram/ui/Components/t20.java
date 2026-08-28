package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class t20 extends ImageView {
    public final int f32602a;
    public final int f32603b;
    public final Object f32604c;

    public t20(Object obj, Context context, int i9, int i10) {
        super(context);
        this.f32602a = i10;
        this.f32604c = obj;
        this.f32603b = i9;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32602a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.h10 h10Var = (org.telegram.ui.h10) this.f32604c;
                p80 p80Var = h10Var.f38645s;
                if (h10Var.f38644r) {
                    int i9 = this.f32603b / 2;
                    p80Var.setBounds(i9, i9, getWidth() - i9, getHeight() - i9);
                    p80Var.draw(canvas);
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
        switch (this.f32602a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((u20) this.f32604c).f32907c.f33239b.x(this.f32603b, true);
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
        switch (this.f32602a) {
            case 1:
                if (drawable != ((org.telegram.ui.h10) this.f32604c).f38645s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
