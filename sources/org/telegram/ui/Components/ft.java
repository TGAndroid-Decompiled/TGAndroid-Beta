package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ft extends ShapeDrawable {
    public final int f35195a = 1;
    public final EditTextBoldCursor f35196b;

    public ft(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f35196b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f35195a) {
            case 0:
                super.draw(canvas);
                this.f35196b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f35196b;
                if (editTextBoldCursor.f33012e1) {
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
        switch (this.f35195a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35196b.f33021j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f35195a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35196b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ft(EditTextBoldCursor editTextBoldCursor) {
        this.f35196b = editTextBoldCursor;
    }
}
