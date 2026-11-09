package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ss extends ShapeDrawable {
    public final int f38147a = 1;
    public final EditTextBoldCursor f38148b;

    public ss(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f38148b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38147a) {
            case 0:
                super.draw(canvas);
                this.f38148b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38148b;
                if (editTextBoldCursor.f31342d1) {
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
        switch (this.f38147a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38148b.f31351i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38147a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38148b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.f38148b = editTextBoldCursor;
    }
}
