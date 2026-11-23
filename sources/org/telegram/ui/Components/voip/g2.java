package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout {
    public static final int h = 0;
    public final float f41016a;
    public float f41017b;
    public float f41018c;
    public float d;
    public float f41019e;
    public final h2 f41020f;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f41020f = h2Var;
        this.f41016a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f41020f;
        h2Var.f41045r.setPivotX(h2Var.f41046s.getMeasuredWidth());
        h2Var.f41045r.setPivotY(h2Var.f41046s.getMeasuredHeight());
        h2Var.f41045r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41047w);
        h2Var.f41045r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41047w);
        h2Var.f41045r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.f41047w);
        h2Var.f41045r.setScaleX(((1.0f - h2Var.f41047w) * 0.6f) + 0.4f);
        h2Var.f41045r.setScaleY(((1.0f - h2Var.f41047w) * 0.6f) + 0.4f);
        h2Var.f41045r.setAlpha(Math.min(1.0f, 1.0f - h2Var.f41047w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f41017b = org.telegram.messenger.g0.L(16.0f);
        this.f41018c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f41019e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
