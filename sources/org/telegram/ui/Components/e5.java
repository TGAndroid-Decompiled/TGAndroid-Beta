package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.text.TextUtils;
public abstract class e5 extends f80 implements te.b {
    public final te.c Q0;
    public Picture R0;
    public float S0;
    public int T0;
    public Paint U0;

    public e5(Context context) {
        super(context);
        this.Q0 = new te.c(0, this, kr.h, 320L, 1.0f);
        this.T0 = 0;
    }

    @Override
    public final void G(float f10, int i7) {
        if (f10 == 1.0f) {
            if (this.R0 != null) {
                this.R0 = null;
                super.setLayerType(this.T0, this.U0);
            }
            invalidate();
        }
    }

    @Override
    public int getLayerType() {
        return this.T0;
    }

    public final void n(Canvas canvas, float f10, float f11) {
        if (f10 >= 1.0f && f11 == 0.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f));
        super.onDraw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final boolean o(CharSequence charSequence, boolean z10) {
        CharSequence text = getText();
        if (TextUtils.equals(text, charSequence)) {
            return l(charSequence, false);
        }
        te.c cVar = this.Q0;
        if (z10 && isAttachedToWindow() && isLaidOut() && getVisibility() == 0 && getAlpha() > 0.0f && getWidth() > 0 && getHeight() > 0 && !TextUtils.isEmpty(text)) {
            Picture picture = new Picture();
            n(picture.beginRecording(getWidth(), getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            cVar.c(0.0f);
            this.R0 = picture;
            this.S0 = getTranslationX();
            super.setLayerType(0, null);
            cVar.a(1.0f);
        } else {
            cVar.c(1.0f);
            if (this.R0 != null) {
                this.R0 = null;
                super.setLayerType(this.T0, this.U0);
            }
            invalidate();
        }
        invalidate();
        return l(charSequence, false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.R0 == null) {
            super.onDraw(canvas);
            return;
        }
        float f10 = this.Q0.f57785f;
        int L = org.telegram.messenger.g0.L(6.0f);
        canvas.save();
        canvas.translate(this.S0 - getTranslationX(), (-L) * f10);
        float f11 = 1.0f - f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.R0.getWidth(), this.R0.getHeight(), (int) (255.0f * f11));
        canvas.drawPicture(this.R0);
        canvas.restore();
        canvas.restore();
        n(canvas, f10, L * f11);
    }

    @Override
    public final void setLayerType(int i7, Paint paint) {
        this.T0 = i7;
        this.U0 = paint;
        if (this.R0 == null) {
            super.setLayerType(i7, paint);
        }
    }
}
