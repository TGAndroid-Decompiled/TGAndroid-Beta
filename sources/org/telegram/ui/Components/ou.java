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
public final class ou extends uh.o {
    public final j90 R;
    public n90 S;
    public boolean T;
    public boolean U;
    public boolean V;

    public ou(Context context) {
        super(context, null, true);
        this.R = new j90(this);
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
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingLeft;
        canvas.save();
        if (!this.T) {
            float f7 = 0.0f;
            if (this.U) {
                paddingLeft = 0.0f;
            } else {
                paddingLeft = getPaddingLeft();
            }
            if (!this.V) {
                f7 = getPaddingTop();
            }
            canvas.translate(paddingLeft, f7);
        }
        if (this.R.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        j90 j90Var = this.R;
        if (j90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                n90 n90Var = new n90(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.S = n90Var;
                j90Var.a(n90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.S.f25465i);
                int spanEnd = spannableString.getSpanEnd(this.S.f25465i);
                g90 b10 = this.S.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new dq(this, n90Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                j90Var.d(true);
                n90 n90Var2 = this.S;
                if (n90Var2 != null && (characterStyle = n90Var2.f25465i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.S = null;
                    return true;
                }
                this.S = null;
            }
            if (motionEvent.getAction() == 3) {
                j90Var.d(true);
                this.S = null;
            }
        }
        if (this.S != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void setDisablePaddingsOffset(boolean z10) {
        this.T = z10;
    }

    @Override
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.U = z10;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.V = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
