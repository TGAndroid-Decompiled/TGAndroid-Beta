package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class m30 extends ImageView {
    public final int f28917a;
    public final int f28918b;
    public final Object f28919c;

    public m30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28917a = i11;
        this.f28919c = obj;
        this.f28918b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28917a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.w10 w10Var = (org.telegram.ui.w10) this.f28919c;
                k90 k90Var = w10Var.f42346s;
                if (w10Var.f42345r) {
                    int i10 = this.f28918b / 2;
                    k90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    k90Var.draw(canvas);
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
        switch (this.f28917a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((n30) this.f28919c).f29386c.f29660b.x(this.f28918b, true);
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
        switch (this.f28917a) {
            case 1:
                if (drawable != ((org.telegram.ui.w10) this.f28919c).f42346s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
