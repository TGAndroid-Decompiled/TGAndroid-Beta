package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class d2 extends FrameLayout {
    public static final int h = 0;
    public final float f39154a;
    public float f39155b;
    public float f39156c;
    public float d;
    public float f39157e;
    public final e2 f39158f;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f39158f = e2Var;
        this.f39154a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f39158f;
        e2Var.f39186r.setPivotX(e2Var.f39187s.getMeasuredWidth());
        e2Var.f39186r.setPivotY(e2Var.f39187s.getMeasuredHeight());
        e2Var.f39186r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39188w);
        e2Var.f39186r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39188w);
        e2Var.f39186r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.f39188w);
        e2Var.f39186r.setScaleX(((1.0f - e2Var.f39188w) * 0.6f) + 0.4f);
        e2Var.f39186r.setScaleY(((1.0f - e2Var.f39188w) * 0.6f) + 0.4f);
        e2Var.f39186r.setAlpha(Math.min(1.0f, 1.0f - e2Var.f39188w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39155b = org.telegram.messenger.g0.L(16.0f);
        this.f39156c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39157e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
