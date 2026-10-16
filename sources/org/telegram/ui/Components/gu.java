package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.messenger.AndroidUtilities;
public final class gu extends ShapeDrawable {
    public final int f25109a = 0;
    public final EditTextBoldCursor f25110b;

    public gu(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.f25110b = editTextBoldCursor;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f25109a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = this.f25110b;
                if (editTextBoldCursor.drawInMaim) {
                    editTextBoldCursor.cursorDrawn = true;
                    return;
                } else {
                    super.draw(canvas);
                    return;
                }
            default:
                super.draw(canvas);
                this.f25110b.cursorDrawn = true;
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        int i10;
        switch (this.f25109a) {
            case 0:
                i10 = this.f25110b.cursorSize;
                return AndroidUtilities.dp(i10 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        float f7;
        switch (this.f25109a) {
            case 0:
                f7 = this.f25110b.cursorWidth;
                return AndroidUtilities.dp(f7);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public gu(EditTextBoldCursor editTextBoldCursor) {
        this.f25110b = editTextBoldCursor;
    }
}
