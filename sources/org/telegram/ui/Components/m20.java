package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m20 extends ImageView {
    public final int f37390a;
    public final int f37391b;
    public final Object f37392c;

    public m20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f37390a = i10;
        this.f37392c = obj;
        this.f37391b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37390a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) this.f37392c;
                q80 q80Var = f00Var.f47444s;
                if (f00Var.f47443r) {
                    int i7 = this.f37391b / 2;
                    q80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    q80Var.draw(canvas);
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
        switch (this.f37390a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.g30) ((n20) this.f37392c).d).f38062m1.x(this.f37391b, true);
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
        switch (this.f37390a) {
            case 1:
                if (drawable != ((org.telegram.ui.f00) this.f37392c).f47444s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
