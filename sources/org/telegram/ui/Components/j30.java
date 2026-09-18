package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j30 extends ImageView {
    public final int f25102a;
    public final int f25103b;
    public final Object f25104c;

    public j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f25102a = i11;
        this.f25104c = obj;
        this.f25103b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25102a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.f25104c;
                g90 g90Var = b20Var.f32036s;
                if (b20Var.f32035r) {
                    int i10 = this.f25103b / 2;
                    g90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    g90Var.draw(canvas);
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
        switch (this.f25102a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.f25104c).f25557c.f25811b.x(this.f25103b, true);
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
        switch (this.f25102a) {
            case 1:
                if (drawable != ((org.telegram.ui.b20) this.f25104c).f32036s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
