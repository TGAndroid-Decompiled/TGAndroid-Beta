package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class n30 extends ImageView {
    public final int f26555a;
    public final int f26556b;
    public final Object f26557c;

    public n30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26555a = i11;
        this.f26557c = obj;
        this.f26556b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26555a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f26557c;
                u90 u90Var = v10Var.f38684s;
                if (v10Var.f38683r) {
                    int i10 = this.f26556b / 2;
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
        switch (this.f26555a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((o30) this.f26557c).f26969c.f27227b.x(this.f26556b, true);
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
        switch (this.f26555a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f26557c).f38684s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
