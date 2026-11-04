package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ss extends ShapeDrawable {
    public final int f38114a = 1;
    public final EditTextBoldCursor f38115b;

    public ss(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f38115b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38114a) {
            case 0:
                super.draw(canvas);
                this.f38115b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f38115b;
                if (editTextBoldCursor.f31409e1) {
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
        switch (this.f38114a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38115b.f31418j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38114a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f38115b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ss(EditTextBoldCursor editTextBoldCursor) {
        this.f38115b = editTextBoldCursor;
    }
}
