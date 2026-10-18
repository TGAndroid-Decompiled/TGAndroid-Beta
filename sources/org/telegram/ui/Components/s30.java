package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30184a;
    public final int f30185b;
    public final Object f30186c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30184a = i11;
        this.f30186c = obj;
        this.f30185b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30184a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.j10 j10Var = (org.telegram.ui.j10) this.f30186c;
                ba0 ba0Var = j10Var.f38028s;
                if (j10Var.f38027r) {
                    int i10 = this.f30185b / 2;
                    ba0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ba0Var.draw(canvas);
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
        switch (this.f30184a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30186c).f30463c.f30877b.x(this.f30185b, true);
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
        switch (this.f30184a) {
            case 1:
                if (drawable != ((org.telegram.ui.j10) this.f30186c).f38028s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
