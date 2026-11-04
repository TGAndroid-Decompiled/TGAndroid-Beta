package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
public final class h9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.u5 H1;
    public final org.telegram.ui.Components.u5 I1;
    public float J1;
    public float K1;
    public final l9 L1;

    public h9(l9 l9Var, Context context) {
        super(context);
        this.L1 = l9Var;
        this.H1 = new org.telegram.ui.Components.u5(this, 180L, xq.h);
        this.I1 = new org.telegram.ui.Components.u5(this, 320L, l9.T);
        this.J1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.J1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.J1) + f10);
        int i3 = bounds.left;
        int width = bounds.width();
        if (this.K1 > 0.0f) {
            float f11 = i3;
            i3 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.K1) + f11);
        }
        gradientDrawable.setBounds(i3, round, width + i3, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        if (i3 != i10) {
            this.L1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 0) {
            this.L1.b();
            if (length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I1.a(z10);
        }
        return super.onTouchEvent(motionEvent);
    }
}
