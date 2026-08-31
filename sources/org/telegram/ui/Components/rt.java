package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class rt extends ShapeDrawable {
    public final int f30842a = 0;
    public final EditTextBoldCursor f30843b;

    public rt(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f30843b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30842a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f30843b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f30843b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f30842a) {
            case 0:
                i10 = this.f30843b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f10;
        switch (this.f30842a) {
            case 0:
                f10 = this.f30843b.cursorWidth;
                return AndroidUtilities.dp(f10);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public rt(EditTextBoldCursor editTextBoldCursor) {
        this.f30843b = editTextBoldCursor;
    }
}
