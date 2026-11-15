package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class h2 extends FrameLayout {
    public static final int h = 0;
    public final float f40639a;
    public float f40640b;
    public float f40641c;
    public float d;
    public float f40642e;
    public final i2 f40643f;

    public h2(i2 i2Var, Context context) {
        super(context);
        this.f40643f = i2Var;
        this.f40639a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.p0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i2 i2Var = this.f40643f;
        i2Var.f40660r.setPivotX(i2Var.f40661s.getMeasuredWidth());
        i2Var.f40660r.setPivotY(i2Var.f40661s.getMeasuredHeight());
        i2Var.f40660r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * i2Var.f40662w);
        i2Var.f40660r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * i2Var.f40662w);
        i2Var.f40660r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * i2Var.f40662w);
        i2Var.f40660r.setScaleX(((1.0f - i2Var.f40662w) * 0.6f) + 0.4f);
        i2Var.f40660r.setScaleY(((1.0f - i2Var.f40662w) * 0.6f) + 0.4f);
        i2Var.f40660r.setAlpha(Math.min(1.0f, 1.0f - i2Var.f40662w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f40640b = org.telegram.messenger.g0.L(16.0f);
        this.f40641c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f40642e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.h2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
