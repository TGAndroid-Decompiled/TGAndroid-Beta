package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class ot extends ShapeDrawable {
    public final int f27644a = 0;
    public final EditTextBoldCursor f27645b;

    public ot(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f27645b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27644a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f27645b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f27645b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f27644a) {
            case 0:
                i10 = this.f27645b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f10;
        switch (this.f27644a) {
            case 0:
                f10 = this.f27645b.cursorWidth;
                return AndroidUtilities.dp(f10);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public ot(EditTextBoldCursor editTextBoldCursor) {
        this.f27645b = editTextBoldCursor;
    }
}
