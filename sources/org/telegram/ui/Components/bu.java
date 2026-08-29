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
public final class bu extends gh.s {
    public final v80 N;
    public z80 O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public bu(Context context) {
        super(context, null, true);
        this.N = new v80(this);
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
        float f9 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f9);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f9 && layout.getLineWidth(lineForVertical) + lineLeft >= f9 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
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
        if (!this.P) {
            float f9 = 0.0f;
            if (this.Q) {
                paddingLeft = 0.0f;
            } else {
                paddingLeft = getPaddingLeft();
            }
            if (!this.R) {
                f9 = getPaddingTop();
            }
            canvas.translate(paddingLeft, f9);
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
        v80 v80Var = this.N;
        if (v80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                z80 z80Var = new z80(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.O = z80Var;
                v80Var.a(z80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.O.f35285i);
                int spanEnd = spannableString.getSpanEnd(this.O.f35285i);
                s80 b10 = this.O.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new rp(this, z80Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                v80Var.d(true);
                z80 z80Var2 = this.O;
                if (z80Var2 != null && (characterStyle = z80Var2.f35285i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.O = null;
                    return true;
                }
                this.O = null;
            }
            if (motionEvent.getAction() == 3) {
                v80Var.d(true);
                this.O = null;
            }
        }
        if (this.O != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
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
