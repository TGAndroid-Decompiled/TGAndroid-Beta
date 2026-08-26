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
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public final class EffectsTextView extends SpoilersTextView {
    public boolean disablePaddingsOffset;
    public boolean disablePaddingsOffsetX;
    public boolean disablePaddingsOffsetY;
    public final LinkSpanDrawable.LinkCollector links;
    public LinkSpanDrawable pressedLink;

    public EffectsTextView(Context context) {
        super(context, null, true);
        this.links = new LinkSpanDrawable.LinkCollector(this);
    }

    @Override
    public final ClickableSpan hit(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i - getPaddingLeft();
        int paddingTop = i2 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
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
        if (!this.disablePaddingsOffset) {
            canvas.translate(this.disablePaddingsOffsetX ? 0.0f : getPaddingLeft(), this.disablePaddingsOffsetY ? 0.0f : getPaddingTop());
        }
        if (this.links.draw(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            Layout layout = getLayout();
            ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, null, motionEvent.getX(), motionEvent.getY());
                this.pressedLink = linkSpanDrawable;
                linkCollector.addLink(linkSpanDrawable, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.pressedLink.mSpan);
                int spanEnd = spannableString.getSpanEnd(this.pressedLink.mSpan);
                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, linkSpanDrawable, clickableSpanHit), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                linkCollector.clear(true);
                LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable2 != null && (characterStyle = linkSpanDrawable2.mSpan) == clickableSpanHit) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.pressedLink = null;
                    return true;
                }
                this.pressedLink = null;
            }
            if (motionEvent.getAction() == 3) {
                linkCollector.clear(true);
                this.pressedLink = null;
            }
        }
        return this.pressedLink != null || super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDisablePaddingsOffset(boolean z) {
        this.disablePaddingsOffset = z;
    }

    @Override
    public void setDisablePaddingsOffsetX(boolean z) {
        this.disablePaddingsOffsetX = z;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z) {
        this.disablePaddingsOffsetY = z;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
