package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30162a;
    public final int f30163b;
    public final Object f30164c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30162a = i11;
        this.f30164c = obj;
        this.f30163b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30162a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.h10 h10Var = (org.telegram.ui.h10) this.f30164c;
                ba0 ba0Var = h10Var.f37480s;
                if (h10Var.f37479r) {
                    int i10 = this.f30163b / 2;
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
        switch (this.f30162a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30164c).f30414c.f30875b.x(this.f30163b, true);
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
        switch (this.f30162a) {
            case 1:
                if (drawable != ((org.telegram.ui.h10) this.f30164c).f37480s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
