package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class mr extends View implements org.telegram.ui.ActionBar.c6 {
    public final te.a f36072a;
    public final Paint f36073b;
    public final RectF f36074c;
    public final RectF d;
    public final RectF f36075e;
    public final gp f36076f;

    public mr(Context context) {
        super(context);
        this.f36072a = new te.a(this, wq.h, 380L);
        this.f36073b = new Paint(1);
        this.f36074c = new RectF();
        this.d = new RectF();
        this.f36075e = new RectF();
        this.f36076f = new gp(this, 5);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.f36076f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f36076f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f36072a.f55498e;
        RectF rectF = this.d;
        RectF rectF2 = this.f36074c;
        RectF rectF3 = this.f36075e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.f36073b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f36074c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        this.d.set(org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(30.0f) + L2, org.telegram.messenger.g0.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.f36073b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
