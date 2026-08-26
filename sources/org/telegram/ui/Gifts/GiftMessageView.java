package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.AnimatedEmojiSpan;

public final class GiftMessageView extends View {
    public final GiftMessageDrawable drawable;

    public GiftMessageView(Context context) {
        super(context);
        GiftMessageDrawable giftMessageDrawable = new GiftMessageDrawable();
        this.drawable = giftMessageDrawable;
        giftMessageDrawable.parentView = this;
        giftMessageDrawable.avatarReceiver.setParentView(this);
    }

    public GiftMessageDrawable getDrawable() {
        return this.drawable;
    }

    public TextPaint getTextPaint() {
        return this.drawable.textPaint;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drawable.avatarReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftMessageDrawable giftMessageDrawable = this.drawable;
        giftMessageDrawable.avatarReceiver.onDetachedFromWindow();
        AnimatedEmojiSpan.release((View) null, giftMessageDrawable.emojiGroupedSpans);
        giftMessageDrawable.emojiGroupedSpans = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        GiftMessageDrawable giftMessageDrawable = this.drawable;
        giftMessageDrawable.setBounds(paddingLeft, paddingTop, width, height);
        giftMessageDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        GiftMessageDrawable giftMessageDrawable = this.drawable;
        giftMessageDrawable.measure(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + giftMessageDrawable.measuredWidth, getPaddingBottom() + getPaddingTop() + giftMessageDrawable.measuredHeight);
    }

    public void setMessage(CharSequence charSequence) {
        GiftMessageDrawable giftMessageDrawable = this.drawable;
        giftMessageDrawable.message = charSequence;
        giftMessageDrawable.lastMeasuredWidth = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.drawable.setUser(tLObject);
        invalidate();
    }
}
