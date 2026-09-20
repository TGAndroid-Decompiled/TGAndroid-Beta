package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25212a;
    public final int f25213b;
    public final Object f25214c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25212a = i11;
        this.f25214c = obj;
        this.f25213b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25212a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f25214c;
                o90 o90Var = a20Var.f31959s;
                if (a20Var.f31958r) {
                    int i10 = this.f25213b / 2;
                    o90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    o90Var.draw(canvas);
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
        switch (this.f25212a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25214c).f25644c.f26006b.x(this.f25213b, true);
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
        switch (this.f25212a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f25214c).f31959s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
