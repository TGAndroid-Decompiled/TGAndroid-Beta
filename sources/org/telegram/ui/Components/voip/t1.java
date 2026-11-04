package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class t1 extends FrameLayout {
    public static final int h = 0;
    public final float f39611a;
    public float f39612b;
    public float f39613c;
    public float d;
    public float f39614e;
    public final u1 f39615f;

    public t1(u1 u1Var, Context context) {
        super(context);
        this.f39615f = u1Var;
        this.f39611a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new cg.p0(21));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u1 u1Var = this.f39615f;
        u1Var.f39627r.setPivotX(u1Var.f39628s.getMeasuredWidth());
        u1Var.f39627r.setPivotY(u1Var.f39628s.getMeasuredHeight());
        u1Var.f39627r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * u1Var.f39629w);
        u1Var.f39627r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * u1Var.f39629w);
        u1Var.f39627r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * u1Var.f39629w);
        u1Var.f39627r.setScaleX(((1.0f - u1Var.f39629w) * 0.6f) + 0.4f);
        u1Var.f39627r.setScaleY(((1.0f - u1Var.f39629w) * 0.6f) + 0.4f);
        u1Var.f39627r.setAlpha(Math.min(1.0f, 1.0f - u1Var.f39629w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f39612b = org.telegram.messenger.g0.L(16.0f);
        this.f39613c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39614e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
