package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class n30 extends ImageView {
    public final int f28955a;
    public final int f28956b;
    public final Object f28957c;

    public n30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28955a = i11;
        this.f28957c = obj;
        this.f28956b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28955a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f28957c;
                u90 u90Var = z10Var.f43682s;
                if (z10Var.f43681r) {
                    int i10 = this.f28956b / 2;
                    u90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    u90Var.draw(canvas);
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
        switch (this.f28955a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((o30) this.f28957c).f29327c.f29576b.x(this.f28956b, true);
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
        switch (this.f28955a) {
            case 1:
                if (drawable != ((org.telegram.ui.z10) this.f28957c).f43682s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
