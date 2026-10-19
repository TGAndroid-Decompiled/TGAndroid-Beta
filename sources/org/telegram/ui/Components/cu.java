package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class cu extends ShapeDrawable {
    public final int f25341a = 0;
    public final EditTextBoldCursor f25342b;

    public cu(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f25342b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f25341a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f25342b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f25342b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f25341a) {
            case 0:
                i10 = this.f25342b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f7;
        switch (this.f25341a) {
            case 0:
                f7 = this.f25342b.cursorWidth;
                return AndroidUtilities.dp(f7);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public cu(EditTextBoldCursor editTextBoldCursor) {
        this.f25342b = editTextBoldCursor;
    }
}
