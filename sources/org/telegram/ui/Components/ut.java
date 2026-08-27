package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

public final class ut extends eh.s {
    public final m80 N;
    public q80 O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public ut(Context context) {
        super(context, null, true);
        this.N = new m80(this);
    }

    @Override
    public final ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.P) {
            canvas.translate(this.Q ? 0.0f : getPaddingLeft(), this.R ? 0.0f : getPaddingTop());
        }
        if (this.N.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m80 m80Var = this.N;
        if (m80Var != null) {
            Layout layout = getLayout();
            ClickableSpan clickableSpanA = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanA != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(clickableSpanA, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.O = q80Var;
                m80Var.a(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.O.f31841i);
                int spanEnd = spannableString.getSpanEnd(this.O.f31841i);
                j80 j80VarB = this.O.b();
                j80VarB.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, j80VarB);
                AndroidUtilities.runOnUIThread(new lp(this, q80Var, clickableSpanA), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                q80 q80Var2 = this.O;
                if (q80Var2 != null && (characterStyle = q80Var2.f31841i) == clickableSpanA) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.O = null;
                    return true;
                }
                this.O = null;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.O = null;
            }
        }
        return this.O != null || super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDisablePaddingsOffset(boolean z10) {
        this.P = z10;
    }

    @Override
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.Q = z10;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.R = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
