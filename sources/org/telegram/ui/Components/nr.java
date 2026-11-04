package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class nr extends View implements org.telegram.ui.ActionBar.z5 {
    public final qe.a f36607a;
    public final Paint f36608b;
    public final RectF f36609c;
    public final RectF d;
    public final RectF f36610e;
    public final gp f36611f;

    public nr(Context context) {
        super(context);
        this.f36607a = new qe.a(this, xq.h, 380L);
        this.f36608b = new Paint(1);
        this.f36609c = new RectF();
        this.d = new RectF();
        this.f36610e = new RectF();
        this.f36611f = new gp(this, 5);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.f36611f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f36611f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f36607a.f53840e;
        RectF rectF = this.d;
        RectF rectF2 = this.f36609c;
        RectF rectF3 = this.f36610e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.f36608b);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f36609c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        this.d.set(org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(30.0f) + L2, org.telegram.messenger.g0.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.f36608b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
