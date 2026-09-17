package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25099a;
    public final int f25100b;
    public final Object f25101c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25099a = i11;
        this.f25101c = obj;
        this.f25100b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25099a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.f25101c;
                g90 g90Var = b20Var.f32032s;
                if (b20Var.f32031r) {
                    int i10 = this.f25100b / 2;
                    g90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    g90Var.draw(canvas);
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
        switch (this.f25099a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25101c).f25554c.f25808b.x(this.f25100b, true);
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
        switch (this.f25099a) {
            case 1:
                if (drawable != ((org.telegram.ui.b20) this.f25101c).f32032s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
