package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class k30 extends ImageView {
    public final int f25628a;
    public final int f25629b;
    public final Object f25630c;

    public k30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25628a = i11;
        this.f25630c = obj;
        this.f25629b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25628a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f25630c;
                r90 r90Var = v10Var.f38595s;
                if (v10Var.f38594r) {
                    int i10 = this.f25629b / 2;
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
        switch (this.f25628a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((l30) this.f25630c).f26014c.f26345b.x(this.f25629b, true);
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
        switch (this.f25628a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f25630c).f38595s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
