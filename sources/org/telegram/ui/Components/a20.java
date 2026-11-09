package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class a20 extends ImageView {
    public final int f31681a;
    public final int f31682b;
    public final Object f31683c;

    public a20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f31681a = i10;
        this.f31683c = obj;
        this.f31682b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f31681a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) this.f31683c;
                b80 b80Var = c00Var.f44178s;
                if (c00Var.f44177r) {
                    int i7 = this.f31682b / 2;
                    b80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    b80Var.draw(canvas);
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
        switch (this.f31681a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.e30) ((b20) this.f31683c).d).f32497i1.x(this.f31682b, true);
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
        switch (this.f31681a) {
            case 1:
                if (drawable != ((org.telegram.ui.c00) this.f31683c).f44178s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
