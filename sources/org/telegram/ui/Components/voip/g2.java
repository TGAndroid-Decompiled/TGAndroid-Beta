package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout {
    public static final int h = 0;
    public final float f40977a;
    public float f40978b;
    public float f40979c;
    public float d;
    public float f40980e;
    public final h2 f40981f;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f40981f = h2Var;
        this.f40977a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f40981f;
        h2Var.f41006r.setPivotX(h2Var.f41007s.getMeasuredWidth());
        h2Var.f41006r.setPivotY(h2Var.f41007s.getMeasuredHeight());
        h2Var.f41006r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41008w);
        h2Var.f41006r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41008w);
        h2Var.f41006r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.f41008w);
        h2Var.f41006r.setScaleX(((1.0f - h2Var.f41008w) * 0.6f) + 0.4f);
        h2Var.f41006r.setScaleY(((1.0f - h2Var.f41008w) * 0.6f) + 0.4f);
        h2Var.f41006r.setAlpha(Math.min(1.0f, 1.0f - h2Var.f41008w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f40978b = org.telegram.messenger.g0.L(16.0f);
        this.f40979c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f40980e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
