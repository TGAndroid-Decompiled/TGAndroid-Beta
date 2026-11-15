package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class zs extends ShapeDrawable {
    public final int f42419a = 1;
    public final EditTextBoldCursor f42420b;

    public zs(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f42420b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42419a) {
            case 0:
                super.draw(canvas);
                this.f42420b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f42420b;
                if (editTextBoldCursor.f32515e1) {
                    editTextBoldCursor.H0 = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f42419a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f42420b.f32524j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f42419a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f42420b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public zs(EditTextBoldCursor editTextBoldCursor) {
        this.f42420b = editTextBoldCursor;
    }
}
