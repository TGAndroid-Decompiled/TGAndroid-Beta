package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class g30 extends ImageView {
    public final int f28739a;
    public final int f28740b;
    public final Object f28741c;

    public g30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f28739a = i11;
        this.f28741c = obj;
        this.f28740b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28739a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.j10 j10Var = (org.telegram.ui.j10) this.f28741c;
                c90 c90Var = j10Var.f39401s;
                if (j10Var.f39400r) {
                    int i10 = this.f28740b / 2;
                    c90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    c90Var.draw(canvas);
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
        switch (this.f28739a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((h30) this.f28741c).f29049c.f29306b.x(this.f28740b, true);
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
        switch (this.f28739a) {
            case 1:
                if (drawable != ((org.telegram.ui.j10) this.f28741c).f39401s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
