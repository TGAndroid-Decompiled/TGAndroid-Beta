package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class n80 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.c6 I0;
    public final m80 J0;
    public q80 K0;

    public n80(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J0 = new m80(this);
        this.I0 = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.J0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        m80 m80Var = this.J0;
        if (m80Var != null) {
            Layout layout = getLayout();
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 == null) {
                clickableSpan = null;
            } else {
                int layoutX = (int) (x8 - getLayoutX());
                int layoutY = (int) (y10 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f10 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f10);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft > f10 || layout2.getLineWidth(lineForVertical) + lineLeft < f10 || layoutY < 0 || layoutY > layout2.getHeight()) {
                    clickableSpan = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                        clickableSpan = null;
                    } else {
                        clickableSpan = clickableSpanArr[0];
                    }
                }
            }
            if (clickableSpan != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(clickableSpan, this.I0, motionEvent.getX(), motionEvent.getY(), 0);
                this.K0 = q80Var;
                m80Var.a(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.K0.f31841i);
                int spanEnd = spannableString.getSpanEnd(this.K0.f31841i);
                j80 j80VarB = this.K0.b();
                j80VarB.d(layout, spanStart, 0.0f);
                layout.getSelectionPath(spanStart, spanEnd, j80VarB);
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                q80 q80Var2 = this.K0;
                if (q80Var2 != null && (characterStyle = q80Var2.f31841i) == clickableSpan) {
                    if (characterStyle instanceof ClickableSpan) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.K0 = null;
                    return true;
                }
                this.K0 = null;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.K0 = null;
            }
        }
        return this.K0 != null || super.onTouchEvent(motionEvent);
    }
}
