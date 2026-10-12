package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class a6 extends TextView {
    public int f24237a;
    public PorterDuffColorFilter f24238b;
    public x5 f24239c;

    public a6(Context context) {
        super(context);
        this.f24237a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24239c = b6.update(this.f24237a, this, this.f24239c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b6.release(this, this.f24239c);
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
        b6.drawAnimatedEmojis(canvas2, getLayout(), this.f24239c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24238b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f24239c = b6.update(this.f24237a, this, this.f24239c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f24237a == i10) {
            return;
        }
        this.f24237a = i10;
        this.f24239c = b6.update(i10, this, this.f24239c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f24238b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f24239c = b6.update(this.f24237a, this, this.f24239c, getLayout());
    }
}
