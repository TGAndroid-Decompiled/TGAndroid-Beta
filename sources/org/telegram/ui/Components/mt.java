package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class mt extends ShapeDrawable {
    public final int f30761a = 0;
    public final EditTextBoldCursor f30762b;

    public mt(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f30762b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30761a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f30762b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f30762b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f30761a) {
            case 0:
                i10 = this.f30762b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f9;
        switch (this.f30761a) {
            case 0:
                f9 = this.f30762b.cursorWidth;
                return AndroidUtilities.dp(f9);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public mt(EditTextBoldCursor editTextBoldCursor) {
        this.f30762b = editTextBoldCursor;
    }
}
