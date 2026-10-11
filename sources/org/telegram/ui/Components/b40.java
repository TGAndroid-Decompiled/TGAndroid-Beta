package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class b40 extends ImageView {
    public final int f24846a;
    public final int f24847b;
    public final Object f24848c;

    public b40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f24846a = i11;
        this.f24848c = obj;
        this.f24847b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24846a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.x10 x10Var = (org.telegram.ui.x10) this.f24848c;
                ja0 ja0Var = x10Var.f43935s;
                if (x10Var.f43934r) {
                    int i10 = this.f24847b / 2;
                    ja0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ja0Var.draw(canvas);
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
        switch (this.f24846a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((c40) this.f24848c).f25117c.f25426b.x(this.f24847b, true);
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
        switch (this.f24846a) {
            case 1:
                if (drawable != ((org.telegram.ui.x10) this.f24848c).f43935s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
