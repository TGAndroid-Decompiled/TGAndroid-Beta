package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m30 extends ImageView {
    public final int f26265a;
    public final int f26266b;
    public final Object f26267c;

    public m30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26265a = i11;
        this.f26267c = obj;
        this.f26266b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26265a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f26267c;
                t90 t90Var = v10Var.f38595s;
                if (v10Var.f38594r) {
                    int i10 = this.f26266b / 2;
                    t90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    t90Var.draw(canvas);
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
        switch (this.f26265a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((n30) this.f26267c).f26682c.f26916b.x(this.f26266b, true);
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
        switch (this.f26265a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f26267c).f38595s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
