package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
public final class ft extends ShapeDrawable {
    public final int f35162a = 1;
    public final EditTextBoldCursor f35163b;

    public ft(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f35163b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f35162a) {
            case 0:
                super.draw(canvas);
                this.f35163b.H0 = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f35163b;
                if (editTextBoldCursor.f32912e1) {
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
        switch (this.f35162a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35163b.f32921j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f35162a) {
            case 1:
                return org.telegram.messenger.g0.L(this.f35163b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ft(EditTextBoldCursor editTextBoldCursor) {
        this.f35163b = editTextBoldCursor;
    }
}
