package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class q20 extends ImageView {
    public final int f29611a;
    public final int f29612b;
    public final Object f29613c;

    public q20(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f29611a = i11;
        this.f29613c = obj;
        this.f29612b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29611a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.f29613c;
                t80 t80Var = a10Var.f35522s;
                if (a10Var.f35521r) {
                    int i10 = this.f29612b / 2;
                    t80Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    t80Var.draw(canvas);
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
        switch (this.f29611a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.a40) ((kg.e1) this.f29613c).d).f29859i1.x(this.f29612b, true);
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
        switch (this.f29611a) {
            case 1:
                if (drawable != ((org.telegram.ui.a10) this.f29613c).f35522s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
