package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class zr extends View implements org.telegram.ui.ActionBar.c6 {
    public final te.a f43026a;
    public final Paint f43027b;
    public final RectF f43028c;
    public final RectF d;
    public final RectF f43029e;
    public final lo f43030f;

    public zr(Context context) {
        super(context);
        this.f43026a = new te.a(this, kr.h, 380L);
        this.f43027b = new Paint(1);
        this.f43028c = new RectF();
        this.d = new RectF();
        this.f43029e = new RectF();
        this.f43030f = new lo(this, 7);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.f43030f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f43030f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f43026a.f57779e;
        RectF rectF = this.d;
        RectF rectF2 = this.f43028c;
        RectF rectF3 = this.f43029e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.f43027b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f43028c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        this.d.set(org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(30.0f) + L2, org.telegram.messenger.g0.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.f43027b.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
