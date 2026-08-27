package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;

public final class et extends ShapeDrawable {

    public final int f28147a = 0;

    public final EditTextBoldCursor f28148b;

    public et(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f28148b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f28147a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f28148b;
                if (!editTextBoldCursor.drawInMaim) {
                    super.draw(canvas);
                } else {
                    editTextBoldCursor.cursorDrawn = true;
                }
                break;
            default:
                super.draw(canvas);
                this.f28148b.cursorDrawn = true;
                break;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f28147a) {
            case 0:
                return AndroidUtilities.dp(this.f28148b.cursorSize + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f28147a) {
            case 0:
                return AndroidUtilities.dp(this.f28148b.cursorWidth);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public et(EditTextBoldCursor editTextBoldCursor) {
        this.f28148b = editTextBoldCursor;
    }
}
