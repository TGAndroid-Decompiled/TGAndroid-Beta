package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m30 extends ImageView {
    public final int f26321a;
    public final int f26322b;
    public final Object f26323c;

    public m30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26321a = i11;
        this.f26323c = obj;
        this.f26322b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26321a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) this.f26323c;
                t90 t90Var = y10Var.f40088s;
                if (y10Var.f40087r) {
                    int i10 = this.f26322b / 2;
                    t90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    t90Var.draw(canvas);
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
        switch (this.f26321a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((n30) this.f26323c).f26724c.f26951b.x(this.f26322b, true);
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
        switch (this.f26321a) {
            case 1:
                if (drawable != ((org.telegram.ui.y10) this.f26323c).f40088s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
