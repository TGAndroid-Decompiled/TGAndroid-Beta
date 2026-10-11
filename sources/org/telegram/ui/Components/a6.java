package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class a6 extends TextView {
    public int f24514a;
    public PorterDuffColorFilter f24515b;
    public x5 f24516c;

    public a6(Context context) {
        super(context);
        this.f24514a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24516c = b6.update(this.f24514a, this, this.f24516c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b6.release(this, this.f24516c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f7 = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f7 = 0.0f;
        }
        if (LocaleController.isRTL) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f10 = paddingLeft;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 == 0 && f10 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f10, f7);
        }
        b6.drawAnimatedEmojis(canvas2, getLayout(), this.f24516c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24515b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f24516c = b6.update(this.f24514a, this, this.f24516c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f24514a == i10) {
            return;
        }
        this.f24514a = i10;
        this.f24516c = b6.update(i10, this, this.f24516c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f24515b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f24516c = b6.update(this.f24514a, this, this.f24516c, getLayout());
    }
}
