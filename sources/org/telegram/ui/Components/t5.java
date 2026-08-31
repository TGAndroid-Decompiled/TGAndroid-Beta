package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class t5 extends TextView {
    public int f31261a;
    public PorterDuffColorFilter f31262b;
    public q5 f31263c;

    public t5(Context context) {
        super(context);
        this.f31261a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31263c = u5.update(this.f31261a, this, this.f31263c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u5.release(this, this.f31263c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f10 = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f10 = 0.0f;
        }
        if (LocaleController.isRTL) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f11 = paddingLeft;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 == 0 && f11 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f11, f10);
        }
        u5.drawAnimatedEmojis(canvas2, getLayout(), this.f31263c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f31262b);
        if (i10 == 0 && f11 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31263c = u5.update(this.f31261a, this, this.f31263c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f31261a == i10) {
            return;
        }
        this.f31261a = i10;
        this.f31263c = u5.update(i10, this, this.f31263c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f31262b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f31263c = u5.update(this.f31261a, this, this.f31263c, getLayout());
    }
}
