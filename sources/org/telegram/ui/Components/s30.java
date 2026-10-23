package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class s30 extends ImageView {
    public final int f30366a;
    public final int f30367b;
    public final Object f30368c;

    public s30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.f30366a = i11;
        this.f30368c = obj;
        this.f30367b = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30366a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.l10 l10Var = (org.telegram.ui.l10) this.f30368c;
                ca0 ca0Var = l10Var.f39113s;
                if (l10Var.f39112r) {
                    int i10 = this.f30367b / 2;
                    ca0Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    ca0Var.draw(canvas);
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
        switch (this.f30366a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((t30) this.f30368c).f30630c.f31069b.x(this.f30367b, true);
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
        switch (this.f30366a) {
            case 1:
                if (drawable != ((org.telegram.ui.l10) this.f30368c).f39113s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
