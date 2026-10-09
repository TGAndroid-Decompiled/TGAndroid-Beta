package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class a40 extends ImageView {
    public final int f24595a;
    public final int f24596b;
    public final Object f24597c;

    public a40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f24595a = i11;
        this.f24597c = obj;
        this.f24596b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24595a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) this.f24597c;
                ia0 ia0Var = y10Var.f44210s;
                if (y10Var.f44209r) {
                    int i10 = this.f24596b / 2;
                    ia0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ia0Var.draw(canvas);
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
        switch (this.f24595a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((b40) this.f24597c).f24890c.f25230b.x(this.f24596b, true);
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
        switch (this.f24595a) {
            case 1:
                if (drawable != ((org.telegram.ui.y10) this.f24597c).f44210s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
