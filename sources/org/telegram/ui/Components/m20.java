package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m20 extends ImageView {
    public final int f37349a;
    public final int f37350b;
    public final Object f37351c;

    public m20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f37349a = i10;
        this.f37351c = obj;
        this.f37350b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37349a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) this.f37351c;
                q80 q80Var = f00Var.f47405s;
                if (f00Var.f47404r) {
                    int i7 = this.f37350b / 2;
                    q80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    q80Var.draw(canvas);
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
        switch (this.f37349a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.g30) ((n20) this.f37351c).d).f38028m1.x(this.f37350b, true);
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
        switch (this.f37349a) {
            case 1:
                if (drawable != ((org.telegram.ui.f00) this.f37351c).f47405s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
