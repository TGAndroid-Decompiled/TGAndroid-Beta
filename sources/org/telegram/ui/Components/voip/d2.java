package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class d2 extends FrameLayout {
    public static final int h = 0;
    public final float f39145a;
    public float f39146b;
    public float f39147c;
    public float d;
    public float f39148e;
    public final e2 f39149f;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f39149f = e2Var;
        this.f39145a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f39149f;
        e2Var.f39177r.setPivotX(e2Var.f39178s.getMeasuredWidth());
        e2Var.f39177r.setPivotY(e2Var.f39178s.getMeasuredHeight());
        e2Var.f39177r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39179w);
        e2Var.f39177r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39179w);
        e2Var.f39177r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.f39179w);
        e2Var.f39177r.setScaleX(((1.0f - e2Var.f39179w) * 0.6f) + 0.4f);
        e2Var.f39177r.setScaleY(((1.0f - e2Var.f39179w) * 0.6f) + 0.4f);
        e2Var.f39177r.setAlpha(Math.min(1.0f, 1.0f - e2Var.f39179w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39146b = org.telegram.messenger.g0.L(16.0f);
        this.f39147c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39148e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
