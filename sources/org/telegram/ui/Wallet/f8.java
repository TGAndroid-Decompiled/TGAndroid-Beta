package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.is;
public final class f8 extends EditTextBoldCursor {
    public final org.telegram.ui.Components.g6 f34971b;
    public final org.telegram.ui.Components.g6 f34972c;
    public float d;
    public float f34973e;
    public final j8 f34974f;

    public f8(j8 j8Var, Context context) {
        super(context);
        this.f34974f = j8Var;
        this.f34971b = new org.telegram.ui.Components.g6(this, 180L, is.h);
        this.f34972c = new org.telegram.ui.Components.g6(this, 320L, j8.R);
        this.d = 1.0f;
    }

    @Override
    public final void drawCursor(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(AndroidUtilities.dpf2(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f7 = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.d) + f7);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.d) + f7);
        int i10 = bounds.left;
        int width = bounds.width();
        if (this.f34973e > 0.0f) {
            float f10 = i10;
            i10 = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f10) * this.f34973e) + f10);
        }
        gradientDrawable.setBounds(i10, round, width + i10, round2);
        super.drawCursor(canvas, gradientDrawable);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (i10 != i11) {
            this.f34974f.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 0) {
            this.f34974f.b();
            if (length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34972c.a(z10);
        }
        return super.onTouchEvent(motionEvent);
    }
}
