package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class z10 extends ImageView {
    public final int f40803a;
    public final int f40804b;
    public final Object f40805c;

    public z10(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f40803a = i10;
        this.f40805c = obj;
        this.f40804b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40803a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) this.f40805c;
                a80 a80Var = a00Var.f43485s;
                if (a00Var.f43484r) {
                    int i7 = this.f40804b / 2;
                    a80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    a80Var.draw(canvas);
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
        switch (this.f40803a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.c30) ((a20) this.f40805c).d).f31981i1.x(this.f40804b, true);
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
        switch (this.f40803a) {
            case 1:
                if (drawable != ((org.telegram.ui.a00) this.f40805c).f43485s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
