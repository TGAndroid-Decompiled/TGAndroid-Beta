package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ft extends ShapeDrawable {
    public final int f26215a = 1;
    public final EditTextBoldCursor f26216b;

    public ft(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f26216b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f26215a) {
            case 0:
                super.draw(canvas);
                this.f26216b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f26216b;
                if (editTextBoldCursor.f23990d1) {
                    editTextBoldCursor.G0 = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f26215a) {
            case 1:
                return org.telegram.messenger.i0.L(this.f26216b.f23999i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f26215a) {
            case 1:
                return org.telegram.messenger.i0.L(this.f26216b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ft(EditTextBoldCursor editTextBoldCursor) {
        this.f26216b = editTextBoldCursor;
    }
}
