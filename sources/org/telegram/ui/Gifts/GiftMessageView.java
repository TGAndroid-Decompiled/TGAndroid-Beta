package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

public class GiftMessageView extends View {
    private final GiftMessageDrawable drawable;

    public GiftMessageView(Context context) {
        super(context);
        GiftMessageDrawable giftMessageDrawable = new GiftMessageDrawable();
        this.drawable = giftMessageDrawable;
        giftMessageDrawable.setParentView(this);
    }

    public void setMessage(CharSequence charSequence) {
        this.drawable.setMessage(charSequence);
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.drawable.setUser(tLObject);
        invalidate();
    }

    public GiftMessageDrawable getDrawable() {
        return this.drawable;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.drawable.measure((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight());
        setMeasuredDimension(this.drawable.getMinimumWidth() + getPaddingLeft() + getPaddingRight(), this.drawable.getMinimumHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.drawable.draw(canvas);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drawable.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drawable.detach();
    }

    public TextPaint getTextPaint() {
        return this.drawable.getTextPaint();
    }
}
