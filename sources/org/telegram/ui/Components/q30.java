package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class q30 extends ImageView {
    public final int f29780a;
    public final int f29781b;
    public final Object f29782c;

    public q30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f29780a = i11;
        this.f29782c = obj;
        this.f29781b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29780a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.l10 l10Var = (org.telegram.ui.l10) this.f29782c;
                aa0 aa0Var = l10Var.f39098s;
                if (l10Var.f39097r) {
                    int i10 = this.f29781b / 2;
                    aa0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    aa0Var.draw(canvas);
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
        switch (this.f29780a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((r30) this.f29782c).f30055c.f30429b.x(this.f29781b, true);
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
        switch (this.f29780a) {
            case 1:
                if (drawable != ((org.telegram.ui.l10) this.f29782c).f39098s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
