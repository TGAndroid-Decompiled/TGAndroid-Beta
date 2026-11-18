package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
public final class j20 extends ImageView {
    public final int f36301a;
    public final int f36302b;
    public final Object f36303c;

    public j20(Object obj, Context context, int i7, int i10) {
        super(context);
        this.f36301a = i10;
        this.f36303c = obj;
        this.f36302b = i7;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f36301a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) this.f36303c;
                o80 o80Var = f00Var.f47415s;
                if (f00Var.f47414r) {
                    int i7 = this.f36302b / 2;
                    o80Var.setBounds(i7, i7, getWidth() - i7, getHeight() - i7);
                    o80Var.draw(canvas);
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
        switch (this.f36301a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((org.telegram.ui.g30) ((k20) this.f36303c).d).f36984m1.x(this.f36302b, true);
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
        switch (this.f36301a) {
            case 1:
                if (drawable != ((org.telegram.ui.f00) this.f36303c).f47415s && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
