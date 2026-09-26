package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class l30 extends ImageView {
    public final int f25937a;
    public final int f25938b;
    public final Object f25939c;

    public l30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25937a = i11;
        this.f25939c = obj;
        this.f25938b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25937a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f25939c;
                s90 s90Var = v10Var.f38594s;
                if (v10Var.f38593r) {
                    int i10 = this.f25938b / 2;
                    s90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    s90Var.draw(canvas);
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
        switch (this.f25937a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((m30) this.f25939c).f26308c.f26657b.x(this.f25938b, true);
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
        switch (this.f25937a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f25939c).f38594s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
