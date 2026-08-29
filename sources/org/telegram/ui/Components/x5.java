package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class x5 extends TextView {
    public int f34572a;
    public PorterDuffColorFilter f34573b;
    public u5 f34574c;

    public x5(Context context) {
        super(context);
        this.f34572a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34574c = y5.update(this.f34572a, this, this.f34574c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y5.release(this, this.f34574c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f9;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f9 = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f9 = 0.0f;
        }
        if (LocaleController.isRTL) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f10 = paddingLeft;
        int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i10 == 0 && f10 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f10, f9);
        }
        y5.drawAnimatedEmojis(canvas2, getLayout(), this.f34574c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f34573b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f34574c = y5.update(this.f34572a, this, this.f34574c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f34572a == i10) {
            return;
        }
        this.f34572a = i10;
        this.f34574c = y5.update(i10, this, this.f34574c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f34573b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f34574c = y5.update(this.f34572a, this, this.f34574c, getLayout());
    }
}
