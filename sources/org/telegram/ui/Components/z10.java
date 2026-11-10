package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class z10 extends ImageView {
    public final int f40823a;
    public final int f40824b;
    public final Object f40825c;

    public z10(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f40823a = i10;
        this.f40825c = obj;
        this.f40824b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40823a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.d00 d00Var = (org.telegram.ui.d00) this.f40825c;
                a80 a80Var = d00Var.f44860s;
                if (d00Var.f44859r) {
                    int i7 = this.f40824b / 2;
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
        switch (this.f40823a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.f30) ((a20) this.f40825c).d).l1.x(this.f40824b, true);
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
        switch (this.f40823a) {
            case 1:
                if (drawable != ((org.telegram.ui.d00) this.f40825c).f44860s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
