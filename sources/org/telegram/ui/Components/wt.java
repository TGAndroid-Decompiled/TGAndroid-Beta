package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class wt extends ShapeDrawable {
    public final int f30053a = 0;
    public final EditTextBoldCursor f30054b;

    public wt(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f30054b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30053a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f30054b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f30054b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f30053a) {
            case 0:
                i10 = this.f30054b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f7;
        switch (this.f30053a) {
            case 0:
                f7 = this.f30054b.cursorWidth;
                return AndroidUtilities.dp(f7);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public wt(EditTextBoldCursor editTextBoldCursor) {
        this.f30054b = editTextBoldCursor;
    }
}
