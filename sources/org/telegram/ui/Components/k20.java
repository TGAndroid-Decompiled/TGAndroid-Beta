package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class k20 extends ImageView {
    public final int f36606a;
    public final int f36607b;
    public final Object f36608c;

    public k20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f36606a = i10;
        this.f36608c = obj;
        this.f36607b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f36606a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) this.f36608c;
                n80 n80Var = e00Var.f47285s;
                if (e00Var.f47284r) {
                    int i7 = this.f36607b / 2;
                    n80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    n80Var.draw(canvas);
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
        switch (this.f36606a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.f30) ((l20) this.f36608c).d).f37351m1.x(this.f36607b, true);
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
        switch (this.f36606a) {
            case 1:
                if (drawable != ((org.telegram.ui.e00) this.f36608c).f47285s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
