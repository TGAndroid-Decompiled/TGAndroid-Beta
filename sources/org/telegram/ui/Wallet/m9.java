package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
public final class m9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.t5 G1;
    public final org.telegram.ui.Components.t5 H1;
    public float I1;
    public float J1;
    public final q9 K1;

    public m9(q9 q9Var, Context context) {
        super(context);
        this.K1 = q9Var;
        this.G1 = new org.telegram.ui.Components.t5(this, 180L, gr.h);
        this.H1 = new org.telegram.ui.Components.t5(this, 320L, q9.S);
        this.I1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f7 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.I1) + f7);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.I1) + f7);
        int i10 = bounds.left;
        int width = bounds.width();
        if (this.J1 > 0.0f) {
            float f10 = i10;
            i10 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f10) * this.J1) + f10);
        }
        gradientDrawable.setBounds(i10, round, width + i10, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (i10 != i11) {
            this.K1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 0) {
            this.K1.b();
            if (length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H1.a(z10);
        }
        return super.onTouchEvent(motionEvent);
    }
}
