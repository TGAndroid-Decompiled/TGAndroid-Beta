package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25154a;
    public final int f25155b;
    public final Object f25156c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25154a = i11;
        this.f25156c = obj;
        this.f25155b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25154a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f25156c;
                p90 p90Var = a20Var.f31919s;
                if (a20Var.f31918r) {
                    int i10 = this.f25155b / 2;
                    p90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    p90Var.draw(canvas);
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
        switch (this.f25154a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25156c).f25573c.f26001b.x(this.f25155b, true);
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
        switch (this.f25154a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f25156c).f31919s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
