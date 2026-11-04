package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class v10 extends ImageView {
    public final int f38953a;
    public final int f38954b;
    public final Object f38955c;

    public v10(Object obj, Context context, int i3, int i10) {
        super(context);
        this.f38953a = i10;
        this.f38955c = obj;
        this.f38954b = i3;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38953a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) this.f38955c;
                w70 w70Var = yzVar.f52461s;
                if (yzVar.f52460r) {
                    int i3 = this.f38954b / 2;
                    w70Var.setBounds(i3, i3, getWidth() - i3, getHeight() - i3);
                    w70Var.draw(canvas);
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
        switch (this.f38953a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.x20) ((w10) this.f38955c).d).f40192j1.x(this.f38954b, true);
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
        switch (this.f38953a) {
            case 1:
                if (drawable != ((org.telegram.ui.yz) this.f38955c).f52461s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
