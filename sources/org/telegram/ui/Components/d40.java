package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class d40 extends ImageView {
    public final int f25227a;
    public final int f25228b;
    public final Object f25229c;

    public d40(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25227a = i11;
        this.f25229c = obj;
        this.f25228b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25227a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) this.f25229c;
                ma0 ma0Var = a20Var.f35677s;
                if (a20Var.f35676r) {
                    int i10 = this.f25228b / 2;
                    ma0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ma0Var.draw(canvas);
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
        switch (this.f25227a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((e40) this.f25229c).f25593c.f25885b.x(this.f25228b, true);
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
        switch (this.f25227a) {
            case 1:
                if (drawable != ((org.telegram.ui.a20) this.f25229c).f35677s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
