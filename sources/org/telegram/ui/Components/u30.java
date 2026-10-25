package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class u30 extends ImageView {
    public final int f33231a;
    public final int f33232b;
    public final Object f33233c;

    public u30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f33231a = i11;
        this.f33233c = obj;
        this.f33232b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33231a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.l10 l10Var = (org.telegram.ui.l10) this.f33233c;
                da0 da0Var = l10Var.f41104s;
                if (l10Var.f41103r) {
                    int i10 = this.f33232b / 2;
                    da0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    da0Var.draw(canvas);
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
        switch (this.f33231a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((v30) this.f33233c).f33558c.f34349b.x(this.f33232b, true);
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
        switch (this.f33231a) {
            case 1:
                if (drawable != ((org.telegram.ui.l10) this.f33233c).f41104s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
