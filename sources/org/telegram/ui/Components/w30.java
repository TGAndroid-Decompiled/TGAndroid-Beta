package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class w30 extends ImageView {
    public final int f30459a;
    public final int f30460b;
    public final Object f30461c;

    public w30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30459a = i11;
        this.f30461c = obj;
        this.f30460b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30459a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.e20 e20Var = (org.telegram.ui.e20) this.f30461c;
                ha0 ha0Var = e20Var.f35183s;
                if (e20Var.f35182r) {
                    int i10 = this.f30460b / 2;
                    ha0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ha0Var.draw(canvas);
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
        switch (this.f30459a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((x30) this.f30461c).f30851c.f31128b.x(this.f30460b, true);
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
        switch (this.f30459a) {
            case 1:
                if (drawable != ((org.telegram.ui.e20) this.f30461c).f35183s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
