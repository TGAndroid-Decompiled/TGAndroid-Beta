package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ss extends ShapeDrawable {
    public final int f38112a = 1;
    public final EditTextBoldCursor f38113b;

    public ss(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f38113b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38112a) {
            case 0:
                super.draw(canvas);
                this.f38113b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38113b;
                if (editTextBoldCursor.f31332d1) {
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
        switch (this.f38112a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38113b.f31341i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38112a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38113b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.f38113b = editTextBoldCursor;
    }
}
