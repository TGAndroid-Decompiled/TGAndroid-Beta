package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m30 extends ImageView {
    public final int f26264a;
    public final int f26265b;
    public final Object f26266c;

    public m30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f26264a = i11;
        this.f26266c = obj;
        this.f26265b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f26264a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.v10 v10Var = (org.telegram.ui.v10) this.f26266c;
                t90 t90Var = v10Var.f38595s;
                if (v10Var.f38594r) {
                    int i10 = this.f26265b / 2;
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
        switch (this.f26264a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((n30) this.f26266c).f26681c.f26915b.x(this.f26265b, true);
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
        switch (this.f26264a) {
            case 1:
                if (drawable != ((org.telegram.ui.v10) this.f26266c).f38595s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
