package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class d40 extends ImageView {
    public final int f25235a;
    public final int f25236b;
    public final Object f25237c;

    public d40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25235a = i11;
        this.f25237c = obj;
        this.f25236b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25235a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f25237c;
                ma0 ma0Var = a20Var.f35675s;
                if (a20Var.f35674r) {
                    int i10 = this.f25236b / 2;
                    ma0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ma0Var.draw(canvas);
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
        switch (this.f25235a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((e40) this.f25237c).f25588c.f25883b.x(this.f25236b, true);
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
        switch (this.f25235a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f25237c).f35675s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
