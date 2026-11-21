package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m20 extends ImageView {
    public final int f37391a;
    public final int f37392b;
    public final Object f37393c;

    public m20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f37391a = i10;
        this.f37393c = obj;
        this.f37392b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37391a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) this.f37393c;
                q80 q80Var = f00Var.f47440s;
                if (f00Var.f47439r) {
                    int i7 = this.f37392b / 2;
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
        switch (this.f37391a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.g30) ((n20) this.f37393c).d).f38068m1.x(this.f37392b, true);
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
        switch (this.f37391a) {
            case 1:
                if (drawable != ((org.telegram.ui.f00) this.f37393c).f47440s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
