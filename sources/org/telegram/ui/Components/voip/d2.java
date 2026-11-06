package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class d2 extends FrameLayout {
    public static final int h = 0;
    public final float f39092a;
    public float f39093b;
    public float f39094c;
    public float d;
    public float f39095e;
    public final e2 f39096f;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f39096f = e2Var;
        this.f39092a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f39096f;
        e2Var.f39124r.setPivotX(e2Var.f39125s.getMeasuredWidth());
        e2Var.f39124r.setPivotY(e2Var.f39125s.getMeasuredHeight());
        e2Var.f39124r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39126w);
        e2Var.f39124r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39126w);
        e2Var.f39124r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.f39126w);
        e2Var.f39124r.setScaleX(((1.0f - e2Var.f39126w) * 0.6f) + 0.4f);
        e2Var.f39124r.setScaleY(((1.0f - e2Var.f39126w) * 0.6f) + 0.4f);
        e2Var.f39124r.setAlpha(Math.min(1.0f, 1.0f - e2Var.f39126w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39093b = org.telegram.messenger.g0.L(16.0f);
        this.f39094c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39095e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
