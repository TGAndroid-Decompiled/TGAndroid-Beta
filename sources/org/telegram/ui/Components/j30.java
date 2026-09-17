package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f27356a;
    public final int f27357b;
    public final Object f27358c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f27356a = i11;
        this.f27358c = obj;
        this.f27357b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27356a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f27358c;
                h90 h90Var = a20Var.f34330s;
                if (a20Var.f34329r) {
                    int i10 = this.f27357b / 2;
                    h90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    h90Var.draw(canvas);
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
        switch (this.f27356a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f27358c).f27709c.f28064b.x(this.f27357b, true);
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
        switch (this.f27356a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f27358c).f34330s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
