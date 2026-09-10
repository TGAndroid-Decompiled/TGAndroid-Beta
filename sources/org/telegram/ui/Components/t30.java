package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class t30 extends ImageView {
    public final int f27301a;
    public final int f27302b;
    public final Object f27303c;

    public t30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f27301a = i11;
        this.f27303c = obj;
        this.f27302b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27301a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.f27303c;
                q90 q90Var = b20Var.f31139s;
                if (b20Var.f31138r) {
                    int i10 = this.f27302b / 2;
                    q90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    q90Var.draw(canvas);
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
        switch (this.f27301a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((u30) this.f27303c).f27557c.f27806b.x(this.f27302b, true);
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
        switch (this.f27301a) {
            case 1:
                if (drawable != ((org.telegram.ui.b20) this.f27303c).f31139s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
