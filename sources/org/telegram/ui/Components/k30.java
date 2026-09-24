package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class k30 extends ImageView {
    public final int f25610a;
    public final int f25611b;
    public final Object f25612c;

    public k30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25610a = i11;
        this.f25612c = obj;
        this.f25611b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25610a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f25612c;
                r90 r90Var = v10Var.f38579s;
                if (v10Var.f38578r) {
                    int i10 = this.f25611b / 2;
                    r90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    r90Var.draw(canvas);
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
        switch (this.f25610a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((l30) this.f25612c).f26007c.f26338b.x(this.f25611b, true);
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
        switch (this.f25610a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f25612c).f38579s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
