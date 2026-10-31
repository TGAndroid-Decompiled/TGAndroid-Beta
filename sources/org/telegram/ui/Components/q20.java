package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class q20 extends ImageView {
    public final int f29511a;
    public final int f29512b;
    public final Object f29513c;

    public q20(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f29511a = i11;
        this.f29513c = obj;
        this.f29512b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29511a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) this.f29513c;
                t80 t80Var = b10Var.f35938s;
                if (b10Var.f35937r) {
                    int i10 = this.f29512b / 2;
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
        switch (this.f29511a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.b40) ((kg.e1) this.f29513c).d).f29803i1.x(this.f29512b, true);
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
        switch (this.f29511a) {
            case 1:
                if (drawable != ((org.telegram.ui.b10) this.f29513c).f35938s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
