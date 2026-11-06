package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ss extends ShapeDrawable {
    public final int f38152a = 1;
    public final EditTextBoldCursor f38153b;

    public ss(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f38153b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38152a) {
            case 0:
                super.draw(canvas);
                this.f38153b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38153b;
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
        switch (this.f38152a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38153b.f31341i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38152a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38153b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.f38153b = editTextBoldCursor;
    }
}
