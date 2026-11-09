package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class d2 extends FrameLayout {
    public static final int h = 0;
    public final float f39234a;
    public float f39235b;
    public float f39236c;
    public float d;
    public float f39237e;
    public final e2 f39238f;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f39238f = e2Var;
        this.f39234a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f39238f;
        e2Var.f39266r.setPivotX(e2Var.f39267s.getMeasuredWidth());
        e2Var.f39266r.setPivotY(e2Var.f39267s.getMeasuredHeight());
        e2Var.f39266r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39268w);
        e2Var.f39266r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39268w);
        e2Var.f39266r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.f39268w);
        e2Var.f39266r.setScaleX(((1.0f - e2Var.f39268w) * 0.6f) + 0.4f);
        e2Var.f39266r.setScaleY(((1.0f - e2Var.f39268w) * 0.6f) + 0.4f);
        e2Var.f39266r.setAlpha(Math.min(1.0f, 1.0f - e2Var.f39268w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39235b = org.telegram.messenger.g0.L(16.0f);
        this.f39236c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39237e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
