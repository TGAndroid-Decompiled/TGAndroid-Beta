package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public final class i9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.w5 G1;
    public final org.telegram.ui.Components.w5 H1;
    public float I1;
    public float J1;
    public final m9 K1;

    public i9(m9 m9Var, Context context) {
        super(context);
        this.K1 = m9Var;
        this.G1 = new org.telegram.ui.Components.w5(this, 180L, xq.h);
        this.H1 = new org.telegram.ui.Components.w5(this, 320L, m9.S);
        this.I1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.I1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.I1) + f10);
        int i7 = bounds.left;
        int width = bounds.width();
        if (this.J1 > 0.0f) {
            float f11 = i7;
            i7 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.J1) + f11);
        }
        gradientDrawable.setBounds(i7, round, width + i7, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (i7 != i10) {
            this.K1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (motionEvent.getActionMasked() == 0) {
            this.K1.b();
            if (length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.H1.a(z9);
        }
        return super.onTouchEvent(motionEvent);
    }
}
