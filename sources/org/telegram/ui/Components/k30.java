package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class k30 extends ImageView {
    public final int f26139a;
    public final int f26140b;
    public final Object f26141c;

    public k30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26139a = i11;
        this.f26141c = obj;
        this.f26140b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26139a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f26141c;
                i90 i90Var = v10Var.f39057s;
                if (v10Var.f39056r) {
                    int i10 = this.f26140b / 2;
                    i90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    i90Var.draw(canvas);
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
        switch (this.f26139a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((l30) this.f26141c).f26542c.f26930b.x(this.f26140b, true);
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
        switch (this.f26139a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f26141c).f39057s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
