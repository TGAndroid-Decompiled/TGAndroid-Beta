package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kr;
public final class z9 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.c6 M1;
    public final org.telegram.ui.Components.c6 N1;
    public float O1;
    public float P1;
    public final da Q1;

    public z9(da daVar, Context context) {
        super(context);
        this.Q1 = daVar;
        this.M1 = new org.telegram.ui.Components.c6(this, 180L, kr.h);
        this.N1 = new org.telegram.ui.Components.c6(this, 320L, da.T);
        this.O1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f10 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.O1) + f10);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.O1) + f10);
        int i7 = bounds.left;
        int width = bounds.width();
        if (this.P1 > 0.0f) {
            float f11 = i7;
            i7 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f11) * this.P1) + f11);
        }
        gradientDrawable.setBounds(i7, round, width + i7, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (i7 != i10) {
            this.Q1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 0) {
            this.Q1.b();
            if (length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N1.a(z10);
        }
        return super.onTouchEvent(motionEvent);
    }
}
