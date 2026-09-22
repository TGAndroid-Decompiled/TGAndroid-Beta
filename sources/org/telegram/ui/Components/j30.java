package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25266a;
    public final int f25267b;
    public final Object f25268c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25266a = i11;
        this.f25268c = obj;
        this.f25267b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25266a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f25268c;
                r90 r90Var = a20Var.f31980s;
                if (a20Var.f31979r) {
                    int i10 = this.f25267b / 2;
                    r90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    r90Var.draw(canvas);
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
        switch (this.f25266a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25268c).f25616c.f25975b.x(this.f25267b, true);
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
        switch (this.f25266a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f25268c).f31980s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
