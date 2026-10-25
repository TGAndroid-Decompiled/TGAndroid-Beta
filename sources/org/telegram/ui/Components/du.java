package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class du extends ShapeDrawable {
    public final int f27602a = 0;
    public final EditTextBoldCursor f27603b;

    public du(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f27603b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27602a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27603b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f27603b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f27602a) {
            case 0:
                i10 = this.f27603b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f7;
        switch (this.f27602a) {
            case 0:
                f7 = this.f27603b.cursorWidth;
                return AndroidUtilities.dp(f7);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public du(EditTextBoldCursor editTextBoldCursor) {
        this.f27603b = editTextBoldCursor;
    }
}
