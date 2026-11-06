package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ss extends ShapeDrawable {
    public final int f38116a = 1;
    public final EditTextBoldCursor f38117b;

    public ss(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f38117b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38116a) {
            case 0:
                super.draw(canvas);
                this.f38117b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38117b;
                if (editTextBoldCursor.f31333d1) {
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
        switch (this.f38116a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38117b.f31342i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38116a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38117b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.f38117b = editTextBoldCursor;
    }
}
