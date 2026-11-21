package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ht extends ShapeDrawable {
    public final int f35970a = 1;
    public final EditTextBoldCursor f35971b;

    public ht(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f35971b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f35970a) {
            case 0:
                super.draw(canvas);
                this.f35971b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f35971b;
                if (editTextBoldCursor.f32945e1) {
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
        switch (this.f35970a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35971b.f32954j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f35970a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35971b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ht(EditTextBoldCursor editTextBoldCursor) {
        this.f35971b = editTextBoldCursor;
    }
}
