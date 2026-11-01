package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class xr extends View implements org.telegram.ui.ActionBar.k6 {
    public final fe.b f32626a;
    public final Paint f32627b;
    public final RectF f32628c;
    public final RectF d;
    public final RectF e;
    public final ho f32629f;

    public xr(Context context) {
        super(context);
        this.f32626a = new fe.b(this, gr.h, 380L);
        this.f32627b = new Paint(1);
        this.f32628c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f32629f = new ho(this, 7);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.h3(this.f32629f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.f32629f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f32626a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f32628c;
        RectF rectF3 = this.e;
        org.telegram.messenger.i0.Z1(rectF, rectF2, f7, rectF3);
        float W1 = org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, W1, W1, this.f32627b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f32628c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - org.telegram.messenger.i0.L(15.0f);
        int L2 = org.telegram.messenger.i0.L(12.0f);
        this.d.set(org.telegram.messenger.i0.L(12.0f), L, org.telegram.messenger.i0.L(30.0f) + L2, org.telegram.messenger.i0.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.f32627b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
