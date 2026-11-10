package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class rs extends ShapeDrawable {
    public final int f37731a = 1;
    public final EditTextBoldCursor f37732b;

    public rs(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f37732b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f37731a) {
            case 0:
                super.draw(canvas);
                this.f37732b.G0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f37732b;
                if (editTextBoldCursor.f31353d1) {
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
        switch (this.f37731a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f37732b.f31362i0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f37731a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f37732b.E0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public rs(EditTextBoldCursor editTextBoldCursor) {
        this.f37732b = editTextBoldCursor;
    }
}
