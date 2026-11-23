package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ht extends ShapeDrawable {
    public final int f35918a = 1;
    public final EditTextBoldCursor f35919b;

    public ht(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f35919b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f35918a) {
            case 0:
                super.draw(canvas);
                this.f35919b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f35919b;
                if (editTextBoldCursor.f32914e1) {
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
        switch (this.f35918a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35919b.f32923j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f35918a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35919b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ht(EditTextBoldCursor editTextBoldCursor) {
        this.f35919b = editTextBoldCursor;
    }
}
