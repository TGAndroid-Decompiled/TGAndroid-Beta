package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class t1 extends FrameLayout {
    public static final int h = 0;
    public final float f31736a;
    public float f31737b;
    public float f31738c;
    public float d;
    public float e;
    public final u1 f31739f;

    public t1(u1 u1Var, Context context) {
        super(context);
        this.f31739f = u1Var;
        this.f31736a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.d2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u1 u1Var = this.f31739f;
        u1Var.f31751r.setPivotX(u1Var.f31752s.getMeasuredWidth());
        u1Var.f31751r.setPivotY(u1Var.f31752s.getMeasuredHeight());
        u1Var.f31751r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.i0.L(4.0f)) * u1Var.f31753w);
        u1Var.f31751r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.i0.L(4.0f)) * u1Var.f31753w);
        u1Var.f31751r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.i0.L(8.0f) * u1Var.f31753w);
        u1Var.f31751r.setScaleX(((1.0f - u1Var.f31753w) * 0.6f) + 0.4f);
        u1Var.f31751r.setScaleY(((1.0f - u1Var.f31753w) * 0.6f) + 0.4f);
        u1Var.f31751r.setAlpha(Math.min(1.0f, 1.0f - u1Var.f31753w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31737b = org.telegram.messenger.i0.L(16.0f);
        this.f31738c = org.telegram.messenger.i0.L(16.0f);
        this.d = org.telegram.messenger.i0.L(60.0f);
        this.e = org.telegram.messenger.i0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
