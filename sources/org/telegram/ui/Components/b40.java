package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class b40 extends ImageView {
    public final int f24863a;
    public final int f24864b;
    public final Object f24865c;

    public b40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f24863a = i11;
        this.f24865c = obj;
        this.f24864b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24863a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) this.f24865c;
                ja0 ja0Var = y10Var.f44254s;
                if (y10Var.f44253r) {
                    int i10 = this.f24864b / 2;
                    ja0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ja0Var.draw(canvas);
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
        switch (this.f24863a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((c40) this.f24865c).f25176c.f25541b.x(this.f24864b, true);
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
        switch (this.f24863a) {
            case 1:
                if (drawable != ((org.telegram.ui.y10) this.f24865c).f44254s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
